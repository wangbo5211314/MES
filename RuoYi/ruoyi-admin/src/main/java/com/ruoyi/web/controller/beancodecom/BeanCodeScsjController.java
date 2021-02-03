package com.ruoyi.web.controller.beancodecom;

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
import com.ruoyi.beancodecom.domain.BeanCodeScsj;
import com.ruoyi.beancodecom.service.IBeanCodeScsjService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 生产数据豆码Controller
 * 
 * @author 王博
 * @date 2021-01-04
 */
@Controller
@RequestMapping("/BeanCode/BeanCodescsj")
public class BeanCodeScsjController extends BaseController
{
    private String prefix = "BeanCode/BeanCodescsj";

    @Autowired
    private IBeanCodeScsjService beanCodeScsjService;


    @RequiresPermissions("BeanCode:BeanCodescsj:view")
    @GetMapping()
    public String BeanCodescsj()
    {
        return prefix + "/BeanCodescsj";
    }

    /**
     * 查询生产数据豆码列表
     */
    @RequiresPermissions("BeanCode:BeanCodescsj:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BeanCodeScsj beanCodeScsj)
    {
        startPage();
        List<BeanCodeScsj> list = beanCodeScsjService.selectBeanCodeScsjList(beanCodeScsj);
        return getDataTable(list);
    }

    /**导入
     */
    @RequiresPermissions("BeanCode:BeanCodeCom:import")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<BeanCodeScsj> util = new ExcelUtil<BeanCodeScsj>(BeanCodeScsj.class);
        List<BeanCodeScsj> beanCodeScsjList = util.importExcel(file.getInputStream());

        String message = beanCodeScsjService.importBeanCodeScsj(beanCodeScsjList, updateSupport);
        return AjaxResult.success(message);
    }

    // 下载模板
    @RequiresPermissions("BeanCode:BeanCodeCom:view")
    @GetMapping("/importTemplate")
    @ResponseBody
    public AjaxResult importTemplate()
    {
        ExcelUtil<BeanCodeScsj> util = new ExcelUtil<BeanCodeScsj>(BeanCodeScsj.class);
        return util.importTemplateExcel("生产数据");
    }

    /**
     * 导出生产数据豆码列表
     */
    @RequiresPermissions("BeanCode:BeanCodescsj:export")
    @Log(title = "生产数据豆码", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BeanCodeScsj beanCodeScsj)
    {
        List<BeanCodeScsj> list = beanCodeScsjService.selectBeanCodeScsjList(beanCodeScsj);
        ExcelUtil<BeanCodeScsj> util = new ExcelUtil<BeanCodeScsj>(BeanCodeScsj.class);
        return util.exportExcel(list, "BeanCodescsj");
    }

    /**
     * 新增生产数据豆码
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存生产数据豆码
     */
    @RequiresPermissions("BeanCode:BeanCodescsj:add")
    @Log(title = "生产数据豆码", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BeanCodeScsj beanCodeScsj)
    {
        return toAjax(beanCodeScsjService.insertBeanCodeScsj(beanCodeScsj));
    }

    /**
     * 修改生产数据豆码
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BeanCodeScsj beanCodeScsj = beanCodeScsjService.selectBeanCodeScsjById(id);
        mmap.put("beanCodeScsj", beanCodeScsj);
        return prefix + "/edit";
    }

    /**
     * 修改保存生产数据豆码
     */
    @RequiresPermissions("BeanCode:BeanCodescsj:edit")
    @Log(title = "生产数据豆码", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BeanCodeScsj beanCodeScsj)
    {
        return toAjax(beanCodeScsjService.updateBeanCodeScsj(beanCodeScsj));
    }

    /**
     * 删除生产数据豆码
     */
    @RequiresPermissions("BeanCode:BeanCodescsj:remove")
    @Log(title = "生产数据豆码", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(beanCodeScsjService.deleteBeanCodeScsjByIds(ids));
    }
}
