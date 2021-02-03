package com.ruoyi.web.controller.equipman;

import java.util.List;
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
import com.ruoyi.equipman.domain.EquipFault;
import com.ruoyi.equipman.service.IEquipFaultService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备故障管理Controller
 * 
 * @author 王博
 * @date 2021-01-28
 */
@Controller
@RequestMapping("/EquipMan/equipfault")
public class EquipFaultController extends BaseController
{
    private String prefix = "EquipMan/equipfault";

    @Autowired
    private IEquipFaultService equipFaultService;

    @RequiresPermissions("EquipMan:equipfault:view")
    @GetMapping()
    public String equipfault()
    {
        return prefix + "/equipfault";
    }

    /**
     * 查询设备故障管理列表
     */
    @RequiresPermissions("EquipMan:equipfault:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(EquipFault equipFault)
    {
        startPage();
        List<EquipFault> list = equipFaultService.selectEquipFaultList(equipFault);
        return getDataTable(list);
    }

    /**
     * 导出设备故障管理列表
     */
    @RequiresPermissions("EquipMan:equipfault:export")
    @Log(title = "设备故障管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(EquipFault equipFault)
    {
        List<EquipFault> list = equipFaultService.selectEquipFaultList(equipFault);
        ExcelUtil<EquipFault> util = new ExcelUtil<EquipFault>(EquipFault.class);
        return util.exportExcel(list, "equipfault");
    }

    /**
     * 新增设备故障管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备故障管理
     */
    @RequiresPermissions("EquipMan:equipfault:add")
    @Log(title = "设备故障管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(EquipFault equipFault)
    {
        return toAjax(equipFaultService.insertEquipFault(equipFault));
    }

    /**
     * 修改设备故障管理
     */
    @GetMapping("/edit/{sbgzbId}")
    public String edit(@PathVariable("sbgzbId") Long sbgzbId, ModelMap mmap)
    {
        EquipFault equipFault = equipFaultService.selectEquipFaultById(sbgzbId);
        mmap.put("equipFault", equipFault);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备故障管理
     */
    @RequiresPermissions("EquipMan:equipfault:edit")
    @Log(title = "设备故障管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(EquipFault equipFault)
    {
        return toAjax(equipFaultService.updateEquipFault(equipFault));
    }

    /**
     * 删除设备故障管理
     */
    @RequiresPermissions("EquipMan:equipfault:remove")
    @Log(title = "设备故障管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(equipFaultService.deleteEquipFaultByIds(ids));
    }
}
