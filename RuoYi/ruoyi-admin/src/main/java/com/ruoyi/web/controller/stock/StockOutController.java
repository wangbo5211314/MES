package com.ruoyi.web.controller.stock;

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
import com.ruoyi.stock.domain.StockOut;
import com.ruoyi.stock.service.IStockOutService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出库单Controller
 * 
 * @author 王博
 * @date 2021-01-28
 */
@Controller
@RequestMapping("/Stock/stockout")
public class StockOutController extends BaseController
{
    private String prefix = "Stock/stockout";

    @Autowired
    private IStockOutService stockOutService;

    @RequiresPermissions("Stock:stockout:view")
    @GetMapping()
    public String stockout()
    {
        return prefix + "/stockout";
    }

    /**
     * 查询出库单列表
     */
    @RequiresPermissions("Stock:stockout:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StockOut stockOut)
    {
        startPage();
        List<StockOut> list = stockOutService.selectStockOutList(stockOut);
        return getDataTable(list);
    }

    /**
     * 导出出库单列表
     */
    @RequiresPermissions("Stock:stockout:export")
    @Log(title = "出库单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StockOut stockOut)
    {
        List<StockOut> list = stockOutService.selectStockOutList(stockOut);
        ExcelUtil<StockOut> util = new ExcelUtil<StockOut>(StockOut.class);
        return util.exportExcel(list, "stockout");
    }

    /**
     * 新增出库单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存出库单
     */
    @RequiresPermissions("Stock:stockout:add")
    @Log(title = "出库单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StockOut stockOut)
    {
        return toAjax(stockOutService.insertStockOut(stockOut));
    }

    /**
     * 修改出库单
     */
    @GetMapping("/edit/{ckId}")
    public String edit(@PathVariable("ckId") Long ckId, ModelMap mmap)
    {
        StockOut stockOut = stockOutService.selectStockOutById(ckId);
        mmap.put("stockOut", stockOut);
        return prefix + "/edit";
    }

    /**
     * 修改保存出库单
     */
    @RequiresPermissions("Stock:stockout:edit")
    @Log(title = "出库单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StockOut stockOut)
    {
        return toAjax(stockOutService.updateStockOut(stockOut));
    }

    /**
     * 删除出库单
     */
    @RequiresPermissions("Stock:stockout:remove")
    @Log(title = "出库单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stockOutService.deleteStockOutByIds(ids));
    }
}
