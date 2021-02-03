package com.ruoyi.web.controller.beancodecom;

import java.util.List;

import com.ruoyi.beancodecom.domain.BeanCode;
import com.ruoyi.beancodecom.domain.BeanCodeScsj;
import com.ruoyi.beancodecom.service.IBeanCodeScsjService;
import com.ruoyi.beancodecom.service.IBeanCodeService;
import com.ruoyi.beancodecom.service.impl.BeanCodeServiceImpl;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.system.service.ISysUserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * 豆码比对Controller
 * 
 * @author 王博
 * @date 2021-01-04
 */
@Controller
@RequestMapping("/BeanCode/BeanCodeCom")
public class BeanCodeController extends BaseController
{
    private String prefix = "BeanCode/BeanCodeCom";

    @Autowired
    private IBeanCodeService beanCodeService;
    @Autowired
    private IBeanCodeScsjService beanCodeScsjService;



    @RequiresPermissions("BeanCode:BeanCodeCom:view")
    @GetMapping()
    public String BeanCodeCom()
    {
        return prefix + "/BeanCodeCom";
    }

    /**
     * 查询豆码比对列表
     */
    @RequiresPermissions("BeanCode:BeanCodeCom:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BeanCode beanCode)
    {
        startPage();
        List<BeanCode> list = beanCodeService.selectBeanCodeList(beanCode);
        return getDataTable(list);
    }

    /**导入
    */
    @RequiresPermissions("BeanCode:BeanCodeCom:import")
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file,boolean updateSupport) throws Exception
    {
        ExcelUtil<BeanCode> util = new ExcelUtil<BeanCode>(BeanCode.class);
        List<BeanCode> BeanCodeList = util.importExcel(file.getInputStream());

        String message = beanCodeService.importBeanCode(BeanCodeList, updateSupport);
        return AjaxResult.success(message);
    }

    // 下载模板
    @RequiresPermissions("BeanCode:BeanCodeCom:view")
    @GetMapping("/importTemplate")
    @ResponseBody
    public AjaxResult importTemplate()
    {
        ExcelUtil<BeanCode> util = new ExcelUtil<BeanCode>(BeanCode.class);
        return util.importTemplateExcel("局方数据");
    }

    /**
     * 导出豆码比对结果
     */
    @RequiresPermissions("BeanCode:BeanCodeCom:exportJg")
    /*@Log(title = "豆码比对结果", businessType = BusinessType.EXPORT)*/
    @PostMapping("/exportJg")
    @ResponseBody
    public AjaxResult exportJg(BeanCode beanCode)
    {
        List<BeanCode> list = beanCodeService.selectBeanCodeJgList(beanCode);
        ExcelUtil<BeanCode> util = new ExcelUtil<BeanCode>(BeanCode.class);
        return util.exportExcel(list, "豆码比对结果");
    }


    /**
     * 导出豆码比对列表
     */
    @RequiresPermissions("BeanCode:BeanCodeCom:export")
    @Log(title = "豆码比对", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BeanCode beanCode)
    {
        /*List<BeanCode> list = beanCodeService.selectBeanCodeList(beanCode);
        ExcelUtil<BeanCode> util = new ExcelUtil<BeanCode>(BeanCode.class);
        return util.exportExcel(list, "BeanCodeCom");*/

        /*比对结果导出*/
        /*局方数据*/
        List<BeanCode> list = beanCodeService.selectBeanCodeList(beanCode);
        ExcelUtil<BeanCode> util = new ExcelUtil<BeanCode>(BeanCode.class);
        return util.exportExcel(list, "豆码数据");



    }

    /**
     * 新增豆码比对
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存豆码比对
     */
    @RequiresPermissions("BeanCode:BeanCodeCom:add")
    @Log(title = "豆码比对", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BeanCode beanCode)
    {
        return toAjax(beanCodeService.insertBeanCode(beanCode));
    }

    /**
     * 修改豆码比对
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        BeanCode beanCode = beanCodeService.selectBeanCodeById(id);
        mmap.put("beanCode", beanCode);
        return prefix + "/edit";
    }

    /**
     * 修改保存豆码比对
     */
    @RequiresPermissions("BeanCode:BeanCodeCom:edit")
    @Log(title = "豆码比对", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BeanCode beanCode)
    {
        return toAjax(beanCodeService.updateBeanCode(beanCode));
    }

    /**
     * 删除豆码比对
     */
    @RequiresPermissions("BeanCode:BeanCodeCom:remove")
    @Log(title = "豆码比对", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(beanCodeService.deleteBeanCodeByIds(ids));
    }

    //删除局方、生产数据的所有数据
    //wangbo
    @RequiresPermissions("BeanCode:BeanCodeCom:deleteall")
    @PostMapping("/deleteall")
    @ResponseBody
    public AjaxResult deleteall() {

        beanCodeService.deleteAlljf();
        beanCodeScsjService.deleteAllscsj();

        return success();

    }

}
