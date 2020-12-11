package com.ruoyi.web.controller.rawmate;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateYj;
import com.ruoyi.rawmate.service.IRawMateYjService;
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
 * 液晶Controller
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/RawMate/yj")
public class RawMateYjController extends BaseController
{
    private String prefix = "RawMate/yj";

    @Autowired
    private IRawMateYjService rawMateYjService;

    @RequiresPermissions("RawMate:yj:view")
    @GetMapping()
    public String yj()
    {
        return prefix + "/yj";
    }

    /**
     * 查询液晶列表
     */
    @RequiresPermissions("RawMate:yj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RawMateYj rawMateYj)
    {
        startPage();
        List<RawMateYj> list = rawMateYjService.selectRawMateYjList(rawMateYj);
        return getDataTable(list);
    }

    /**
     * 导出液晶列表
     */
    @RequiresPermissions("RawMate:yj:export")
    @Log(title = "液晶", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RawMateYj rawMateYj)
    {
        List<RawMateYj> list = rawMateYjService.selectRawMateYjList(rawMateYj);
        ExcelUtil<RawMateYj> util = new ExcelUtil<RawMateYj>(RawMateYj.class);
        return util.exportExcel(list, "yj");
    }

    /**
     * 新增液晶
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存液晶
     */
    @RequiresPermissions("RawMate:yj:add")
    @Log(title = "液晶", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RawMateYj rawMateYj)
    {
        return toAjax(rawMateYjService.insertRawMateYj(rawMateYj));
    }

    /**
     * 修改液晶
     */
    @GetMapping("/edit/{yjId}")
    public String edit(@PathVariable("yjId") Long yjId, ModelMap mmap)
    {
        RawMateYj rawMateYj = rawMateYjService.selectRawMateYjById(yjId);
        mmap.put("rawMateYj", rawMateYj);
        return prefix + "/edit";
    }

    /**
     * 修改保存液晶
     */
    @RequiresPermissions("RawMate:yj:edit")
    @Log(title = "液晶", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RawMateYj rawMateYj)
    {
        return toAjax(rawMateYjService.updateRawMateYj(rawMateYj));
    }

    /**
     * 删除液晶
     */
    @RequiresPermissions("RawMate:yj:remove")
    @Log(title = "液晶", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rawMateYjService.deleteRawMateYjByIds(ids));
    }
}
