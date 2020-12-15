package com.ruoyi.web.controller.jiance;

import java.util.List;

import com.ruoyi.jiance.domain.DetectVoltResult;
import com.ruoyi.jiance.service.IDetectVoltResultService;
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
 * 耐压Controller
 * 
 * @author wangbo
 * @date 2020-12-15
 */
@Controller
@RequestMapping("/jiance/voltresult")
public class DetectVoltResultController extends BaseController
{
    private String prefix = "jiance/voltresult";

    @Autowired
    private IDetectVoltResultService detectVoltResultService;

    @RequiresPermissions("jiance:voltresult:view")
    @GetMapping()
    public String voltresult()
    {
        return prefix + "/voltresult";
    }

    /**
     * 查询耐压列表
     */
    @RequiresPermissions("jiance:voltresult:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DetectVoltResult detectVoltResult)
    {
        startPage();
        List<DetectVoltResult> list = detectVoltResultService.selectDetectVoltResultList(detectVoltResult);
        return getDataTable(list);
    }

    /**
     * 导出耐压列表
     */
    @RequiresPermissions("jiance:voltresult:export")
    @Log(title = "耐压", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DetectVoltResult detectVoltResult)
    {
        List<DetectVoltResult> list = detectVoltResultService.selectDetectVoltResultList(detectVoltResult);
        ExcelUtil<DetectVoltResult> util = new ExcelUtil<DetectVoltResult>(DetectVoltResult.class);
        return util.exportExcel(list, "voltresult");
    }

    /**
     * 新增耐压
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存耐压
     */
    @RequiresPermissions("jiance:voltresult:add")
    @Log(title = "耐压", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DetectVoltResult detectVoltResult)
    {
        return toAjax(detectVoltResultService.insertDetectVoltResult(detectVoltResult));
    }

    /**
     * 修改耐压
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DetectVoltResult detectVoltResult = detectVoltResultService.selectDetectVoltResultById(id);
        mmap.put("detectVoltResult", detectVoltResult);
        return prefix + "/edit";
    }

    /**
     * 修改保存耐压
     */
    @RequiresPermissions("jiance:voltresult:edit")
    @Log(title = "耐压", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DetectVoltResult detectVoltResult)
    {
        return toAjax(detectVoltResultService.updateDetectVoltResult(detectVoltResult));
    }

    /**
     * 删除耐压
     */
    @RequiresPermissions("jiance:voltresult:remove")
    @Log(title = "耐压", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(detectVoltResultService.deleteDetectVoltResultByIds(ids));
    }
}
