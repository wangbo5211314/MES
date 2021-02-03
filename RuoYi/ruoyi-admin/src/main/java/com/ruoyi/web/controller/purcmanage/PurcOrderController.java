package com.ruoyi.web.controller.purcmanage;

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
import com.ruoyi.purcmanage.domain.PurcOrder;
import com.ruoyi.purcmanage.service.IPurcOrderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 采购订单Controller
 * 
 * @author 王博
 * @date 2021-01-25
 */
@Controller
@RequestMapping("/PurcManage/purcorder")
public class PurcOrderController extends BaseController
{
    private String prefix = "PurcManage/purcorder";

    @Autowired
    private IPurcOrderService purcOrderService;

    @RequiresPermissions("PurcManage:purcorder:view")
    @GetMapping()
    public String purcorder()
    {
        return prefix + "/purcorder";
    }

    /**
     * 查询采购订单列表
     */
    /*
    @RequiresPermissions("PurcManage:purcorder:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PurcOrder purcOrder)
    {
        startPage();
        List<PurcOrder> list = purcOrderService.selectPurcOrderList(purcOrder);
        return getDataTable(list);
    }*/
    /**
     * 查询采购订单列表
     */
    @RequiresPermissions("PurcManage:purcorder:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PurcOrder purcOrder)
    {
        startPage();
        List<PurcOrder> list = purcOrderService.selectPurcOrderList(purcOrder);
        return getDataTable(list);
    }

    /**
     * 导出采购订单列表
     */
    @RequiresPermissions("PurcManage:purcorder:export")
    @Log(title = "采购订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PurcOrder purcOrder)
    {
        List<PurcOrder> list = purcOrderService.selectPurcOrderList(purcOrder);
        ExcelUtil<PurcOrder> util = new ExcelUtil<PurcOrder>(PurcOrder.class);
        return util.exportExcel(list, "purcorder");
    }

    /**
     * 新增采购订单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存采购订单
     */
    @RequiresPermissions("PurcManage:purcorder:add")
    @Log(title = "采购订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PurcOrder purcOrder)
    {
        return toAjax(purcOrderService.insertPurcOrder(purcOrder));
    }

    /**
     * 修改采购订单
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        PurcOrder purcOrder = purcOrderService.selectPurcOrderById(id);
        mmap.put("purcOrder", purcOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存采购订单
     */
    @RequiresPermissions("PurcManage:purcorder:edit")
    @Log(title = "采购订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PurcOrder purcOrder)
    {
        return toAjax(purcOrderService.updatePurcOrder(purcOrder));
    }

    /**
     * 删除采购订单
     */
    @RequiresPermissions("PurcManage:purcorder:remove")
    @Log(title = "采购订单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(purcOrderService.deletePurcOrderByIds(ids));
    }
}
