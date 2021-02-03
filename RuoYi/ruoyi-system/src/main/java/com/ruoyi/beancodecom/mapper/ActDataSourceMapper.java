package com.ruoyi.beancodecom.mapper;

import java.util.List;
import com.ruoyi.beancodecom.domain.ActDataSource;

/**
 * 生产数据来源Mapper接口
 * 
 * @author 王博
 * @date 2021-01-11
 */
public interface ActDataSourceMapper 
{
    /**
     * 查询生产数据来源
     * 
     * @param id 生产数据来源ID
     * @return 生产数据来源
     */
    public ActDataSource selectActDataSourceById(Long id);

    /**
     * 查询生产数据来源列表
     * 
     * @param actDataSource 生产数据来源
     * @return 生产数据来源集合
     */
    public List<ActDataSource> selectActDataSourceList(ActDataSource actDataSource);

    /**
     * 新增生产数据来源
     * 
     * @param actDataSource 生产数据来源
     * @return 结果
     */
    public int insertActDataSource(ActDataSource actDataSource);

    /**
     * 修改生产数据来源
     * 
     * @param actDataSource 生产数据来源
     * @return 结果
     */
    public int updateActDataSource(ActDataSource actDataSource);

    /**
     * 删除生产数据来源
     * 
     * @param id 生产数据来源ID
     * @return 结果
     */
    public int deleteActDataSourceById(Long id);

    /**
     * 批量删除生产数据来源
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteActDataSourceByIds(String[] ids);
}
