package com.ruoyi.web.controller.testdemo;

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
import com.ruoyi.testdemo.domain.TestT1;
import com.ruoyi.testdemo.service.ITestT1Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试时间与人Controller
 * 
 * @author wangbo
 * @date 2020-12-29
 */
@Controller
@RequestMapping("/TestDemo/timeuser")
public class TestT1Controller extends BaseController
{
    private String prefix = "TestDemo/timeuser";

    @Autowired
    private ITestT1Service testT1Service;

    @RequiresPermissions("TestDemo:timeuser:view")
    @GetMapping()
    public String timeuser()
    {
        return prefix + "/timeuser";
    }

    /**
     * 查询测试时间与人列表
     */
    @RequiresPermissions("TestDemo:timeuser:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TestT1 testT1)
    {
        startPage();
        List<TestT1> list = testT1Service.selectTestT1List(testT1);
        return getDataTable(list);
    }

    /**
     * 导出测试时间与人列表
     */
    @RequiresPermissions("TestDemo:timeuser:export")
    @Log(title = "测试时间与人", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TestT1 testT1)
    {
        List<TestT1> list = testT1Service.selectTestT1List(testT1);
        ExcelUtil<TestT1> util = new ExcelUtil<TestT1>(TestT1.class);
        return util.exportExcel(list, "timeuser");
    }

    /**
     * 新增测试时间与人
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存测试时间与人
     */
    @RequiresPermissions("TestDemo:timeuser:add")
    @Log(title = "测试时间与人", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TestT1 testT1)
    {
        return toAjax(testT1Service.insertTestT1(testT1));
    }

    /**
     * 修改测试时间与人
     */
    @GetMapping("/edit/{ID}")
    public String edit(@PathVariable("ID") Long ID, ModelMap mmap)
    {
        TestT1 testT1 = testT1Service.selectTestT1ById(ID);
        mmap.put("testT1", testT1);
        return prefix + "/edit";
    }

    /**
     * 修改保存测试时间与人
     */
    @RequiresPermissions("TestDemo:timeuser:edit")
    @Log(title = "测试时间与人", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TestT1 testT1)
    {
        return toAjax(testT1Service.updateTestT1(testT1));
    }

    /**
     * 删除测试时间与人
     */
    @RequiresPermissions("TestDemo:timeuser:remove")
    @Log(title = "测试时间与人", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(testT1Service.deleteTestT1ByIds(ids));
    }
}
