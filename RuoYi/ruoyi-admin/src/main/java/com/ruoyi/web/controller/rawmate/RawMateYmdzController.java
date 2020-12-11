package com.ruoyi.web.controller.rawmate;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateYmdz;
import com.ruoyi.rawmate.service.IRawMateYmdzService;
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
 * 压敏电阻Controller
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Controller
@RequestMapping("/RawMate/ymdz")
public class RawMateYmdzController extends BaseController
{
    private String prefix = "RawMate/ymdz";

    @Autowired
    private IRawMateYmdzService rawMateYmdzService;

    @RequiresPermissions("RawMate:ymdz:view")
    @GetMapping()
    public String ymdz()
    {
        return prefix + "/ymdz";
    }

    /**
     * 查询压敏电阻列表
     */
    @RequiresPermissions("RawMate:ymdz:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RawMateYmdz rawMateYmdz)
    {
        startPage();
        List<RawMateYmdz> list = rawMateYmdzService.selectRawMateYmdzList(rawMateYmdz);
        return getDataTable(list);
    }

    /**
     * 导出压敏电阻列表
     */
    @RequiresPermissions("RawMate:ymdz:export")
    @Log(title = "压敏电阻", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RawMateYmdz rawMateYmdz)
    {
        List<RawMateYmdz> list = rawMateYmdzService.selectRawMateYmdzList(rawMateYmdz);
        ExcelUtil<RawMateYmdz> util = new ExcelUtil<RawMateYmdz>(RawMateYmdz.class);
        return util.exportExcel(list, "ymdz");
    }

    /**
     * 新增压敏电阻
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存压敏电阻
     */
    @RequiresPermissions("RawMate:ymdz:add")
    @Log(title = "压敏电阻", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RawMateYmdz rawMateYmdz)
    {
        return toAjax(rawMateYmdzService.insertRawMateYmdz(rawMateYmdz));
    }

    /**
     * 修改压敏电阻
     */
    @GetMapping("/edit/{varistorId}")
    public String edit(@PathVariable("varistorId") Long varistorId, ModelMap mmap)
    {
        RawMateYmdz rawMateYmdz = rawMateYmdzService.selectRawMateYmdzById(varistorId);
        mmap.put("rawMateYmdz", rawMateYmdz);
        return prefix + "/edit";
    }

    /**
     * 修改保存压敏电阻
     */
    @RequiresPermissions("RawMate:ymdz:edit")
    @Log(title = "压敏电阻", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RawMateYmdz rawMateYmdz)
    {
        return toAjax(rawMateYmdzService.updateRawMateYmdz(rawMateYmdz));
    }

    /**
     * 删除压敏电阻
     */
    @RequiresPermissions("RawMate:ymdz:remove")
    @Log(title = "压敏电阻", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rawMateYmdzService.deleteRawMateYmdzByIds(ids));
    }
}
