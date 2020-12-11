package com.ruoyi.web.controller.rawmate;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateDlhgq;
import com.ruoyi.rawmate.service.IRawMateDlhgqService;
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
 * 电流互感器Controller
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/RawMate/dlhgq")
public class RawMateDlhgqController extends BaseController
{
    private String prefix = "RawMate/dlhgq";

    @Autowired
    private IRawMateDlhgqService rawMateDlhgqService;

    @RequiresPermissions("RawMate:dlhgq:view")
    @GetMapping()
    public String dlhgq()
    {
        return prefix + "/dlhgq";
    }

    /**
     * 查询电流互感器列表
     */
    @RequiresPermissions("RawMate:dlhgq:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RawMateDlhgq rawMateDlhgq)
    {
        startPage();
        List<RawMateDlhgq> list = rawMateDlhgqService.selectRawMateDlhgqList(rawMateDlhgq);
        return getDataTable(list);
    }

    /**
     * 导出电流互感器列表
     */
    @RequiresPermissions("RawMate:dlhgq:export")
    @Log(title = "电流互感器", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RawMateDlhgq rawMateDlhgq)
    {
        List<RawMateDlhgq> list = rawMateDlhgqService.selectRawMateDlhgqList(rawMateDlhgq);
        ExcelUtil<RawMateDlhgq> util = new ExcelUtil<RawMateDlhgq>(RawMateDlhgq.class);
        return util.exportExcel(list, "dlhgq");
    }

    /**
     * 新增电流互感器
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存电流互感器
     */
    @RequiresPermissions("RawMate:dlhgq:add")
    @Log(title = "电流互感器", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RawMateDlhgq rawMateDlhgq)
    {
        return toAjax(rawMateDlhgqService.insertRawMateDlhgq(rawMateDlhgq));
    }

    /**
     * 修改电流互感器
     */
    @GetMapping("/edit/{dlhgqId}")
    public String edit(@PathVariable("dlhgqId") Long dlhgqId, ModelMap mmap)
    {
        RawMateDlhgq rawMateDlhgq = rawMateDlhgqService.selectRawMateDlhgqById(dlhgqId);
        mmap.put("rawMateDlhgq", rawMateDlhgq);
        return prefix + "/edit";
    }

    /**
     * 修改保存电流互感器
     */
    @RequiresPermissions("RawMate:dlhgq:edit")
    @Log(title = "电流互感器", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RawMateDlhgq rawMateDlhgq)
    {
        return toAjax(rawMateDlhgqService.updateRawMateDlhgq(rawMateDlhgq));
    }

    /**
     * 删除电流互感器
     */
    @RequiresPermissions("RawMate:dlhgq:remove")
    @Log(title = "电流互感器", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rawMateDlhgqService.deleteRawMateDlhgqByIds(ids));
    }
}
