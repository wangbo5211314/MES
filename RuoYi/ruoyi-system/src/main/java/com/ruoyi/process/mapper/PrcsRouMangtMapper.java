package com.ruoyi.process.mapper;

import java.util.List;
import com.ruoyi.process.domain.PrcsRouMangt;

/**
 * 工艺路线管理Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-23
 */
public interface PrcsRouMangtMapper 
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
     * 删除工艺路线管理
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 结果
     */
    public int deletePrcsRouMangtById(Long spFlowId);

    /**
     * 批量删除工艺路线管理
     * 
     * @param spFlowIds 需要删除的数据ID
     * @return 结果
     */
    public int deletePrcsRouMangtByIds(String[] spFlowIds);
}
