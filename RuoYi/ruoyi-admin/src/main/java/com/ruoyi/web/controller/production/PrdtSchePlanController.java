package com.ruoyi.web.controller.production;

import java.util.List;

import com.ruoyi.production.domain.PrdtSchePlan;
import com.ruoyi.production.service.IPrdtSchePlanService;
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
 * 排产计划Controller
 * 
 * @author wangbo
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/Production/scheplan")
public class PrdtSchePlanController extends BaseController
{
    private String prefix = "Production/scheplan";

    @Autowired
    private IPrdtSchePlanService prdtSchePlanService;

    @RequiresPermissions("Production:scheplan:view")
    @GetMapping()
    public String scheplan()
    {
        return prefix + "/scheplan";
    }

    /**
     * 查询排产计划列表
     */
    @RequiresPermissions("Production:scheplan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PrdtSchePlan prdtSchePlan)
    {
        startPage();
        List<PrdtSchePlan> list = prdtSchePlanService.selectPrdtSchePlanList(prdtSchePlan);
        return getDataTable(list);
    }

    /**
     * 导出排产计划列表
     */
    @RequiresPermissions("Production:scheplan:export")
    @Log(title = "排产计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PrdtSchePlan prdtSchePlan)
    {
        List<PrdtSchePlan> list = prdtSchePlanService.selectPrdtSchePlanList(prdtSchePlan);
        ExcelUtil<PrdtSchePlan> util = new ExcelUtil<PrdtSchePlan>(PrdtSchePlan.class);
        return util.exportExcel(list, "scheplan");
    }

    /**
     * 新增排产计划
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存排产计划
     */
    @RequiresPermissions("Production:scheplan:add")
    @Log(title = "排产计划", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PrdtSchePlan prdtSchePlan)
    {
        return toAjax(prdtSchePlanService.insertPrdtSchePlan(prdtSchePlan));
    }

    /**
     * 修改排产计划
     */
    @GetMapping("/edit/{schPlanId}")
    public String edit(@PathVariable("schPlanId") Long schPlanId, ModelMap mmap)
    {
        PrdtSchePlan prdtSchePlan = prdtSchePlanService.selectPrdtSchePlanById(schPlanId);
        mmap.put("prdtSchePlan", prdtSchePlan);
        return prefix + "/edit";
    }

    /**
     * 修改保存排产计划
     */
    @RequiresPermissions("Production:scheplan:edit")
    @Log(title = "排产计划", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PrdtSchePlan prdtSchePlan)
    {
        return toAjax(prdtSchePlanService.updatePrdtSchePlan(prdtSchePlan));
    }

    /**
     * 删除排产计划
     */
    @RequiresPermissions("Production:scheplan:remove")
    @Log(title = "排产计划", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(prdtSchePlanService.deletePrdtSchePlanByIds(ids));
    }
}
