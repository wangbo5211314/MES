package com.ruoyi.web.controller.rawmate;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateBattery;
import com.ruoyi.rawmate.service.IRawMateBatteryService;
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
 * 电池Controller
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/RawMate/battery")
public class RawMateBatteryController extends BaseController
{
    private String prefix = "RawMate/battery";

    @Autowired
    private IRawMateBatteryService rawMateBatteryService;

    @RequiresPermissions("RawMate:battery:view")
    @GetMapping()
    public String battery()
    {
        return prefix + "/battery";
    }

    /**
     * 查询电池列表
     */
    @RequiresPermissions("RawMate:battery:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RawMateBattery rawMateBattery)
    {
        startPage();
        List<RawMateBattery> list = rawMateBatteryService.selectRawMateBatteryList(rawMateBattery);
        return getDataTable(list);
    }

    /**
     * 导出电池列表
     */
    @RequiresPermissions("RawMate:battery:export")
    @Log(title = "电池", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RawMateBattery rawMateBattery)
    {
        List<RawMateBattery> list = rawMateBatteryService.selectRawMateBatteryList(rawMateBattery);
        ExcelUtil<RawMateBattery> util = new ExcelUtil<RawMateBattery>(RawMateBattery.class);
        return util.exportExcel(list, "battery");
    }

    /**
     * 新增电池
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存电池
     */
    @RequiresPermissions("RawMate:battery:add")
    @Log(title = "电池", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RawMateBattery rawMateBattery)
    {
        return toAjax(rawMateBatteryService.insertRawMateBattery(rawMateBattery));
    }

    /**
     * 修改电池
     */
    @GetMapping("/edit/{batteryId}")
    public String edit(@PathVariable("batteryId") Long batteryId, ModelMap mmap)
    {
        RawMateBattery rawMateBattery = rawMateBatteryService.selectRawMateBatteryById(batteryId);
        mmap.put("rawMateBattery", rawMateBattery);
        return prefix + "/edit";
    }

    /**
     * 修改保存电池
     */
    @RequiresPermissions("RawMate:battery:edit")
    @Log(title = "电池", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RawMateBattery rawMateBattery)
    {
        return toAjax(rawMateBatteryService.updateRawMateBattery(rawMateBattery));
    }

    /**
     * 删除电池
     */
    @RequiresPermissions("RawMate:battery:remove")
    @Log(title = "电池", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rawMateBatteryService.deleteRawMateBatteryByIds(ids));
    }
}
