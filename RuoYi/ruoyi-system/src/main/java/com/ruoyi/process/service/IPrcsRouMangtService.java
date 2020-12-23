package com.ruoyi.process.service;

import java.util.List;
import com.ruoyi.process.domain.PrcsRouMangt;

/**
 * 工艺路线管理Service接口
 * 
 * @author wangbo
 * @date 2020-12-23
 */
public interface IPrcsRouMangtService 
{
    /**
     * 查询工艺路线管理
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 工艺路线管理
     */
    public PrcsRouMangt selectPrcsRouMangtById(Long spFlowId);

    /**
     * 查询工艺路线管理列表
     * 
     * @param prcsRouMangt 工艺路线管理
     * @return 工艺路线管理集合
     */
    public List<PrcsRouMangt> selectPrcsRouMangtList(PrcsRouMangt prcsRouMangt);

    /**
     * 新增工艺路线管理
     * 
     * @param prcsRouMangt 工艺路线管理
     * @return 结果
     */
    public int insertPrcsRouMangt(PrcsRouMangt prcsRouMangt);

    /**
     * 修改工艺路线管理
     * 
     * @param prcsRouMangt 工艺路线管理
     * @return 结果
     */
    public int updatePrcsRouMangt(PrcsRouMangt prcsRouMangt);

    /**
     * 批量删除工艺路线管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePrcsRouMangtByIds(String ids);

    /**
     * 删除工艺路线管理信息
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 结果
     */
    public int deletePrcsRouMangtById(Long spFlowId);
}
