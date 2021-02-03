package com.ruoyi.web.controller.tecsche;

import java.util.List;

import com.ruoyi.order.domain.SalesOrder;
import com.ruoyi.order.service.ISalesOrderService;
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
import com.ruoyi.tecsche.domain.TecScheBom;
import com.ruoyi.tecsche.service.ITecScheBomService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * BOM清单Controller
 * 
 * @author 王博
 * @date 2021-01-12
 */
@Controller
@RequestMapping("/TecSche/tecschebom")
public class TecScheBomController extends BaseController
{
    private String prefix = "TecSche/tecschebom";

    @Autowired
    private ITecScheBomService tecScheBomService;
    private ISalesOrderService salesOrderService;

    @RequiresPermissions("TecSche:tecschebom:view")
    @GetMapping()
    public String tecschebom()
    {
        return prefix + "/tecschebom";
    }

    /**
     * 查询BOM清单列表
     */
    @RequiresPermissions("TecSche:tecschebom:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TecScheBom tecScheBom,SalesOrder salesOrder)
    {
        startPage();
        List<TecScheBom> TSBlist = tecScheBomService.selectTecScheBomList(tecScheBom,salesOrder);
        /*List<TecScheBom> TSBlist = tecScheBomService.selectTecScheBomList(tecScheBom);*//*
        List<SalesOrder> SOlist = salesOrderService.selectSalesOrderList(salesOrder);
        System.out.println("TSBlist"+TSBlist);
        System.out.println("SOlist"+SOlist);
        for (TecScheBom tsb:TSBlist
        ) {
            for (SalesOrder sod:SOlist
            ) {
                if((tsb.getSaleOrderNum()) == (sod.getSaleOrderNum()))
                tsb.setSaleOrderName(sod.getYl());
                System.out.println("获取成功");
            }
        }*/
        return getDataTable(TSBlist);
    }

    /**
     * 导出BOM清单列表
     */
    @RequiresPermissions("TecSche:tecschebom:export")
    @Log(title = "BOM清单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TecScheBom tecScheBom,SalesOrder salesOrder)
    {
        List<TecScheBom> list = tecScheBomService.selectTecScheBomList(tecScheBom,salesOrder);
        ExcelUtil<TecScheBom> util = new ExcelUtil<TecScheBom>(TecScheBom.class);
        return util.exportExcel(list, "tecschebom");
    }

    /**
     * 新增BOM清单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存BOM清单
     */
    @RequiresPermissions("TecSche:tecschebom:add")
    @Log(title = "BOM清单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TecScheBom tecScheBom)
    {
        return toAjax(tecScheBomService.insertTecScheBom(tecScheBom));
    }

    /**
     * 修改BOM清单
     */
    @GetMapping("/edit/{bomId}")
    public String edit(@PathVariable("bomId") Long bomId, ModelMap mmap)
    {
        TecScheBom tecScheBom = tecScheBomService.selectTecScheBomById(bomId);
        mmap.put("tecScheBom", tecScheBom);
        return prefix + "/edit";
    }

    /**
     * 修改保存BOM清单
     */
    @RequiresPermissions("TecSche:tecschebom:edit")
    @Log(title = "BOM清单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TecScheBom tecScheBom)
    {
        return toAjax(tecScheBomService.updateTecScheBom(tecScheBom));
    }

    /**
     * 删除BOM清单
     */
    @RequiresPermissions("TecSche:tecschebom:remove")
    @Log(title = "BOM清单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tecScheBomService.deleteTecScheBomByIds(ids));
    }
}
