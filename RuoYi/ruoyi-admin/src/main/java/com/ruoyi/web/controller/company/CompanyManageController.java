package com.ruoyi.web.controller.company;

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
import com.ruoyi.company.domain.CompanyManage;
import com.ruoyi.company.service.ICompanyManageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 公司管理Controller
 * 
 * @author wangbo
 * @date 2020-12-14
 */
@Controller
@RequestMapping("/Company/company")
public class CompanyManageController extends BaseController
{
    private String prefix = "Company/company";

    @Autowired
    private ICompanyManageService companyManageService;

    @RequiresPermissions("Company:company:view")
    @GetMapping()
    public String company()
    {
        return prefix + "/company";
    }

    /**
     * 查询公司管理列表
     */
    @RequiresPermissions("Company:company:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CompanyManage companyManage)
    {
        startPage();
        List<CompanyManage> list = companyManageService.selectCompanyManageList(companyManage);
        return getDataTable(list);
    }

    /**
     * 导出公司管理列表
     */
    @RequiresPermissions("Company:company:export")
    @Log(title = "公司管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CompanyManage companyManage)
    {
        List<CompanyManage> list = companyManageService.selectCompanyManageList(companyManage);
        ExcelUtil<CompanyManage> util = new ExcelUtil<CompanyManage>(CompanyManage.class);
        return util.exportExcel(list, "company");
    }

    /**
     * 新增公司管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存公司管理
     */
    @RequiresPermissions("Company:company:add")
    @Log(title = "公司管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CompanyManage companyManage)
    {
        return toAjax(companyManageService.insertCompanyManage(companyManage));
    }

    /**
     * 修改公司管理
     */
    @GetMapping("/edit/{compId}")
    public String edit(@PathVariable("compId") Long compId, ModelMap mmap)
    {
        CompanyManage companyManage = companyManageService.selectCompanyManageById(compId);
        mmap.put("companyManage", companyManage);
        return prefix + "/edit";
    }

    /**
     * 修改保存公司管理
     */
    @RequiresPermissions("Company:company:edit")
    @Log(title = "公司管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CompanyManage companyManage)
    {
        return toAjax(companyManageService.updateCompanyManage(companyManage));
    }

    /**
     * 删除公司管理
     */
    @RequiresPermissions("Company:company:remove")
    @Log(title = "公司管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(companyManageService.deleteCompanyManageByIds(ids));
    }
}
