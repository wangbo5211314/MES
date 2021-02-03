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
import com.ruoyi.stock.domain.StockIn;
import com.ruoyi.stock.service.IStockInService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 入库单Controller
 * 
 * @author 王博
 * @date 2021-01-26
 */
@Controller
@RequestMapping("/Stock/stockin")
public class StockInController extends BaseController
{
    private String prefix = "Stock/stockin";

    @Autowired
    private IStockInService stockInService;

    @RequiresPermissions("Stock:stockin:view")
    @GetMapping()
    public String stockin()
    {
        return prefix + "/stockin";
    }

    /**
     * 查询入库单列表
     */
    @RequiresPermissions("Stock:stockin:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StockIn stockIn)
    {
        startPage();
        List<StockIn> list = stockInService.selectStockInList(stockIn);
        return getDataTable(list);
    }

    /**
     * 导出入库单列表
     */
    @RequiresPermissions("Stock:stockin:export")
    @Log(title = "入库单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StockIn stockIn)
    {
        List<StockIn> list = stockInService.selectStockInList(stockIn);
        ExcelUtil<StockIn> util = new ExcelUtil<StockIn>(StockIn.class);
        return util.exportExcel(list, "stockin");
    }

    /**
     * 新增入库单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存入库单
     */
    @RequiresPermissions("Stock:stockin:add")
    @Log(title = "入库单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StockIn stockIn)
    {
        return toAjax(stockInService.insertStockIn(stockIn));
    }

    /**
     * 修改入库单
     */
    @GetMapping("/edit/{rkId}")
    public String edit(@PathVariable("rkId") Long rkId, ModelMap mmap)
    {
        StockIn stockIn = stockInService.selectStockInById(rkId);
        mmap.put("stockIn", stockIn);
        return prefix + "/edit";
    }

    /**
     * 修改保存入库单
     */
    @RequiresPermissions("Stock:stockin:edit")
    @Log(title = "入库单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StockIn stockIn)
    {
        return toAjax(stockInService.updateStockIn(stockIn));
    }

    /**
     * 删除入库单
     */
    @RequiresPermissions("Stock:stockin:remove")
    @Log(title = "入库单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stockInService.deleteStockInByIds(ids));
    }
}
