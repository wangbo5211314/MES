package com.ruoyi.web.controller.order;

import java.util.List;

import com.ruoyi.order.domain.GwOrdersReturn;
import com.ruoyi.order.service.IGwOrdersReturnService;
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
import org.springframework.web.multipart.MultipartFile;

/**
 * 国网采购订单-返回Controller
 * 
 * @author wangbo
 * @date 2020-12-08
 */
@Controller
@RequestMapping("/Order/orderreturn")
public class GwOrdersReturnController extends BaseController
{
    private String prefix = "Order/orderreturn";

    @Autowired
    private IGwOrdersReturnService gwOrdersReturnService;

    @RequiresPermissions("Order:orderreturn:view")
    @GetMapping()
    public String orderreturn()
    {
        return prefix + "/orderreturn";
    }

    /**
     * 查询国网采购订单-返回列表
     */
    @RequiresPermissions("Order:orderreturn:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GwOrdersReturn gwOrdersReturn)
    {
        startPage();
        List<GwOrdersReturn> list = gwOrdersReturnService.selectGwOrdersReturnList(gwOrdersReturn);
        return getDataTable(list);
    }

    /**导入国网订单返回
     */
    @RequiresPermissions("Order:orderreturn:import")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<GwOrdersReturn> util = new ExcelUtil<GwOrdersReturn>(GwOrdersReturn.class);
        List<GwOrdersReturn> gwOrdersReturnList = util.importExcel(file.getInputStream());

        String message = gwOrdersReturnService.importGwordersreturn(gwOrdersReturnList, updateSupport);
        return AjaxResult.success(message);
    }

    // 下载模板
    @RequiresPermissions("Order:orderreturn:view")
    @GetMapping("/importTemplate")
    @ResponseBody
    public AjaxResult importTemplate()
    {
        ExcelUtil<GwOrdersReturn> util = new ExcelUtil<GwOrdersReturn>(GwOrdersReturn.class);
        return util.importTemplateExcel("国网订单-返回");
    }

    /**
     * 导出国网采购订单-返回列表
     */
    @RequiresPermissions("Order:orderreturn:export")
    @Log(title = "国网采购订单-返回", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GwOrdersReturn gwOrdersReturn)
    {
        List<GwOrdersReturn> list = gwOrdersReturnService.selectGwOrdersReturnList(gwOrdersReturn);
        ExcelUtil<GwOrdersReturn> util = new ExcelUtil<GwOrdersReturn>(GwOrdersReturn.class);
        return util.exportExcel(list, "orderreturn");
    }

    /**
     * 新增国网采购订单-返回
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存国网采购订单-返回
     */
    @RequiresPermissions("Order:orderreturn:add")
    @Log(title = "国网采购订单-返回", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GwOrdersReturn gwOrdersReturn)
    {
        return toAjax(gwOrdersReturnService.insertGwOrdersReturn(gwOrdersReturn));
    }

    /**
     * 修改国网采购订单-返回
     */
    @GetMapping("/edit/{nnReturnId}")
    public String edit(@PathVariable("nnReturnId") Long nnReturnId, ModelMap mmap)
    {
        GwOrdersReturn gwOrdersReturn = gwOrdersReturnService.selectGwOrdersReturnById(nnReturnId);
        mmap.put("gwOrdersReturn", gwOrdersReturn);
        return prefix + "/edit";
    }

    /**
     * 修改保存国网采购订单-返回
     */
    @RequiresPermissions("Order:orderreturn:edit")
    @Log(title = "国网采购订单-返回", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GwOrdersReturn gwOrdersReturn)
    {
        return toAjax(gwOrdersReturnService.updateGwOrdersReturn(gwOrdersReturn));
    }

    /**
     * 删除国网采购订单-返回
     */
    @RequiresPermissions("Order:orderreturn:remove")
    @Log(title = "国网采购订单-返回", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gwOrdersReturnService.deleteGwOrdersReturnByIds(ids));
    }
}
