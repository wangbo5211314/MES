package com.ruoyi.process.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.process.mapper.SpFlowMapper;
import com.ruoyi.process.domain.SpFlow;
import com.ruoyi.process.service.ISpFlowService;
import com.ruoyi.common.core.text.Convert;

/**
 * 基础数据维护-流程Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-23
 */
@Service
public class SpFlowServiceImpl implements ISpFlowService 
{
    @Autowired
    private SpFlowMapper spFlowMapper;

    /**
     * 查询基础数据维护-流程
     * 
     * @param spFlowId 基础数据维护-流程ID
     * @return 基础数据维护-流程
     */
    @Override
    public SpFlow selectSpFlowById(Long spFlowId)
    {
        return spFlowMapper.selectSpFlowById(spFlowId);
    }

    /**
     * 查询基础数据维护-流程列表
     * 
     * @param spFlow 基础数据维护-流程
     * @return 基础数据维护-流程
     */
    @Override
    public List<SpFlow> selectSpFlowList(SpFlow spFlow)
    {
        return spFlowMapper.selectSpFlowList(spFlow);
    }

    /**
     * 新增基础数据维护-流程
     * 
     * @param spFlow 基础数据维护-流程
     * @return 结果
     */
    @Override
    public int insertSpFlow(SpFlow spFlow)
    {
        spFlow.setCreateTime(DateUtils.getNowDate());
        return spFlowMapper.insertSpFlow(spFlow);
    }

    /**
     * 修改基础数据维护-流程
     * 
     * @param spFlow 基础数据维护-流程
     * @return 结果
     */
    @Override
    public int updateSpFlow(SpFlow spFlow)
    {
        spFlow.setUpdateTime(DateUtils.getNowDate());
        return spFlowMapper.updateSpFlow(spFlow);
    }

    /**
     * 删除基础数据维护-流程对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSpFlowByIds(String ids)
    {
        return spFlowMapper.deleteSpFlowByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除基础数据维护-流程信息
     * 
     * @param spFlowId 基础数据维护-流程ID
     * @return 结果
     */
    @Override
    public int deleteSpFlowById(Long spFlowId)
    {
        return spFlowMapper.deleteSpFlowById(spFlowId);
    }
}
