package com.ruoyi.web.controller.production;

import java.util.List;

import com.ruoyi.production.domain.Production;
import com.ruoyi.production.service.IProductionService;
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
 * 报工信息Controller
 * 
 * @author wangbo
 * @date 2020-12-10
 */
@Controller
@RequestMapping("/Production/reportinfo")
public class ProductionController extends BaseController
{
    private String prefix = "Production/reportinfo";

    @Autowired
    private IProductionService productionService;

    @RequiresPermissions("Production:reportinfo:view")
    @GetMapping()
    public String reportinfo()
    {
        return prefix + "/reportinfo";
    }

    /**
     * 查询报工信息列表
     */
    @RequiresPermissions("Production:reportinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Production production)
    {
        startPage();
        List<Production> list = productionService.selectProductionList(production);
        return getDataTable(list);
    }

    /**
     * 导出报工信息列表
     */
    @RequiresPermissions("Production:reportinfo:export")
    @Log(title = "报工信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Production production)
    {
        List<Production> list = productionService.selectProductionList(production);
        ExcelUtil<Production> util = new ExcelUtil<Production>(Production.class);
        return util.exportExcel(list, "reportinfo");
    }

    /**
     * 新增报工信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存报工信息
     */
    @RequiresPermissions("Production:reportinfo:add")
    @Log(title = "报工信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Production production)
    {
        return toAjax(productionService.insertProduction(production));
    }

    /**
     * 修改报工信息
     */
    @GetMapping("/edit/{repoInfoId}")
    public String edit(@PathVariable("repoInfoId") Long repoInfoId, ModelMap mmap)
    {
        Production production = productionService.selectProductionById(repoInfoId);
        mmap.put("production", production);
        return prefix + "/edit";
    }

    /**
     * 修改保存报工信息
     */
    @RequiresPermissions("Production:reportinfo:edit")
    @Log(title = "报工信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Production production)
    {
        return toAjax(productionService.updateProduction(production));
    }

    /**
     * 删除报工信息
     */
    @RequiresPermissions("Production:reportinfo:remove")
    @Log(title = "报工信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(productionService.deleteProductionByIds(ids));
    }
}
