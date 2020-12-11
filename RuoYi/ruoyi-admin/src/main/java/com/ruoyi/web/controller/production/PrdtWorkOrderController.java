package com.ruoyi.web.controller.production;

import java.util.List;

import com.ruoyi.production.domain.PrdtWorkOrder;
import com.ruoyi.production.service.IPrdtWorkOrderService;
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
 * 工单Controller
 * 
 * @author wangbo
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/Production/workorder")
public class PrdtWorkOrderController extends BaseController
{
    private String prefix = "Production/workorder";

    @Autowired
    private IPrdtWorkOrderService prdtWorkOrderService;

    @RequiresPermissions("Production:workorder:view")
    @GetMapping()
    public String workorder()
    {
        return prefix + "/workorder";
    }

    /**
     * 查询工单列表
     */
    @RequiresPermissions("Production:workorder:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PrdtWorkOrder prdtWorkOrder)
    {
        startPage();
        List<PrdtWorkOrder> list = prdtWorkOrderService.selectPrdtWorkOrderList(prdtWorkOrder);
        return getDataTable(list);
    }

    /**
     * 导出工单列表
     */
    @RequiresPermissions("Production:workorder:export")
    @Log(title = "工单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PrdtWorkOrder prdtWorkOrder)
    {
        List<PrdtWorkOrder> list = prdtWorkOrderService.selectPrdtWorkOrderList(prdtWorkOrder);
        ExcelUtil<PrdtWorkOrder> util = new ExcelUtil<PrdtWorkOrder>(PrdtWorkOrder.class);
        return util.exportExcel(list, "workorder");
    }

    /**
     * 新增工单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工单
     */
    @RequiresPermissions("Production:workorder:add")
    @Log(title = "工单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PrdtWorkOrder prdtWorkOrder)
    {
        return toAjax(prdtWorkOrderService.insertPrdtWorkOrder(prdtWorkOrder));
    }

    /**
     * 修改工单
     */
    @GetMapping("/edit/{workOrderId}")
    public String edit(@PathVariable("workOrderId") Long workOrderId, ModelMap mmap)
    {
        PrdtWorkOrder prdtWorkOrder = prdtWorkOrderService.selectPrdtWorkOrderById(workOrderId);
        mmap.put("prdtWorkOrder", prdtWorkOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存工单
     */
    @RequiresPermissions("Production:workorder:edit")
    @Log(title = "工单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PrdtWorkOrder prdtWorkOrder)
    {
        return toAjax(prdtWorkOrderService.updatePrdtWorkOrder(prdtWorkOrder));
    }

    /**
     * 删除工单
     */
    @RequiresPermissions("Production:workorder:remove")
    @Log(title = "工单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(prdtWorkOrderService.deletePrdtWorkOrderByIds(ids));
    }
}
