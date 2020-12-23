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
import com.ruoyi.process.domain.PrcsRouTest;
import com.ruoyi.process.service.IPrcsRouTestService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工艺路线管理测试Controller
 * 
 * @author wangbo
 * @date 2020-12-23
 */
@Controller
@RequestMapping("/Process/prcsroutest")
public class PrcsRouTestController extends BaseController
{
    private String prefix = "Process/prcsroutest";

    @Autowired
    private IPrcsRouTestService prcsRouTestService;

    @RequiresPermissions("Process:prcsroutest:view")
    @GetMapping()
    public String prcsroutest()
    {
        return prefix + "/prcsroutest";
    }

    /**
     * 查询工艺路线管理测试列表
     */
    @RequiresPermissions("Process:prcsroutest:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PrcsRouTest prcsRouTest)
    {
        startPage();
        List<PrcsRouTest> list = prcsRouTestService.selectPrcsRouTestList(prcsRouTest);
        return getDataTable(list);
    }

    /**
     * 导出工艺路线管理测试列表
     */
    @RequiresPermissions("Process:prcsroutest:export")
    @Log(title = "工艺路线管理测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PrcsRouTest prcsRouTest)
    {
        List<PrcsRouTest> list = prcsRouTestService.selectPrcsRouTestList(prcsRouTest);
        ExcelUtil<PrcsRouTest> util = new ExcelUtil<PrcsRouTest>(PrcsRouTest.class);
        return util.exportExcel(list, "prcsroutest");
    }

    /**
     * 新增工艺路线管理测试
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工艺路线管理测试
     */
    @RequiresPermissions("Process:prcsroutest:add")
    @Log(title = "工艺路线管理测试", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PrcsRouTest prcsRouTest)
    {
        return toAjax(prcsRouTestService.insertPrcsRouTest(prcsRouTest));
    }

    /**
     * 修改工艺路线管理测试
     */
    @GetMapping("/edit/{spFlowId}")
    public String edit(@PathVariable("spFlowId") Long spFlowId, ModelMap mmap)
    {
        PrcsRouTest prcsRouTest = prcsRouTestService.selectPrcsRouTestById(spFlowId);
        mmap.put("prcsRouTest", prcsRouTest);
        return prefix + "/edit";
    }

    /**
     * 修改保存工艺路线管理测试
     */
    @RequiresPermissions("Process:prcsroutest:edit")
    @Log(title = "工艺路线管理测试", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PrcsRouTest prcsRouTest)
    {
        return toAjax(prcsRouTestService.updatePrcsRouTest(prcsRouTest));
    }

    /**
     * 删除工艺路线管理测试
     */
    @RequiresPermissions("Process:prcsroutest:remove")
    @Log(title = "工艺路线管理测试", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(prcsRouTestService.deletePrcsRouTestByIds(ids));
    }
}
