package com.ruoyi.web.controller.process;

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
import com.ruoyi.process.domain.SpTableManager;
import com.ruoyi.process.service.ISpTableManagerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础数据配置平台Controller
 * 
 * @author wangbo
 * @date 2020-12-22
 */
@Controller
@RequestMapping("/Process/sptablemanager")
public class SpTableManagerController extends BaseController
{
    private String prefix = "Process/sptablemanager";

    @Autowired
    private ISpTableManagerService spTableManagerService;

    @RequiresPermissions("Process:sptablemanager:view")
    @GetMapping()
    public String sptablemanager()
    {
        return prefix + "/sptablemanager";
    }

    /**
     * 查询基础数据配置平台列表
     */
    @RequiresPermissions("Process:sptablemanager:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SpTableManager spTableManager)
    {
        startPage();
        List<SpTableManager> list = spTableManagerService.selectSpTableManagerList(spTableManager);
        return getDataTable(list);
    }

    /**
     * 导出基础数据配置平台列表
     */
    @RequiresPermissions("Process:sptablemanager:export")
    @Log(title = "基础数据配置平台", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SpTableManager spTableManager)
    {
        List<SpTableManager> list = spTableManagerService.selectSpTableManagerList(spTableManager);
        ExcelUtil<SpTableManager> util = new ExcelUtil<SpTableManager>(SpTableManager.class);
        return util.exportExcel(list, "sptablemanager");
    }

    /**
     * 新增基础数据配置平台
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存基础数据配置平台
     */
    @RequiresPermissions("Process:sptablemanager:add")
    @Log(title = "基础数据配置平台", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SpTableManager spTableManager)
    {
        return toAjax(spTableManagerService.insertSpTableManager(spTableManager));
    }

    /**
     * 修改基础数据配置平台
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SpTableManager spTableManager = spTableManagerService.selectSpTableManagerById(id);
        mmap.put("spTableManager", spTableManager);
        return prefix + "/edit";
    }

    /**
     * 修改保存基础数据配置平台
     */
    @RequiresPermissions("Process:sptablemanager:edit")
    @Log(title = "基础数据配置平台", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SpTableManager spTableManager)
    {
        return toAjax(spTableManagerService.updateSpTableManager(spTableManager));
    }

    /**
     * 删除基础数据配置平台
     */
    @RequiresPermissions("Process:sptablemanager:remove")
    @Log(title = "基础数据配置平台", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(spTableManagerService.deleteSpTableManagerByIds(ids));
    }
}
