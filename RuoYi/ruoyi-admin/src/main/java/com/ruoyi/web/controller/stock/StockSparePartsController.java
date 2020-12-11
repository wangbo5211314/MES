package com.ruoyi.web.controller.stock;

import java.util.List;

import com.ruoyi.stock.domain.StockSpareParts;
import com.ruoyi.stock.service.IStockSparePartsService;
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
 * 备品备件库存Controller
 * 
 * @author wangbo
 * @date 2020-12-10
 */
@Controller
@RequestMapping("/Stock/spareparts")
public class StockSparePartsController extends BaseController
{
    private String prefix = "Stock/spareparts";

    @Autowired
    private IStockSparePartsService stockSparePartsService;

    @RequiresPermissions("Stock:spareparts:view")
    @GetMapping()
    public String spareparts()
    {
        return prefix + "/spareparts";
    }

    /**
     * 查询备品备件库存列表
     */
    @RequiresPermissions("Stock:spareparts:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StockSpareParts stockSpareParts)
    {
        startPage();
        List<StockSpareParts> list = stockSparePartsService.selectStockSparePartsList(stockSpareParts);
        return getDataTable(list);
    }

    /**
     * 导出备品备件库存列表
     */
    @RequiresPermissions("Stock:spareparts:export")
    @Log(title = "备品备件库存", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StockSpareParts stockSpareParts)
    {
        List<StockSpareParts> list = stockSparePartsService.selectStockSparePartsList(stockSpareParts);
        ExcelUtil<StockSpareParts> util = new ExcelUtil<StockSpareParts>(StockSpareParts.class);
        return util.exportExcel(list, "spareparts");
    }

    /**
     * 新增备品备件库存
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存备品备件库存
     */
    @RequiresPermissions("Stock:spareparts:add")
    @Log(title = "备品备件库存", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StockSpareParts stockSpareParts)
    {
        return toAjax(stockSparePartsService.insertStockSpareParts(stockSpareParts));
    }

    /**
     * 修改备品备件库存
     */
    @GetMapping("/edit/{spareStockId}")
    public String edit(@PathVariable("spareStockId") Long spareStockId, ModelMap mmap)
    {
        StockSpareParts stockSpareParts = stockSparePartsService.selectStockSparePartsById(spareStockId);
        mmap.put("stockSpareParts", stockSpareParts);
        return prefix + "/edit";
    }

    /**
     * 修改保存备品备件库存
     */
    @RequiresPermissions("Stock:spareparts:edit")
    @Log(title = "备品备件库存", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StockSpareParts stockSpareParts)
    {
        return toAjax(stockSparePartsService.updateStockSpareParts(stockSpareParts));
    }

    /**
     * 删除备品备件库存
     */
    @RequiresPermissions("Stock:spareparts:remove")
    @Log(title = "备品备件库存", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stockSparePartsService.deleteStockSparePartsByIds(ids));
    }
}
