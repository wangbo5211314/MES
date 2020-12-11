package com.ruoyi.web.controller.order;

import java.util.List;

import com.ruoyi.order.domain.ProductionOrder;
import com.ruoyi.order.service.IProductionOrderService;
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
 * 生产订单Controller
 * 
 * @author wangbo
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/Order/productionorder")
public class ProductionOrderController extends BaseController
{
    private String prefix = "Order/productionorder";

    @Autowired
    private IProductionOrderService productionOrderService;

    @RequiresPermissions("Order:productionorder:view")
    @GetMapping()
    public String productionorder()
    {
        return prefix + "/productionorder";
    }

    /**
     * 查询生产订单列表
     */
    @RequiresPermissions("Order:productionorder:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ProductionOrder productionOrder)
    {
        startPage();
        List<ProductionOrder> list = productionOrderService.selectProductionOrderList(productionOrder);
        return getDataTable(list);
    }

    /**
     * 导出生产订单列表
     */
    @RequiresPermissions("Order:productionorder:export")
    @Log(title = "生产订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ProductionOrder productionOrder)
    {
        List<ProductionOrder> list = productionOrderService.selectProductionOrderList(productionOrder);
        ExcelUtil<ProductionOrder> util = new ExcelUtil<ProductionOrder>(ProductionOrder.class);
        return util.exportExcel(list, "productionorder");
    }

    /**
     * 新增生产订单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存生产订单
     */
    @RequiresPermissions("Order:productionorder:add")
    @Log(title = "生产订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ProductionOrder productionOrder)
    {
        return toAjax(productionOrderService.insertProductionOrder(productionOrder));
    }

    /**
     * 修改生产订单
     */
    @GetMapping("/edit/{productionOrderId}")
    public String edit(@PathVariable("productionOrderId") Long productionOrderId, ModelMap mmap)
    {
        ProductionOrder productionOrder = productionOrderService.selectProductionOrderById(productionOrderId);
        mmap.put("productionOrder", productionOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存生产订单
     */
    @RequiresPermissions("Order:productionorder:edit")
    @Log(title = "生产订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProductionOrder productionOrder)
    {
        return toAjax(productionOrderService.updateProductionOrder(productionOrder));
    }

    /**
     * 删除生产订单
     */
    @RequiresPermissions("Order:productionorder:remove")
    @Log(title = "生产订单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(productionOrderService.deleteProductionOrderByIds(ids));
    }
}
