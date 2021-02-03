package com.ruoyi.beancodecom.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.beancodecom.mapper.ActDataSourceMapper;
import com.ruoyi.beancodecom.domain.ActDataSource;
import com.ruoyi.beancodecom.service.IActDataSourceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 生产数据来源Service业务层处理
 * 
 * @author 王博
 * @date 2021-01-11
 */
@Service
public class ActDataSourceServiceImpl implements IActDataSourceService 
{
    @Autowired
    private ActDataSourceMapper actDataSourceMapper;

    /**
     * 查询生产数据来源
     * 
     * @param id 生产数据来源ID
     * @return 生产数据来源
     */
    @Override
    public ActDataSource selectActDataSourceById(Long id)
    {
        return actDataSourceMapper.selectActDataSourceById(id);
    }

    /**
     * 查询生产数据来源列表
     * 
     * @param actDataSource 生产数据来源
     * @return 生产数据来源
     */
    @Override
    public List<ActDataSource> selectActDataSourceList(ActDataSource actDataSource)
    {
        return actDataSourceMapper.selectActDataSourceList(actDataSource);
    }

    /**
     * 新增生产数据来源
     * 
     * @param actDataSource 生产数据来源
     * @return 结果
     */
    @Override
    public int insertActDataSource(ActDataSource actDataSource)
    {
        return actDataSourceMapper.insertActDataSource(actDataSource);
    }

    /**
     * 修改生产数据来源
     * 
     * @param actDataSource 生产数据来源
     * @return 结果
     */
    @Override
    public int updateActDataSource(ActDataSource actDataSource)
    {
        return actDataSourceMapper.updateActDataSource(actDataSource);
    }

    /**
     * 删除生产数据来源对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteActDataSourceByIds(String ids)
    {
        return actDataSourceMapper.deleteActDataSourceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除生产数据来源信息
     * 
     * @param id 生产数据来源ID
     * @return 结果
     */
    @Override
    public int deleteActDataSourceById(Long id)
    {
        return actDataSourceMapper.deleteActDataSourceById(id);
    }
}
