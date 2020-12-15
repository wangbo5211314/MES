package com.ruoyi.web.controller.jiance;

import java.util.List;

import com.ruoyi.jiance.domain.DetectMaincheckResult;
import com.ruoyi.jiance.service.IDetectMaincheckResultService;
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
 * 复校Controller
 * 
 * @author wangbo
 * @date 2020-12-15
 */
@Controller
@RequestMapping("/jiance/maincheckresult")
public class DetectMaincheckResultController extends BaseController
{
    private String prefix = "jiance/maincheckresult";

    @Autowired
    private IDetectMaincheckResultService detectMaincheckResultService;

    @RequiresPermissions("jiance:maincheckresult:view")
    @GetMapping()
    public String maincheckresult()
    {
        return prefix + "/maincheckresult";
    }

    /**
     * 查询复校列表
     */
    @RequiresPermissions("jiance:maincheckresult:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DetectMaincheckResult detectMaincheckResult)
    {
        startPage();
        List<DetectMaincheckResult> list = detectMaincheckResultService.selectDetectMaincheckResultList(detectMaincheckResult);
        return getDataTable(list);
    }

    /**
     * 导出复校列表
     */
    @RequiresPermissions("jiance:maincheckresult:export")
    @Log(title = "复校", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DetectMaincheckResult detectMaincheckResult)
    {
        List<DetectMaincheckResult> list = detectMaincheckResultService.selectDetectMaincheckResultList(detectMaincheckResult);
        ExcelUtil<DetectMaincheckResult> util = new ExcelUtil<DetectMaincheckResult>(DetectMaincheckResult.class);
        return util.exportExcel(list, "maincheckresult");
    }

    /**
     * 新增复校
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存复校
     */
    @RequiresPermissions("jiance:maincheckresult:add")
    @Log(title = "复校", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DetectMaincheckResult detectMaincheckResult)
    {
        return toAjax(detectMaincheckResultService.insertDetectMaincheckResult(detectMaincheckResult));
    }

    /**
     * 修改复校
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DetectMaincheckResult detectMaincheckResult = detectMaincheckResultService.selectDetectMaincheckResultById(id);
        mmap.put("detectMaincheckResult", detectMaincheckResult);
        return prefix + "/edit";
    }

    /**
     * 修改保存复校
     */
    @RequiresPermissions("jiance:maincheckresult:edit")
    @Log(title = "复校", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DetectMaincheckResult detectMaincheckResult)
    {
        return toAjax(detectMaincheckResultService.updateDetectMaincheckResult(detectMaincheckResult));
    }

    /**
     * 删除复校
     */
    @RequiresPermissions("jiance:maincheckresult:remove")
    @Log(title = "复校", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(detectMaincheckResultService.deleteDetectMaincheckResultByIds(ids));
    }
}
