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
import com.ruoyi.process.domain.SpFlowBase;
import com.ruoyi.process.service.ISpFlowBaseService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础数据维护-流程Controller
 * 
 * @author 王博
 * @date 2021-01-29
 */
@Controller
@RequestMapping("/Process/spflowbase")
public class SpFlowBaseController extends BaseController
{
    private String prefix = "Process/spflowbase";

    @Autowired
    private ISpFlowBaseService spFlowBaseService;

    @RequiresPermissions("Process:spflowbase:view")
    @GetMapping()
    public String spflowbase()
    {
        return prefix + "/spflowbase";
    }

    /**
     * 查询基础数据维护-流程列表
     */
    @RequiresPermissions("Process:spflowbase:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SpFlowBase spFlowBase)
    {
        startPage();
        List<SpFlowBase> list = spFlowBaseService.selectSpFlowBaseList(spFlowBase);
        return getDataTable(list);
    }

    /**
     * 导出基础数据维护-流程列表
     */
    @RequiresPermissions("Process:spflowbase:export")
    @Log(title = "基础数据维护-流程", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SpFlowBase spFlowBase)
    {
        List<SpFlowBase> list = spFlowBaseService.selectSpFlowBaseList(spFlowBase);
        ExcelUtil<SpFlowBase> util = new ExcelUtil<SpFlowBase>(SpFlowBase.class);
        return util.exportExcel(list, "spflowbase");
    }

    /**
     * 新增基础数据维护-流程
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存基础数据维护-流程
     */
    @RequiresPermissions("Process:spflowbase:add")
    @Log(title = "基础数据维护-流程", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SpFlowBase spFlowBase)
    {
        return toAjax(spFlowBaseService.insertSpFlowBase(spFlowBase));
    }

    /**
     * 修改基础数据维护-流程
     */
    @GetMapping("/edit/{spFlowId}")
    public String edit(@PathVariable("spFlowId") Long spFlowId, ModelMap mmap)
    {
        SpFlowBase spFlowBase = spFlowBaseService.selectSpFlowBaseById(spFlowId);
        mmap.put("spFlowBase", spFlowBase);
        return prefix + "/edit";
    }

    /**
     * 修改保存基础数据维护-流程
     */
    @RequiresPermissions("Process:spflowbase:edit")
    @Log(title = "基础数据维护-流程", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SpFlowBase spFlowBase)
    {
        return toAjax(spFlowBaseService.updateSpFlowBase(spFlowBase));
    }

    /**
     * 删除基础数据维护-流程
     */
    @RequiresPermissions("Process:spflowbase:remove")
    @Log(title = "基础数据维护-流程", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(spFlowBaseService.deleteSpFlowBaseByIds(ids));
    }
}
