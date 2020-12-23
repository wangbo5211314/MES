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
import com.ruoyi.process.domain.PrcsRouGL;
import com.ruoyi.process.service.IPrcsRouGLService;
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
@RequestMapping("/Process/prcsrougl")
public class PrcsRouGLController extends BaseController
{
    private String prefix = "Process/prcsrougl";

    @Autowired
    private IPrcsRouGLService prcsRouGLService;

    @RequiresPermissions("Process:prcsrougl:view")
    @GetMapping()
    public String prcsrougl()
    {
        return prefix + "/prcsrougl";
    }

    /**
     * 查询工艺路线管理列表
     */
    @RequiresPermissions("Process:prcsrougl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PrcsRouGL prcsRouGL)
    {
        startPage();
        List<PrcsRouGL> list = prcsRouGLService.selectPrcsRouGLList(prcsRouGL);
        return getDataTable(list);
    }

    /**
     * 导出工艺路线管理列表
     */
    @RequiresPermissions("Process:prcsrougl:export")
    @Log(title = "工艺路线管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PrcsRouGL prcsRouGL)
    {
        List<PrcsRouGL> list = prcsRouGLService.selectPrcsRouGLList(prcsRouGL);
        ExcelUtil<PrcsRouGL> util = new ExcelUtil<PrcsRouGL>(PrcsRouGL.class);
        return util.exportExcel(list, "prcsrougl");
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
    @RequiresPermissions("Process:prcsrougl:add")
    @Log(title = "工艺路线管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PrcsRouGL prcsRouGL)
    {
        return toAjax(prcsRouGLService.insertPrcsRouGL(prcsRouGL));
    }

    /**
     * 修改工艺路线管理
     */
    @GetMapping("/edit/{spFlowId}")
    public String edit(@PathVariable("spFlowId") Long spFlowId, ModelMap mmap)
    {
        PrcsRouGL prcsRouGL = prcsRouGLService.selectPrcsRouGLById(spFlowId);
        mmap.put("prcsRouGL", prcsRouGL);
        return prefix + "/edit";
    }

    /**
     * 修改保存工艺路线管理
     */
    @RequiresPermissions("Process:prcsrougl:edit")
    @Log(title = "工艺路线管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PrcsRouGL prcsRouGL)
    {
        return toAjax(prcsRouGLService.updatePrcsRouGL(prcsRouGL));
    }

    /**
     * 删除工艺路线管理
     */
    @RequiresPermissions("Process:prcsrougl:remove")
    @Log(title = "工艺路线管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(prcsRouGLService.deletePrcsRouGLByIds(ids));
    }
}
