package com.ruoyi.web.controller.order;

import java.util.List;

import com.ruoyi.order.domain.SalesOrder;
import com.ruoyi.order.service.ISalesOrderService;
import com.ruoyi.tecsche.domain.TecScheBom;
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
 * 销售订单Controller
 * 
 * @author wangbo
 * @date 2020-12-08
 */
@Controller
@RequestMapping("/Order/saleorder")
public class SalesOrderController extends BaseController
{
    private String prefix = "Order/saleorder";

    @Autowired
    private ISalesOrderService salesOrderService;

    @RequiresPermissions("Order:saleorder:view")
    @GetMapping()
    public String saleorder()
    {
        return prefix + "/saleorder";
    }

    /**
     * 查询销售订单列表
     */
    @RequiresPermissions("Order:saleorder:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SalesOrder salesOrder)
    {
        startPage();

        List<SalesOrder> list = salesOrderService.selectSalesOrderList(salesOrder);

        /*测试list里的数据*/
        for (SalesOrder sod1:list
             ) {

            System.out.println("销售订单号："+sod1.getSaleOrderNum());
        }

        return getDataTable(list);
    }

    /**
     * 查询销售订单列表
     */
   /* @RequiresPermissions("Order:saleorder:list")
    @PostMapping("/list")
    @ResponseBody
    public SalesOrder list(SalesOrder salesOrder)
    {

        List<SalesOrder> list = salesOrderService.selectSalesOrderList(salesOrder);
        //System.out.println(list);

        for (SalesOrder sod:list
             ) {
            System.out.println("销售订单号："+sod.getSaleOrderNum());
        }
        return salesOrder;
    }*/

    /**
     * 导出销售订单列表
     */
    @RequiresPermissions("Order:saleorder:export")
    @Log(title = "销售订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SalesOrder salesOrder)
    {
        List<SalesOrder> list = salesOrderService.selectSalesOrderList(salesOrder);
        ExcelUtil<SalesOrder> util = new ExcelUtil<SalesOrder>(SalesOrder.class);
        return util.exportExcel(list, "saleorder");
    }

    /**
     * 新增销售订单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存销售订单
     */
    @RequiresPermissions("Order:saleorder:add")
    @Log(title = "销售订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SalesOrder salesOrder)
    {
        return toAjax(salesOrderService.insertSalesOrder(salesOrder));
    }

    /**
     * 修改销售订单
     */
    @GetMapping("/edit/{salesOrderId}")
    public String edit(@PathVariable("salesOrderId") Long salesOrderId, ModelMap mmap)
    {
        SalesOrder salesOrder = salesOrderService.selectSalesOrderById(salesOrderId);
        mmap.put("salesOrder", salesOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存销售订单
     */
    @RequiresPermissions("Order:saleorder:edit")
    @Log(title = "销售订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SalesOrder salesOrder)
    {
        return toAjax(salesOrderService.updateSalesOrder(salesOrder));
    }

    /**
     * 删除销售订单
     */
    @RequiresPermissions("Order:saleorder:remove")
    @Log(title = "销售订单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(salesOrderService.deleteSalesOrderByIds(ids));
    }
}
