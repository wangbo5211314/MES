package com.ruoyi.beancodecom.mapper;

import java.util.List;
import com.ruoyi.beancodecom.domain.BeanCode;

/**
 * 豆码比对Mapper接口
 * 
 * @author 王博
 * @date 2021-01-04
 */
public interface BeanCodeMapper 
{
    /**
     * 查询豆码比对
     * 
     * @param id 豆码比对ID
     * @return 豆码比对
     */
    public BeanCode selectBeanCodeById(Long id);

    /**
     * 查询豆码比对列表
     * 
     * @param beanCode 豆码比对
     * @return 豆码比对集合
     */
    public List<BeanCode> selectBeanCodeList(BeanCode beanCode);

    /**
     * 新增豆码比对
     * 
     * @param beanCode 豆码比对
     * @return 结果
     */
    public int insertBeanCode(BeanCode beanCode);

    /**
     * 修改豆码比对
     * 
     * @param beanCode 豆码比对
     * @return 结果
     */
    public int updateBeanCode(BeanCode beanCode);

    /**
     * 删除豆码比对
     * 
     * @param id 豆码比对ID
     * @return 结果
     */
    public int deleteBeanCodeById(Long id);

    /**
     * 批量删除豆码比对
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBeanCodeByIds(String[] ids);

    public void deleteAllBeanCode();

    /*查询豆码比对结果导出*/
    public List<BeanCode> selectBeanCodeJgList(BeanCode beanCode);
}
