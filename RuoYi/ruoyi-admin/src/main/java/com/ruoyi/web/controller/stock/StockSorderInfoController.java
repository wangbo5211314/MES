package com.ruoyi.web.controller.stock;

import java.util.List;

import com.ruoyi.stock.domain.StockSorderInfo;
import com.ruoyi.stock.service.IStockSorderInfoService;
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
 * 供货单信息Controller
 * 
 * @author wangbo
 * @date 2020-12-10
 */
@Controller
@RequestMapping("/Stock/sorderinfo")
public class StockSorderInfoController extends BaseController
{
    private String prefix = "Stock/sorderinfo";

    @Autowired
    private IStockSorderInfoService stockSorderInfoService;

    @RequiresPermissions("Stock:sorderinfo:view")
    @GetMapping()
    public String sorderinfo()
    {
        return prefix + "/sorderinfo";
    }

    /**
     * 查询供货单信息列表
     */
    @RequiresPermissions("Stock:sorderinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StockSorderInfo stockSorderInfo)
    {
        startPage();
        List<StockSorderInfo> list = stockSorderInfoService.selectStockSorderInfoList(stockSorderInfo);
        return getDataTable(list);
    }

    /**
     * 导出供货单信息列表
     */
    @RequiresPermissions("Stock:sorderinfo:export")
    @Log(title = "供货单信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StockSorderInfo stockSorderInfo)
    {
        List<StockSorderInfo> list = stockSorderInfoService.selectStockSorderInfoList(stockSorderInfo);
        ExcelUtil<StockSorderInfo> util = new ExcelUtil<StockSorderInfo>(StockSorderInfo.class);
        return util.exportExcel(list, "sorderinfo");
    }

    /**
     * 新增供货单信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存供货单信息
     */
    @RequiresPermissions("Stock:sorderinfo:add")
    @Log(title = "供货单信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StockSorderInfo stockSorderInfo)
    {
        return toAjax(stockSorderInfoService.insertStockSorderInfo(stockSorderInfo));
    }

    /**
     * 修改供货单信息
     */
    @GetMapping("/edit/{supInfoId}")
    public String edit(@PathVariable("supInfoId") Long supInfoId, ModelMap mmap)
    {
        StockSorderInfo stockSorderInfo = stockSorderInfoService.selectStockSorderInfoById(supInfoId);
        mmap.put("stockSorderInfo", stockSorderInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存供货单信息
     */
    @RequiresPermissions("Stock:sorderinfo:edit")
    @Log(title = "供货单信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StockSorderInfo stockSorderInfo)
    {
        return toAjax(stockSorderInfoService.updateStockSorderInfo(stockSorderInfo));
    }

    /**
     * 删除供货单信息
     */
    @RequiresPermissions("Stock:sorderinfo:remove")
    @Log(title = "供货单信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stockSorderInfoService.deleteStockSorderInfoByIds(ids));
    }
}
