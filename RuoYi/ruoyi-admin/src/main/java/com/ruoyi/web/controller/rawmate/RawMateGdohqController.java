package com.ruoyi.web.controller.rawmate;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateGdohq;
import com.ruoyi.rawmate.service.IRawMateGdohqService;
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
 * 光电耦合器Controller
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/RawMate/gdohq")
public class RawMateGdohqController extends BaseController
{
    private String prefix = "RawMate/gdohq";

    @Autowired
    private IRawMateGdohqService rawMateGdohqService;

    @RequiresPermissions("RawMate:gdohq:view")
    @GetMapping()
    public String gdohq()
    {
        return prefix + "/gdohq";
    }

    /**
     * 查询光电耦合器列表
     */
    @RequiresPermissions("RawMate:gdohq:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RawMateGdohq rawMateGdohq)
    {
        startPage();
        List<RawMateGdohq> list = rawMateGdohqService.selectRawMateGdohqList(rawMateGdohq);
        return getDataTable(list);
    }

    /**
     * 导出光电耦合器列表
     */
    @RequiresPermissions("RawMate:gdohq:export")
    @Log(title = "光电耦合器", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RawMateGdohq rawMateGdohq)
    {
        List<RawMateGdohq> list = rawMateGdohqService.selectRawMateGdohqList(rawMateGdohq);
        ExcelUtil<RawMateGdohq> util = new ExcelUtil<RawMateGdohq>(RawMateGdohq.class);
        return util.exportExcel(list, "gdohq");
    }

    /**
     * 新增光电耦合器
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存光电耦合器
     */
    @RequiresPermissions("RawMate:gdohq:add")
    @Log(title = "光电耦合器", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RawMateGdohq rawMateGdohq)
    {
        return toAjax(rawMateGdohqService.insertRawMateGdohq(rawMateGdohq));
    }

    /**
     * 修改光电耦合器
     */
    @GetMapping("/edit/{gdohqId}")
    public String edit(@PathVariable("gdohqId") Long gdohqId, ModelMap mmap)
    {
        RawMateGdohq rawMateGdohq = rawMateGdohqService.selectRawMateGdohqById(gdohqId);
        mmap.put("rawMateGdohq", rawMateGdohq);
        return prefix + "/edit";
    }

    /**
     * 修改保存光电耦合器
     */
    @RequiresPermissions("RawMate:gdohq:edit")
    @Log(title = "光电耦合器", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RawMateGdohq rawMateGdohq)
    {
        return toAjax(rawMateGdohqService.updateRawMateGdohq(rawMateGdohq));
    }

    /**
     * 删除光电耦合器
     */
    @RequiresPermissions("RawMate:gdohq:remove")
    @Log(title = "光电耦合器", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rawMateGdohqService.deleteRawMateGdohqByIds(ids));
    }
}
