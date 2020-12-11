package com.ruoyi.web.controller.stock;

import java.util.List;

import com.ruoyi.stock.domain.StockKeyMateri;
import com.ruoyi.stock.service.IStockKeyMateriService;
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
 * 重点原材料库存Controller
 * 
 * @author wangbo
 * @date 2020-12-10
 */
@Controller
@RequestMapping("/Stock/keymaterial")
public class StockKeyMateriController extends BaseController
{
    private String prefix = "Stock/keymaterial";

    @Autowired
    private IStockKeyMateriService stockKeyMateriService;

    @RequiresPermissions("Stock:keymaterial:view")
    @GetMapping()
    public String keymaterial()
    {
        return prefix + "/keymaterial";
    }

    /**
     * 查询重点原材料库存列表
     */
    @RequiresPermissions("Stock:keymaterial:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StockKeyMateri stockKeyMateri)
    {
        startPage();
        List<StockKeyMateri> list = stockKeyMateriService.selectStockKeyMateriList(stockKeyMateri);
        return getDataTable(list);
    }

    /**
     * 导出重点原材料库存列表
     */
    @RequiresPermissions("Stock:keymaterial:export")
    @Log(title = "重点原材料库存", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StockKeyMateri stockKeyMateri)
    {
        List<StockKeyMateri> list = stockKeyMateriService.selectStockKeyMateriList(stockKeyMateri);
        ExcelUtil<StockKeyMateri> util = new ExcelUtil<StockKeyMateri>(StockKeyMateri.class);
        return util.exportExcel(list, "keymaterial");
    }

    /**
     * 新增重点原材料库存
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存重点原材料库存
     */
    @RequiresPermissions("Stock:keymaterial:add")
    @Log(title = "重点原材料库存", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StockKeyMateri stockKeyMateri)
    {
        return toAjax(stockKeyMateriService.insertStockKeyMateri(stockKeyMateri));
    }

    /**
     * 修改重点原材料库存
     */
    @GetMapping("/edit/{keyMateriStockId}")
    public String edit(@PathVariable("keyMateriStockId") Long keyMateriStockId, ModelMap mmap)
    {
        StockKeyMateri stockKeyMateri = stockKeyMateriService.selectStockKeyMateriById(keyMateriStockId);
        mmap.put("stockKeyMateri", stockKeyMateri);
        return prefix + "/edit";
    }

    /**
     * 修改保存重点原材料库存
     */
    @RequiresPermissions("Stock:keymaterial:edit")
    @Log(title = "重点原材料库存", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StockKeyMateri stockKeyMateri)
    {
        return toAjax(stockKeyMateriService.updateStockKeyMateri(stockKeyMateri));
    }

    /**
     * 删除重点原材料库存
     */
    @RequiresPermissions("Stock:keymaterial:remove")
    @Log(title = "重点原材料库存", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stockKeyMateriService.deleteStockKeyMateriByIds(ids));
    }
}
