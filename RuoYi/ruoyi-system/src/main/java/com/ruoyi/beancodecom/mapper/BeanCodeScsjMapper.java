package com.ruoyi.beancodecom.mapper;

import java.util.List;
import com.ruoyi.beancodecom.domain.BeanCodeScsj;

/**
 * 生产数据豆码Mapper接口
 * 
 * @author 王博
 * @date 2021-01-04
 */
public interface BeanCodeScsjMapper 
{
    /**
     * 查询生产数据豆码
     * 
     * @param id 生产数据豆码ID
     * @return 生产数据豆码
     */
    public BeanCodeScsj selectBeanCodeScsjById(Long id);

    /**
     * 查询生产数据豆码列表
     * 
     * @param beanCodeScsj 生产数据豆码
     * @return 生产数据豆码集合
     */
    public List<BeanCodeScsj> selectBeanCodeScsjList(BeanCodeScsj beanCodeScsj);

    /**
     * 新增生产数据豆码
     * 
     * @param beanCodeScsj 生产数据豆码
     * @return 结果
     */
    public int insertBeanCodeScsj(BeanCodeScsj beanCodeScsj);

    /**
     * 修改生产数据豆码
     * 
     * @param beanCodeScsj 生产数据豆码
     * @return 结果
     */
    public int updateBeanCodeScsj(BeanCodeScsj beanCodeScsj);

    /**
     * 删除生产数据豆码
     * 
     * @param id 生产数据豆码ID
     * @return 结果
     */
    public int deleteBeanCodeScsjById(Long id);

    /**
     * 批量删除生产数据豆码
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBeanCodeScsjByIds(String[] ids);

    /*全部删除*/
    public void deleteAllscsjBeanCode();

    /*查询豆码比对结果导出*/
    public List<BeanCodeScsj> selectBeanCodeScsjJgList(BeanCodeScsj beanCodeScsj);


}
