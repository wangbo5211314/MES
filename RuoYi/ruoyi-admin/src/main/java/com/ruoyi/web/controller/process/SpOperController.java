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
import com.ruoyi.process.domain.SpOper;
import com.ruoyi.process.service.ISpOperService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础数据维护-工序Controller
 * 
 * @author wangbo
 * @date 2020-12-23
 */
@Controller
@RequestMapping("/Process/spoper")
public class SpOperController extends BaseController
{
    private String prefix = "Process/spoper";

    @Autowired
    private ISpOperService spOperService;

    @RequiresPermissions("Process:spoper:view")
    @GetMapping()
    public String spoper()
    {
        return prefix + "/spoper";
    }

    /**
     * 查询基础数据维护-工序列表
     */
    @RequiresPermissions("Process:spoper:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SpOper spOper)
    {
        startPage();
        List<SpOper> list = spOperService.selectSpOperList(spOper);
        return getDataTable(list);
    }

    /**
     * 导出基础数据维护-工序列表
     */
    @RequiresPermissions("Process:spoper:export")
    @Log(title = "基础数据维护-工序", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SpOper spOper)
    {
        List<SpOper> list = spOperService.selectSpOperList(spOper);
        ExcelUtil<SpOper> util = new ExcelUtil<SpOper>(SpOper.class);
        return util.exportExcel(list, "spoper");
    }

    /**
     * 新增基础数据维护-工序
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存基础数据维护-工序
     */
    @RequiresPermissions("Process:spoper:add")
    @Log(title = "基础数据维护-工序", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SpOper spOper)
    {
        return toAjax(spOperService.insertSpOper(spOper));
    }

    /**
     * 修改基础数据维护-工序
     */
    @GetMapping("/edit/{spOperId}")
    public String edit(@PathVariable("spOperId") Long spOperId, ModelMap mmap)
    {
        SpOper spOper = spOperService.selectSpOperById(spOperId);
        mmap.put("spOper", spOper);
        return prefix + "/edit";
    }

    /**
     * 修改保存基础数据维护-工序
     */
    @RequiresPermissions("Process:spoper:edit")
    @Log(title = "基础数据维护-工序", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SpOper spOper)
    {
        return toAjax(spOperService.updateSpOper(spOper));
    }

    /**
     * 删除基础数据维护-工序
     */
    @RequiresPermissions("Process:spoper:remove")
    @Log(title = "基础数据维护-工序", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(spOperService.deleteSpOperByIds(ids));
    }
}
