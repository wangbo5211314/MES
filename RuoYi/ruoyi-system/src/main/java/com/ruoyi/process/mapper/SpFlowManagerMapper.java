package com.ruoyi.process.mapper;

import java.util.List;
import com.ruoyi.process.domain.SpFlowManager;

/**
 * 工艺路线管理Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-23
 */
public interface SpFlowManagerMapper 
{
    /**
     * 查询工艺路线管理
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 工艺路线管理
     */
    public SpFlowManager selectSpFlowManagerById(Long spFlowId);

    /**
     * 查询工艺路线管理列表
     * 
     * @param spFlowManager 工艺路线管理
     * @return 工艺路线管理集合
     */
    public List<SpFlowManager> selectSpFlowManagerList(SpFlowManager spFlowManager);

    /**
     * 新增工艺路线管理
     * 
     * @param spFlowManager 工艺路线管理
     * @return 结果
     */
    public int insertSpFlowManager(SpFlowManager spFlowManager);

    /**
     * 修改工艺路线管理
     * 
     * @param spFlowManager 工艺路线管理
     * @return 结果
     */
    public int updateSpFlowManager(SpFlowManager spFlowManager);

    /**
     * 删除工艺路线管理
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 结果
     */
    public int deleteSpFlowManagerById(Long spFlowId);

    /**
     * 批量删除工艺路线管理
     * 
     * @param spFlowIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSpFlowManagerByIds(String[] spFlowIds);
}
