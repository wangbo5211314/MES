package com.ruoyi.web.controller.chujian;

import java.util.List;

import com.ruoyi.chujian.domain.DetectPoweronResult;
import com.ruoyi.chujian.service.IDetectPoweronResultService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 上电初检Controller
 * 
 * @author wangbo
 * @date 2020-12-15
 */
@Controller
@RequestMapping("/chujian/poweronresult")
public class DetectPoweronResultController extends BaseController
{
    private String prefix = "chujian/poweronresult";

    @Autowired
    private IDetectPoweronResultService detectPoweronResultService;

    @RequiresPermissions("chujian:poweronresult:view")
    @GetMapping()
    public String poweronresult()
    {
        return prefix + "/poweronresult";
    }

    /**
     * 查询上电初检列表
     */
    @RequiresPermissions("chujian:poweronresult:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DetectPoweronResult detectPoweronResult)
    {
        startPage();
        List<DetectPoweronResult> list = detectPoweronResultService.selectDetectPoweronResultList(detectPoweronResult);
        return getDataTable(list);
    }

    /**
     * 导出上电初检列表
     */
    @RequiresPermissions("chujian:poweronresult:export")
    @Log(title = "上电初检", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DetectPoweronResult detectPoweronResult)
    {
        List<DetectPoweronResult> list = detectPoweronResultService.selectDetectPoweronResultList(detectPoweronResult);
        ExcelUtil<DetectPoweronResult> util = new ExcelUtil<DetectPoweronResult>(DetectPoweronResult.class);
        return util.exportExcel(list, "poweronresult");
    }

    /**
     * 新增上电初检
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存上电初检
     */
    @RequiresPermissions("chujian:poweronresult:add")
    @Log(title = "上电初检", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DetectPoweronResult detectPoweronResult)
    {
        return toAjax(detectPoweronResultService.insertDetectPoweronResult(detectPoweronResult));
    }

    /**
     * 修改上电初检
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DetectPoweronResult detectPoweronResult = detectPoweronResultService.selectDetectPoweronResultById(id);
        mmap.put("detectPoweronResult", detectPoweronResult);
        return prefix + "/edit";
    }

    /**
     * 修改保存上电初检
     */
    @RequiresPermissions("chujian:poweronresult:edit")
    @Log(title = "上电初检", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DetectPoweronResult detectPoweronResult)
    {
        return toAjax(detectPoweronResultService.updateDetectPoweronResult(detectPoweronResult));
    }

    /**
     * 删除上电初检
     */
    @RequiresPermissions("chujian:poweronresult:remove")
    @Log(title = "上电初检", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(detectPoweronResultService.deleteDetectPoweronResultByIds(ids));
    }
}
