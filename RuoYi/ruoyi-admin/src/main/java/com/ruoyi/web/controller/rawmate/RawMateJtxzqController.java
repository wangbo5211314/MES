package com.ruoyi.web.controller.rawmate;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateJtxzq;
import com.ruoyi.rawmate.service.IRawMateJtxzqService;
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
 * 晶体谐振器Controller
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/RawMate/jtxzq")
public class RawMateJtxzqController extends BaseController
{
    private String prefix = "RawMate/jtxzq";

    @Autowired
    private IRawMateJtxzqService rawMateJtxzqService;

    @RequiresPermissions("RawMate:jtxzq:view")
    @GetMapping()
    public String jtxzq()
    {
        return prefix + "/jtxzq";
    }

    /**
     * 查询晶体谐振器列表
     */
    @RequiresPermissions("RawMate:jtxzq:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RawMateJtxzq rawMateJtxzq)
    {
        startPage();
        List<RawMateJtxzq> list = rawMateJtxzqService.selectRawMateJtxzqList(rawMateJtxzq);
        return getDataTable(list);
    }

    /**
     * 导出晶体谐振器列表
     */
    @RequiresPermissions("RawMate:jtxzq:export")
    @Log(title = "晶体谐振器", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RawMateJtxzq rawMateJtxzq)
    {
        List<RawMateJtxzq> list = rawMateJtxzqService.selectRawMateJtxzqList(rawMateJtxzq);
        ExcelUtil<RawMateJtxzq> util = new ExcelUtil<RawMateJtxzq>(RawMateJtxzq.class);
        return util.exportExcel(list, "jtxzq");
    }

    /**
     * 新增晶体谐振器
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存晶体谐振器
     */
    @RequiresPermissions("RawMate:jtxzq:add")
    @Log(title = "晶体谐振器", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RawMateJtxzq rawMateJtxzq)
    {
        return toAjax(rawMateJtxzqService.insertRawMateJtxzq(rawMateJtxzq));
    }

    /**
     * 修改晶体谐振器
     */
    @GetMapping("/edit/{jtxzqId}")
    public String edit(@PathVariable("jtxzqId") Long jtxzqId, ModelMap mmap)
    {
        RawMateJtxzq rawMateJtxzq = rawMateJtxzqService.selectRawMateJtxzqById(jtxzqId);
        mmap.put("rawMateJtxzq", rawMateJtxzq);
        return prefix + "/edit";
    }

    /**
     * 修改保存晶体谐振器
     */
    @RequiresPermissions("RawMate:jtxzq:edit")
    @Log(title = "晶体谐振器", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RawMateJtxzq rawMateJtxzq)
    {
        return toAjax(rawMateJtxzqService.updateRawMateJtxzq(rawMateJtxzq));
    }

    /**
     * 删除晶体谐振器
     */
    @RequiresPermissions("RawMate:jtxzq:remove")
    @Log(title = "晶体谐振器", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rawMateJtxzqService.deleteRawMateJtxzqByIds(ids));
    }
}
