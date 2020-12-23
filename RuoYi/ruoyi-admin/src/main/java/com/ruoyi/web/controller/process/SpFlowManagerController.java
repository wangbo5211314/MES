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
import com.ruoyi.process.domain.SpFlowManager;
import com.ruoyi.process.service.ISpFlowManagerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工艺路线管理Controller
 * 
 * @author wangbo
 * @date 2020-12-23
 */
@Controller
@RequestMapping("/Process/spflowmanager")
public class SpFlowManagerController extends BaseController
{
    private String prefix = "Process/spflowmanager";

    @Autowired
    private ISpFlowManagerService spFlowManagerService;

    @RequiresPermissions("Process:spflowmanager:view")
    @GetMapping()
    public String spflowmanager()
    {
        return prefix + "/spflowmanager";
    }

    /**
     * 查询工艺路线管理列表
     */
    @RequiresPermissions("Process:spflowmanager:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SpFlowManager spFlowManager)
    {
        startPage();
        List<SpFlowManager> list = spFlowManagerService.selectSpFlowManagerList(spFlowManager);
        return getDataTable(list);
    }

    /**
     * 导出工艺路线管理列表
     */
    @RequiresPermissions("Process:spflowmanager:export")
    @Log(title = "工艺路线管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SpFlowManager spFlowManager)
    {
        List<SpFlowManager> list = spFlowManagerService.selectSpFlowManagerList(spFlowManager);
        ExcelUtil<SpFlowManager> util = new ExcelUtil<SpFlowManager>(SpFlowManager.class);
        return util.exportExcel(list, "spflowmanager");
    }

    /**
     * 新增工艺路线管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工艺路线管理
     */
    @RequiresPermissions("Process:spflowmanager:add")
    @Log(title = "工艺路线管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SpFlowManager spFlowManager)
    {
        return toAjax(spFlowManagerService.insertSpFlowManager(spFlowManager));
    }

    /**
     * 修改工艺路线管理
     */
    @GetMapping("/edit/{spFlowId}")
    public String edit(@PathVariable("spFlowId") Long spFlowId, ModelMap mmap)
    {
        SpFlowManager spFlowManager = spFlowManagerService.selectSpFlowManagerById(spFlowId);
        mmap.put("spFlowManager", spFlowManager);
        return prefix + "/edit";
    }

    /**
     * 修改保存工艺路线管理
     */
    @RequiresPermissions("Process:spflowmanager:edit")
    @Log(title = "工艺路线管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SpFlowManager spFlowManager)
    {
        return toAjax(spFlowManagerService.updateSpFlowManager(spFlowManager));
    }

    /**
     * 删除工艺路线管理
     */
    @RequiresPermissions("Process:spflowmanager:remove")
    @Log(title = "工艺路线管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(spFlowManagerService.deleteSpFlowManagerByIds(ids));
    }
}
