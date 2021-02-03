package com.ruoyi.process.service;

import java.util.List;
import com.ruoyi.process.domain.SpFlowBase;

/**
 * 基础数据维护-流程Service接口
 * 
 * @author 王博
 * @date 2021-01-29
 */
public interface ISpFlowBaseService 
{
    /**
     * 查询基础数据维护-流程
     * 
     * @param spFlowId 基础数据维护-流程ID
     * @return 基础数据维护-流程
     */
    public SpFlowBase selectSpFlowBaseById(Long spFlowId);

    /**
     * 查询基础数据维护-流程列表
     * 
     * @param spFlowBase 基础数据维护-流程
     * @return 基础数据维护-流程集合
     */
    public List<SpFlowBase> selectSpFlowBaseList(SpFlowBase spFlowBase);

    /**
     * 新增基础数据维护-流程
     * 
     * @param spFlowBase 基础数据维护-流程
     * @return 结果
     */
    public int insertSpFlowBase(SpFlowBase spFlowBase);

    /**
     * 修改基础数据维护-流程
     * 
     * @param spFlowBase 基础数据维护-流程
     * @return 结果
     */
    public int updateSpFlowBase(SpFlowBase spFlowBase);

    /**
     * 批量删除基础数据维护-流程
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSpFlowBaseByIds(String ids);

    /**
     * 删除基础数据维护-流程信息
     * 
     * @param spFlowId 基础数据维护-流程ID
     * @return 结果
     */
    public int deleteSpFlowBaseById(Long spFlowId);
}
