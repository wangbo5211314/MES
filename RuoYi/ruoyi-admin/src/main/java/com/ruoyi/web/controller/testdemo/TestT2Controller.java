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
import com.ruoyi.testdemo.domain.TestT2;
import com.ruoyi.testdemo.service.ITestT2Service;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试时间与人2Controller
 * 
 * @author wangbo
 * @date 2020-12-29
 */
@Controller
@RequestMapping("/TestDemo/timeuser2")
public class TestT2Controller extends BaseController
{
    private String prefix = "TestDemo/timeuser2";

    @Autowired
    private ITestT2Service testT2Service;

    @RequiresPermissions("TestDemo:timeuser2:view")
    @GetMapping()
    public String timeuser2()
    {
        return prefix + "/timeuser2";
    }

    /**
     * 查询测试时间与人2列表
     */
    @RequiresPermissions("TestDemo:timeuser2:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TestT2 testT2)
    {
        startPage();
        List<TestT2> list = testT2Service.selectTestT2List(testT2);
        return getDataTable(list);
    }

    /**
     * 导出测试时间与人2列表
     */
    @RequiresPermissions("TestDemo:timeuser2:export")
    @Log(title = "测试时间与人2", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TestT2 testT2)
    {
        List<TestT2> list = testT2Service.selectTestT2List(testT2);
        ExcelUtil<TestT2> util = new ExcelUtil<TestT2>(TestT2.class);
        return util.exportExcel(list, "timeuser2");
    }

    /**
     * 新增测试时间与人2
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存测试时间与人2
     */
    @RequiresPermissions("TestDemo:timeuser2:add")
    @Log(title = "测试时间与人2", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TestT2 testT2)
    {
        return toAjax(testT2Service.insertTestT2(testT2));
    }

    /**
     * 修改测试时间与人2
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TestT2 testT2 = testT2Service.selectTestT2ById(id);
        mmap.put("testT2", testT2);
        return prefix + "/edit";
    }

    /**
     * 修改保存测试时间与人2
     */
    @RequiresPermissions("TestDemo:timeuser2:edit")
    @Log(title = "测试时间与人2", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TestT2 testT2)
    {
        return toAjax(testT2Service.updateTestT2(testT2));
    }

    /**
     * 删除测试时间与人2
     */
    @RequiresPermissions("TestDemo:timeuser2:remove")
    @Log(title = "测试时间与人2", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(testT2Service.deleteTestT2ByIds(ids));
    }
}
