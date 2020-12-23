package com.ruoyi.process.service;

import java.util.List;
import com.ruoyi.process.domain.SpFlowManager;

/**
 * 工艺路线管理Service接口
 * 
 * @author wangbo
 * @date 2020-12-23
 */
public interface ISpFlowManagerService 
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
     * 批量删除工艺路线管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSpFlowManagerByIds(String ids);

    /**
     * 删除工艺路线管理信息
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 结果
     */
    public int deleteSpFlowManagerById(Long spFlowId);
}
