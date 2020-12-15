package com.ruoyi.web.controller.chujian;

import java.util.List;

import com.ruoyi.chujian.domain.DetectFirstResult;
import com.ruoyi.chujian.service.IDetectFirstResultService;
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
 * 初校Controller
 * 
 * @author wangbo
 * @date 2020-12-15
 */
@Controller
@RequestMapping("/chujian/firstresult")
public class DetectFirstResultController extends BaseController
{
    private String prefix = "chujian/firstresult";

    @Autowired
    private IDetectFirstResultService detectFirstResultService;

    @RequiresPermissions("chujian:firstresult:view")
    @GetMapping()
    public String firstresult()
    {
        return prefix + "/firstresult";
    }

    /**
     * 查询初校列表
     */
    @RequiresPermissions("chujian:firstresult:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DetectFirstResult detectFirstResult)
    {
        startPage();
        List<DetectFirstResult> list = detectFirstResultService.selectDetectFirstResultList(detectFirstResult);
        return getDataTable(list);
    }

    /**
     * 导出初校列表
     */
    @RequiresPermissions("chujian:firstresult:export")
    @Log(title = "初校", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DetectFirstResult detectFirstResult)
    {
        List<DetectFirstResult> list = detectFirstResultService.selectDetectFirstResultList(detectFirstResult);
        ExcelUtil<DetectFirstResult> util = new ExcelUtil<DetectFirstResult>(DetectFirstResult.class);
        return util.exportExcel(list, "firstresult");
    }

    /**
     * 新增初校
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存初校
     */
    @RequiresPermissions("chujian:firstresult:add")
    @Log(title = "初校", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DetectFirstResult detectFirstResult)
    {
        return toAjax(detectFirstResultService.insertDetectFirstResult(detectFirstResult));
    }

    /**
     * 修改初校
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DetectFirstResult detectFirstResult = detectFirstResultService.selectDetectFirstResultById(id);
        mmap.put("detectFirstResult", detectFirstResult);
        return prefix + "/edit";
    }

    /**
     * 修改保存初校
     */
    @RequiresPermissions("chujian:firstresult:edit")
    @Log(title = "初校", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DetectFirstResult detectFirstResult)
    {
        return toAjax(detectFirstResultService.updateDetectFirstResult(detectFirstResult));
    }

    /**
     * 删除初校
     */
    @RequiresPermissions("chujian:firstresult:remove")
    @Log(title = "初校", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(detectFirstResultService.deleteDetectFirstResultByIds(ids));
    }
}
