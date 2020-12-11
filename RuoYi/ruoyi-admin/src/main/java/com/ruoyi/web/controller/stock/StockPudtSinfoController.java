package com.ruoyi.web.controller.stock;

import java.util.List;

import com.ruoyi.stock.domain.StockPudtSinfo;
import com.ruoyi.stock.service.IStockPudtSinfoService;
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
 * 产成品库存信息Controller
 * 
 * @author wangbo
 * @date 2020-12-10
 */
@Controller
@RequestMapping("/Stock/pudtsinfo")
public class StockPudtSinfoController extends BaseController
{
    private String prefix = "Stock/pudtsinfo";

    @Autowired
    private IStockPudtSinfoService stockPudtSinfoService;

    @RequiresPermissions("Stock:pudtsinfo:view")
    @GetMapping()
    public String pudtsinfo()
    {
        return prefix + "/pudtsinfo";
    }

    /**
     * 查询产成品库存信息列表
     */
    @RequiresPermissions("Stock:pudtsinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StockPudtSinfo stockPudtSinfo)
    {
        startPage();
        List<StockPudtSinfo> list = stockPudtSinfoService.selectStockPudtSinfoList(stockPudtSinfo);
        return getDataTable(list);
    }

    /**
     * 导出产成品库存信息列表
     */
    @RequiresPermissions("Stock:pudtsinfo:export")
    @Log(title = "产成品库存信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StockPudtSinfo stockPudtSinfo)
    {
        List<StockPudtSinfo> list = stockPudtSinfoService.selectStockPudtSinfoList(stockPudtSinfo);
        ExcelUtil<StockPudtSinfo> util = new ExcelUtil<StockPudtSinfo>(StockPudtSinfo.class);
        return util.exportExcel(list, "pudtsinfo");
    }

    /**
     * 新增产成品库存信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存产成品库存信息
     */
    @RequiresPermissions("Stock:pudtsinfo:add")
    @Log(title = "产成品库存信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StockPudtSinfo stockPudtSinfo)
    {
        return toAjax(stockPudtSinfoService.insertStockPudtSinfo(stockPudtSinfo));
    }

    /**
     * 修改产成品库存信息
     */
    @GetMapping("/edit/{pudtSinfoId}")
    public String edit(@PathVariable("pudtSinfoId") Long pudtSinfoId, ModelMap mmap)
    {
        StockPudtSinfo stockPudtSinfo = stockPudtSinfoService.selectStockPudtSinfoById(pudtSinfoId);
        mmap.put("stockPudtSinfo", stockPudtSinfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存产成品库存信息
     */
    @RequiresPermissions("Stock:pudtsinfo:edit")
    @Log(title = "产成品库存信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StockPudtSinfo stockPudtSinfo)
    {
        return toAjax(stockPudtSinfoService.updateStockPudtSinfo(stockPudtSinfo));
    }

    /**
     * 删除产成品库存信息
     */
    @RequiresPermissions("Stock:pudtsinfo:remove")
    @Log(title = "产成品库存信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stockPudtSinfoService.deleteStockPudtSinfoByIds(ids));
    }
}
