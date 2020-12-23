package com.ruoyi.process.service;

import java.util.List;
import com.ruoyi.process.domain.SpFlow;

/**
 * 基础数据维护-流程Service接口
 * 
 * @author wangbo
 * @date 2020-12-23
 */
public interface ISpFlowService 
{
    /**
     * 查询基础数据维护-流程
     * 
     * @param spFlowId 基础数据维护-流程ID
     * @return 基础数据维护-流程
     */
    public SpFlow selectSpFlowById(Long spFlowId);

    /**
     * 查询基础数据维护-流程列表
     * 
     * @param spFlow 基础数据维护-流程
     * @return 基础数据维护-流程集合
     */
    public List<SpFlow> selectSpFlowList(SpFlow spFlow);

    /**
     * 新增基础数据维护-流程
     * 
     * @param spFlow 基础数据维护-流程
     * @return 结果
     */
    public int insertSpFlow(SpFlow spFlow);

    /**
     * 修改基础数据维护-流程
     * 
     * @param spFlow 基础数据维护-流程
     * @return 结果
     */
    public int updateSpFlow(SpFlow spFlow);

    /**
     * 批量删除基础数据维护-流程
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSpFlowByIds(String ids);

    /**
     * 删除基础数据维护-流程信息
     * 
     * @param spFlowId 基础数据维护-流程ID
     * @return 结果
     */
    public int deleteSpFlowById(Long spFlowId);
}
