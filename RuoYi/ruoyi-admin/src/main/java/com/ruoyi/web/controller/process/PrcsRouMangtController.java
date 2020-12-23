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
import com.ruoyi.process.domain.PrcsRouMangt;
import com.ruoyi.process.service.IPrcsRouMangtService;
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
@RequestMapping("/Process/prcsroumangt")
public class PrcsRouMangtController extends BaseController
{
    private String prefix = "Process/prcsroumangt";

    @Autowired
    private IPrcsRouMangtService prcsRouMangtService;

    @RequiresPermissions("Process:prcsroumangt:view")
    @GetMapping()
    public String prcsroumangt()
    {
        return prefix + "/prcsroumangt";
    }

    /**
     * 查询工艺路线管理列表
     */
    @RequiresPermissions("Process:prcsroumangt:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PrcsRouMangt prcsRouMangt)
    {
        startPage();
        List<PrcsRouMangt> list = prcsRouMangtService.selectPrcsRouMangtList(prcsRouMangt);
        return getDataTable(list);
    }

    /**
     * 导出工艺路线管理列表
     */
    @RequiresPermissions("Process:prcsroumangt:export")
    @Log(title = "工艺路线管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PrcsRouMangt prcsRouMangt)
    {
        List<PrcsRouMangt> list = prcsRouMangtService.selectPrcsRouMangtList(prcsRouMangt);
        ExcelUtil<PrcsRouMangt> util = new ExcelUtil<PrcsRouMangt>(PrcsRouMangt.class);
        return util.exportExcel(list, "prcsroumangt");
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
    @RequiresPermissions("Process:prcsroumangt:add")
    @Log(title = "工艺路线管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PrcsRouMangt prcsRouMangt)
    {
        return toAjax(prcsRouMangtService.insertPrcsRouMangt(prcsRouMangt));
    }

    /**
     * 修改工艺路线管理
     */
    @GetMapping("/edit/{spFlowId}")
    public String edit(@PathVariable("spFlowId") Long spFlowId, ModelMap mmap)
    {
        PrcsRouMangt prcsRouMangt = prcsRouMangtService.selectPrcsRouMangtById(spFlowId);
        mmap.put("prcsRouMangt", prcsRouMangt);
        return prefix + "/edit";
    }

    /**
     * 修改保存工艺路线管理
     */
    @RequiresPermissions("Process:prcsroumangt:edit")
    @Log(title = "工艺路线管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PrcsRouMangt prcsRouMangt)
    {
        return toAjax(prcsRouMangtService.updatePrcsRouMangt(prcsRouMangt));
    }

    /**
     * 删除工艺路线管理
     */
    @RequiresPermissions("Process:prcsroumangt:remove")
    @Log(title = "工艺路线管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(prcsRouMangtService.deletePrcsRouMangtByIds(ids));
    }
}
