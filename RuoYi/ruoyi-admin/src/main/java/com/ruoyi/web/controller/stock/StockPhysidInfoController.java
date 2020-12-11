package com.ruoyi.web.controller.stock;

import java.util.List;

import com.ruoyi.stock.domain.StockPhysidInfo;
import com.ruoyi.stock.service.IStockPhysidInfoService;
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
 * 实物ID 信息Controller
 * 
 * @author wnagbo
 * @date 2020-12-10
 */
@Controller
@RequestMapping("/Stock/phsyidinfo")
public class StockPhysidInfoController extends BaseController
{
    private String prefix = "Stock/phsyidinfo";

    @Autowired
    private IStockPhysidInfoService stockPhysidInfoService;

    @RequiresPermissions("Stock:phsyidinfo:view")
    @GetMapping()
    public String phsyidinfo()
    {
        return prefix + "/phsyidinfo";
    }

    /**
     * 查询实物ID 信息列表
     */
    @RequiresPermissions("Stock:phsyidinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StockPhysidInfo stockPhysidInfo)
    {
        startPage();
        List<StockPhysidInfo> list = stockPhysidInfoService.selectStockPhysidInfoList(stockPhysidInfo);
        return getDataTable(list);
    }

    /**
     * 导出实物ID 信息列表
     */
    @RequiresPermissions("Stock:phsyidinfo:export")
    @Log(title = "实物ID 信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StockPhysidInfo stockPhysidInfo)
    {
        List<StockPhysidInfo> list = stockPhysidInfoService.selectStockPhysidInfoList(stockPhysidInfo);
        ExcelUtil<StockPhysidInfo> util = new ExcelUtil<StockPhysidInfo>(StockPhysidInfo.class);
        return util.exportExcel(list, "phsyidinfo");
    }

    /**
     * 新增实物ID 信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存实物ID 信息
     */
    @RequiresPermissions("Stock:phsyidinfo:add")
    @Log(title = "实物ID 信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StockPhysidInfo stockPhysidInfo)
    {
        return toAjax(stockPhysidInfoService.insertStockPhysidInfo(stockPhysidInfo));
    }

    /**
     * 修改实物ID 信息
     */
    @GetMapping("/edit/{phsyidInfoId}")
    public String edit(@PathVariable("phsyidInfoId") Long phsyidInfoId, ModelMap mmap)
    {
        StockPhysidInfo stockPhysidInfo = stockPhysidInfoService.selectStockPhysidInfoById(phsyidInfoId);
        mmap.put("stockPhysidInfo", stockPhysidInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存实物ID 信息
     */
    @RequiresPermissions("Stock:phsyidinfo:edit")
    @Log(title = "实物ID 信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StockPhysidInfo stockPhysidInfo)
    {
        return toAjax(stockPhysidInfoService.updateStockPhysidInfo(stockPhysidInfo));
    }

    /**
     * 删除实物ID 信息
     */
    @RequiresPermissions("Stock:phsyidinfo:remove")
    @Log(title = "实物ID 信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stockPhysidInfoService.deleteStockPhysidInfoByIds(ids));
    }
}
