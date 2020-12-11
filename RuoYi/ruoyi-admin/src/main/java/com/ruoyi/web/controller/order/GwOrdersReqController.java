package com.ruoyi.web.controller.order;

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
import com.ruoyi.order.domain.GwOrdersReq;
import com.ruoyi.order.service.IGwOrdersReqService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 国网采购订单-请求Controller
 * 
 * @author wangbo
 * @date 2020-12-08
 */
@Controller
@RequestMapping("/Order/OrderRequest")
public class GwOrdersReqController extends BaseController
{
    private String prefix = "Order/OrderRequest";

    @Autowired
    private IGwOrdersReqService gwOrdersReqService;

    @RequiresPermissions("Order:OrderRequest:view")
    @GetMapping()
    public String OrderRequest()
    {
        return prefix + "/OrderRequest";
    }

    /**
     * 查询国网采购订单-请求列表
     */
    @RequiresPermissions("Order:OrderRequest:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GwOrdersReq gwOrdersReq)
    {
        startPage();
        List<GwOrdersReq> list = gwOrdersReqService.selectGwOrdersReqList(gwOrdersReq);
        return getDataTable(list);
    }

    /**
     * 导出国网采购订单-请求列表
     */
    @RequiresPermissions("Order:OrderRequest:export")
    @Log(title = "国网采购订单-请求", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GwOrdersReq gwOrdersReq)
    {
        List<GwOrdersReq> list = gwOrdersReqService.selectGwOrdersReqList(gwOrdersReq);
        ExcelUtil<GwOrdersReq> util = new ExcelUtil<GwOrdersReq>(GwOrdersReq.class);
        return util.exportExcel(list, "OrderRequest");
    }

    /**
     * 新增国网采购订单-请求
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存国网采购订单-请求
     */
    @RequiresPermissions("Order:OrderRequest:add")
    @Log(title = "国网采购订单-请求", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GwOrdersReq gwOrdersReq)
    {
        return toAjax(gwOrdersReqService.insertGwOrdersReq(gwOrdersReq));
    }

    /**
     * 修改国网采购订单-请求
     */
    @GetMapping("/edit/{nnRequestId}")
    public String edit(@PathVariable("nnRequestId") Long nnRequestId, ModelMap mmap)
    {
        GwOrdersReq gwOrdersReq = gwOrdersReqService.selectGwOrdersReqById(nnRequestId);
        mmap.put("gwOrdersReq", gwOrdersReq);
        return prefix + "/edit";
    }

    /**
     * 修改保存国网采购订单-请求
     */
    @RequiresPermissions("Order:OrderRequest:edit")
    @Log(title = "国网采购订单-请求", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GwOrdersReq gwOrdersReq)
    {
        return toAjax(gwOrdersReqService.updateGwOrdersReq(gwOrdersReq));
    }

    /**
     * 删除国网采购订单-请求
     */
    @RequiresPermissions("Order:OrderRequest:remove")
    @Log(title = "国网采购订单-请求", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gwOrdersReqService.deleteGwOrdersReqByIds(ids));
    }
}
