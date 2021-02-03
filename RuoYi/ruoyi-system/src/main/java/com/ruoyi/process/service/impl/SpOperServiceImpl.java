package com.ruoyi.process.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.process.mapper.SpOperMapper;
import com.ruoyi.process.domain.SpOper;
import com.ruoyi.process.service.ISpOperService;
import com.ruoyi.common.core.text.Convert;

/**
 * 基础数据维护-工序Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-23
 */
@Service("spoper")
public class SpOperServiceImpl implements ISpOperService 
{
    @Autowired
    private SpOperMapper spOperMapper;

    /**
     * 查询基础数据维护-工序
     * 
     * @param spOperId 基础数据维护-工序ID
     * @return 基础数据维护-工序
     */
    @Override
    public SpOper selectSpOperById(Long spOperId)
    {
        return spOperMapper.selectSpOperById(spOperId);
    }

    /**
     * 查询基础数据维护-工序列表
     * 
     * @param spOper 基础数据维护-工序
     * @return 基础数据维护-工序
     */
    @Override
    public List<SpOper> selectSpOperList(SpOper spOper)
    {
        return spOperMapper.selectSpOperList(spOper);
    }

    /**
     * 新增基础数据维护-工序
     * 
     * @param spOper 基础数据维护-工序
     * @return 结果
     */
    @Override
    public int insertSpOper(SpOper spOper)
    {
        spOper.setCreateTime(DateUtils.getNowDate());
        return spOperMapper.insertSpOper(spOper);
    }

    /**
     * 修改基础数据维护-工序
     * 
     * @param spOper 基础数据维护-工序
     * @return 结果
     */
    @Override
    public int updateSpOper(SpOper spOper)
    {
        spOper.setUpdateTime(DateUtils.getNowDate());
        return spOperMapper.updateSpOper(spOper);
    }

    /**
     * 删除基础数据维护-工序对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSpOperByIds(String ids)
    {
        return spOperMapper.deleteSpOperByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除基础数据维护-工序信息
     * 
     * @param spOperId 基础数据维护-工序ID
     * @return 结果
     */
    @Override
    public int deleteSpOperById(Long spOperId)
    {
        return spOperMapper.deleteSpOperById(spOperId);
    }
}
