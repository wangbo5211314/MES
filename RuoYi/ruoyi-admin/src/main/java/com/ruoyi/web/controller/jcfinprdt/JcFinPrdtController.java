package com.ruoyi.web.controller.jcfinprdt;

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
import com.ruoyi.jcfinprdt.domain.JcFinPrdt;
import com.ruoyi.jcfinprdt.service.IJcFinPrdtService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 成品检测Controller
 * 
 * @author 王博
 * @date 2021-01-28
 */
@Controller
@RequestMapping("/QualityMan/jcfinprdt")
public class JcFinPrdtController extends BaseController
{
    private String prefix = "QualityMan/jcfinprdt";

    @Autowired
    private IJcFinPrdtService jcFinPrdtService;

    @RequiresPermissions("QualityMan:jcfinprdt:view")
    @GetMapping()
    public String jcfinprdt()
    {
        return prefix + "/jcfinprdt";
    }

    /**
     * 查询成品检测列表
     */
    @RequiresPermissions("QualityMan:jcfinprdt:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(JcFinPrdt jcFinPrdt)
    {
        startPage();
        List<JcFinPrdt> list = jcFinPrdtService.selectJcFinPrdtList(jcFinPrdt);
        return getDataTable(list);
    }

    /**
     * 导出成品检测列表
     */
    @RequiresPermissions("QualityMan:jcfinprdt:export")
    @Log(title = "成品检测", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(JcFinPrdt jcFinPrdt)
    {
        List<JcFinPrdt> list = jcFinPrdtService.selectJcFinPrdtList(jcFinPrdt);
        ExcelUtil<JcFinPrdt> util = new ExcelUtil<JcFinPrdt>(JcFinPrdt.class);
        return util.exportExcel(list, "jcfinprdt");
    }

    /**
     * 新增成品检测
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存成品检测
     */
    @RequiresPermissions("QualityMan:jcfinprdt:add")
    @Log(title = "成品检测", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(JcFinPrdt jcFinPrdt)
    {
        return toAjax(jcFinPrdtService.insertJcFinPrdt(jcFinPrdt));
    }

    /**
     * 修改成品检测
     */
    @GetMapping("/edit/{cpjcbId}")
    public String edit(@PathVariable("cpjcbId") Long cpjcbId, ModelMap mmap)
    {
        JcFinPrdt jcFinPrdt = jcFinPrdtService.selectJcFinPrdtById(cpjcbId);
        mmap.put("jcFinPrdt", jcFinPrdt);
        return prefix + "/edit";
    }

    /**
     * 修改保存成品检测
     */
    @RequiresPermissions("QualityMan:jcfinprdt:edit")
    @Log(title = "成品检测", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(JcFinPrdt jcFinPrdt)
    {
        return toAjax(jcFinPrdtService.updateJcFinPrdt(jcFinPrdt));
    }

    /**
     * 删除成品检测
     */
    @RequiresPermissions("QualityMan:jcfinprdt:remove")
    @Log(title = "成品检测", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(jcFinPrdtService.deleteJcFinPrdtByIds(ids));
    }
}
