package com.ruoyi.web.controller.jiance;

import java.util.List;

import com.ruoyi.jiance.domain.DetectImageResult;
import com.ruoyi.jiance.service.IDetectImageResultService;
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
 * 图像结论表Controller
 * 
 * @author wangbo
 * @date 2020-12-15
 */
@Controller
@RequestMapping("/jiance/imageresult")
public class DetectImageResultController extends BaseController
{
    private String prefix = "jiance/imageresult";

    @Autowired
    private IDetectImageResultService detectImageResultService;

    @RequiresPermissions("jiance:imageresult:view")
    @GetMapping()
    public String imageresult()
    {
        return prefix + "/imageresult";
    }

    /**
     * 查询图像结论表列表
     */
    @RequiresPermissions("jiance:imageresult:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DetectImageResult detectImageResult)
    {
        startPage();
        List<DetectImageResult> list = detectImageResultService.selectDetectImageResultList(detectImageResult);
        return getDataTable(list);
    }

    /**
     * 导出图像结论表列表
     */
    @RequiresPermissions("jiance:imageresult:export")
    @Log(title = "图像结论表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DetectImageResult detectImageResult)
    {
        List<DetectImageResult> list = detectImageResultService.selectDetectImageResultList(detectImageResult);
        ExcelUtil<DetectImageResult> util = new ExcelUtil<DetectImageResult>(DetectImageResult.class);
        return util.exportExcel(list, "imageresult");
    }

    /**
     * 新增图像结论表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存图像结论表
     */
    @RequiresPermissions("jiance:imageresult:add")
    @Log(title = "图像结论表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DetectImageResult detectImageResult)
    {
        return toAjax(detectImageResultService.insertDetectImageResult(detectImageResult));
    }

    /**
     * 修改图像结论表
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        DetectImageResult detectImageResult = detectImageResultService.selectDetectImageResultById(id);
        mmap.put("detectImageResult", detectImageResult);
        return prefix + "/edit";
    }

    /**
     * 修改保存图像结论表
     */
    @RequiresPermissions("jiance:imageresult:edit")
    @Log(title = "图像结论表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DetectImageResult detectImageResult)
    {
        return toAjax(detectImageResultService.updateDetectImageResult(detectImageResult));
    }

    /**
     * 删除图像结论表
     */
    @RequiresPermissions("jiance:imageresult:remove")
    @Log(title = "图像结论表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(detectImageResultService.deleteDetectImageResultByIds(ids));
    }
}
