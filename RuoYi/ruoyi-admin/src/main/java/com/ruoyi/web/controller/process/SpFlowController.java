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
import com.ruoyi.process.domain.SpFlow;
import com.ruoyi.process.service.ISpFlowService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础数据维护-流程Controller
 * 
 * @author wangbo
 * @date 2020-12-23
 */
@Controller
@RequestMapping("/Process/spflow")
public class SpFlowController extends BaseController
{
    private String prefix = "Process/spflow";

    @Autowired
    private ISpFlowService spFlowService;

    @RequiresPermissions("Process:spflow:view")
    @GetMapping()
    public String spflow()
    {
        return prefix + "/spflow";
    }

    /**
     * 查询基础数据维护-流程列表
     */
    @RequiresPermissions("Process:spflow:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SpFlow spFlow)
    {
        startPage();
        List<SpFlow> list = spFlowService.selectSpFlowList(spFlow);
        return getDataTable(list);
    }

    /**
     * 导出基础数据维护-流程列表
     */
    @RequiresPermissions("Process:spflow:export")
    @Log(title = "基础数据维护-流程", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SpFlow spFlow)
    {
        List<SpFlow> list = spFlowService.selectSpFlowList(spFlow);
        ExcelUtil<SpFlow> util = new ExcelUtil<SpFlow>(SpFlow.class);
        return util.exportExcel(list, "spflow");
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
    @RequiresPermissions("Process:spflow:add")
    @Log(title = "基础数据维护-流程", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SpFlow spFlow)
    {
        return toAjax(spFlowService.insertSpFlow(spFlow));
    }

    /**
     * 修改基础数据维护-流程
     */
    @GetMapping("/edit/{spFlowId}")
    public String edit(@PathVariable("spFlowId") Long spFlowId, ModelMap mmap)
    {
        SpFlow spFlow = spFlowService.selectSpFlowById(spFlowId);
        mmap.put("spFlow", spFlow);
        return prefix + "/edit";
    }

    /**
     * 修改保存基础数据维护-流程
     */
    @RequiresPermissions("Process:spflow:edit")
    @Log(title = "基础数据维护-流程", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SpFlow spFlow)
    {
        return toAjax(spFlowService.updateSpFlow(spFlow));
    }

    /**
     * 删除基础数据维护-流程
     */
    @RequiresPermissions("Process:spflow:remove")
    @Log(title = "基础数据维护-流程", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(spFlowService.deleteSpFlowByIds(ids));
    }
}
