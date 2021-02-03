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
import com.ruoyi.equipman.domain.EquipDaily;
import com.ruoyi.equipman.service.IEquipDailyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备日常维护Controller
 * 
 * @author 王博
 * @date 2021-01-28
 */
@Controller
@RequestMapping("/EquipMan/equipdaily")
public class EquipDailyController extends BaseController
{
    private String prefix = "EquipMan/equipdaily";

    @Autowired
    private IEquipDailyService equipDailyService;

    @RequiresPermissions("EquipMan:equipdaily:view")
    @GetMapping()
    public String equipdaily()
    {
        return prefix + "/equipdaily";
    }

    /**
     * 查询设备日常维护列表
     */
    @RequiresPermissions("EquipMan:equipdaily:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(EquipDaily equipDaily)
    {
        startPage();
        List<EquipDaily> list = equipDailyService.selectEquipDailyList(equipDaily);
        return getDataTable(list);
    }

    /**
     * 导出设备日常维护列表
     */
    @RequiresPermissions("EquipMan:equipdaily:export")
    @Log(title = "设备日常维护", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(EquipDaily equipDaily)
    {
        List<EquipDaily> list = equipDailyService.selectEquipDailyList(equipDaily);
        ExcelUtil<EquipDaily> util = new ExcelUtil<EquipDaily>(EquipDaily.class);
        return util.exportExcel(list, "equipdaily");
    }

    /**
     * 新增设备日常维护
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备日常维护
     */
    @RequiresPermissions("EquipMan:equipdaily:add")
    @Log(title = "设备日常维护", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(EquipDaily equipDaily)
    {
        return toAjax(equipDailyService.insertEquipDaily(equipDaily));
    }

    /**
     * 修改设备日常维护
     */
    @GetMapping("/edit/{sbrcwhbId}")
    public String edit(@PathVariable("sbrcwhbId") Long sbrcwhbId, ModelMap mmap)
    {
        EquipDaily equipDaily = equipDailyService.selectEquipDailyById(sbrcwhbId);
        mmap.put("equipDaily", equipDaily);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备日常维护
     */
    @RequiresPermissions("EquipMan:equipdaily:edit")
    @Log(title = "设备日常维护", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(EquipDaily equipDaily)
    {
        return toAjax(equipDailyService.updateEquipDaily(equipDaily));
    }

    /**
     * 删除设备日常维护
     */
    @RequiresPermissions("EquipMan:equipdaily:remove")
    @Log(title = "设备日常维护", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(equipDailyService.deleteEquipDailyByIds(ids));
    }
}
