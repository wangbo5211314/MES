package com.ruoyi.process.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.process.mapper.SpFlowBaseMapper;
import com.ruoyi.process.domain.SpFlowBase;
import com.ruoyi.process.service.ISpFlowBaseService;
import com.ruoyi.common.core.text.Convert;

/**
 * 基础数据维护-流程Service业务层处理
 * 
 * @author 王博
 * @date 2021-01-29
 */
@Service("spflowbase")
public class SpFlowBaseServiceImpl implements ISpFlowBaseService 
{
    @Autowired
    private SpFlowBaseMapper spFlowBaseMapper;

    /**
     * 查询基础数据维护-流程
     * 
     * @param spFlowId 基础数据维护-流程ID
     * @return 基础数据维护-流程
     */
    @Override
    public SpFlowBase selectSpFlowBaseById(Long spFlowId)
    {
        return spFlowBaseMapper.selectSpFlowBaseById(spFlowId);
    }

    /**
     * 查询基础数据维护-流程列表
     * 
     * @param spFlowBase 基础数据维护-流程
     * @return 基础数据维护-流程
     */
    @Override
    public List<SpFlowBase> selectSpFlowBaseList(SpFlowBase spFlowBase)
    {
        return spFlowBaseMapper.selectSpFlowBaseList(spFlowBase);
    }

    /**
     * 新增基础数据维护-流程
     * 
     * @param spFlowBase 基础数据维护-流程
     * @return 结果
     */
    @Override
    public int insertSpFlowBase(SpFlowBase spFlowBase)
    {
        spFlowBase.setCreateTime(DateUtils.getNowDate());
        return spFlowBaseMapper.insertSpFlowBase(spFlowBase);
    }

    /**
     * 修改基础数据维护-流程
     * 
     * @param spFlowBase 基础数据维护-流程
     * @return 结果
     */
    @Override
    public int updateSpFlowBase(SpFlowBase spFlowBase)
    {
        spFlowBase.setUpdateTime(DateUtils.getNowDate());
        return spFlowBaseMapper.updateSpFlowBase(spFlowBase);
    }

    /**
     * 删除基础数据维护-流程对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSpFlowBaseByIds(String ids)
    {
        return spFlowBaseMapper.deleteSpFlowBaseByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除基础数据维护-流程信息
     * 
     * @param spFlowId 基础数据维护-流程ID
     * @return 结果
     */
    @Override
    public int deleteSpFlowBaseById(Long spFlowId)
    {
        return spFlowBaseMapper.deleteSpFlowBaseById(spFlowId);
    }
}
