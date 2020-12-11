package com.ruoyi.web.controller.rawmate;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateSbejg;
import com.ruoyi.rawmate.service.IRawMateSbejgService;
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
 * 瞬变二极管Controller
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/RawMate/sbejg")
public class RawMateSbejgController extends BaseController
{
    private String prefix = "RawMate/sbejg";

    @Autowired
    private IRawMateSbejgService rawMateSbejgService;

    @RequiresPermissions("RawMate:sbejg:view")
    @GetMapping()
    public String sbejg()
    {
        return prefix + "/sbejg";
    }

    /**
     * 查询瞬变二极管列表
     */
    @RequiresPermissions("RawMate:sbejg:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RawMateSbejg rawMateSbejg)
    {
        startPage();
        List<RawMateSbejg> list = rawMateSbejgService.selectRawMateSbejgList(rawMateSbejg);
        return getDataTable(list);
    }

    /**
     * 导出瞬变二极管列表
     */
    @RequiresPermissions("RawMate:sbejg:export")
    @Log(title = "瞬变二极管", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RawMateSbejg rawMateSbejg)
    {
        List<RawMateSbejg> list = rawMateSbejgService.selectRawMateSbejgList(rawMateSbejg);
        ExcelUtil<RawMateSbejg> util = new ExcelUtil<RawMateSbejg>(RawMateSbejg.class);
        return util.exportExcel(list, "sbejg");
    }

    /**
     * 新增瞬变二极管
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存瞬变二极管
     */
    @RequiresPermissions("RawMate:sbejg:add")
    @Log(title = "瞬变二极管", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RawMateSbejg rawMateSbejg)
    {
        return toAjax(rawMateSbejgService.insertRawMateSbejg(rawMateSbejg));
    }

    /**
     * 修改瞬变二极管
     */
    @GetMapping("/edit/{sbejgId}")
    public String edit(@PathVariable("sbejgId") Long sbejgId, ModelMap mmap)
    {
        RawMateSbejg rawMateSbejg = rawMateSbejgService.selectRawMateSbejgById(sbejgId);
        mmap.put("rawMateSbejg", rawMateSbejg);
        return prefix + "/edit";
    }

    /**
     * 修改保存瞬变二极管
     */
    @RequiresPermissions("RawMate:sbejg:edit")
    @Log(title = "瞬变二极管", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RawMateSbejg rawMateSbejg)
    {
        return toAjax(rawMateSbejgService.updateRawMateSbejg(rawMateSbejg));
    }

    /**
     * 删除瞬变二极管
     */
    @RequiresPermissions("RawMate:sbejg:remove")
    @Log(title = "瞬变二极管", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rawMateSbejgService.deleteRawMateSbejgByIds(ids));
    }
}
