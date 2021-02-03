package com.ruoyi.web.controller.beancodecom;

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
import com.ruoyi.beancodecom.domain.ActDataSource;
import com.ruoyi.beancodecom.service.IActDataSourceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 生产数据来源Controller
 * 
 * @author 王博
 * @date 2021-01-11
 */
@Controller
@RequestMapping("/BeanCode/BCscsjSource")
public class ActDataSourceController extends BaseController
{
    private String prefix = "BeanCode/BCscsjSource";

    @Autowired
    private IActDataSourceService actDataSourceService;

    @RequiresPermissions("BeanCode:BCscsjSource:view")
    @GetMapping()
    public String BCscsjSource()
    {
        return prefix + "/BCscsjSource";
    }

    /**
     * 查询生产数据来源列表
     */
    @RequiresPermissions("BeanCode:BCscsjSource:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ActDataSource actDataSource)
    {
        startPage();
        List<ActDataSource> list = actDataSourceService.selectActDataSourceList(actDataSource);
        return getDataTable(list);
    }

    /**
     * 导出生产数据来源列表
     */
    @RequiresPermissions("BeanCode:BCscsjSource:export")
    @Log(title = "生产数据来源", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ActDataSource actDataSource)
    {
        List<ActDataSource> list = actDataSourceService.selectActDataSourceList(actDataSource);
        ExcelUtil<ActDataSource> util = new ExcelUtil<ActDataSource>(ActDataSource.class);
        return util.exportExcel(list, "BCscsjSource");
    }

    /**
     * 新增生产数据来源
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存生产数据来源
     */
    @RequiresPermissions("BeanCode:BCscsjSource:add")
    @Log(title = "生产数据来源", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ActDataSource actDataSource)
    {
        return toAjax(actDataSourceService.insertActDataSource(actDataSource));
    }

    /**
     * 修改生产数据来源
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ActDataSource actDataSource = actDataSourceService.selectActDataSourceById(id);
        mmap.put("actDataSource", actDataSource);
        return prefix + "/edit";
    }

    /**
     * 修改保存生产数据来源
     */
    @RequiresPermissions("BeanCode:BCscsjSource:edit")
    @Log(title = "生产数据来源", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ActDataSource actDataSource)
    {
        return toAjax(actDataSourceService.updateActDataSource(actDataSource));
    }

    /**
     * 删除生产数据来源
     */
    @RequiresPermissions("BeanCode:BCscsjSource:remove")
    @Log(title = "生产数据来源", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(actDataSourceService.deleteActDataSourceByIds(ids));
    }
}
