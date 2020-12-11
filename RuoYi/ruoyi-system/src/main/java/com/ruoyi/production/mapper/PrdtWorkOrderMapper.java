package com.ruoyi.production.mapper;

import com.ruoyi.production.domain.PrdtWorkOrder;

import java.util.List;


/**
 * 工单Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-09
 */
public interface PrdtWorkOrderMapper 
{
    /**
     * 查询工单
     * 
     * @param workOrderId 工单ID
     * @return 工单
     */
    public PrdtWorkOrder selectPrdtWorkOrderById(Long workOrderId);

    /**
     * 查询工单列表
     * 
     * @param prdtWorkOrder 工单
     * @return 工单集合
     */
    public List<PrdtWorkOrder> selectPrdtWorkOrderList(PrdtWorkOrder prdtWorkOrder);

    /**
     * 新增工单
     * 
     * @param prdtWorkOrder 工单
     * @return 结果
     */
    public int insertPrdtWorkOrder(PrdtWorkOrder prdtWorkOrder);

    /**
     * 修改工单
     * 
     * @param prdtWorkOrder 工单
     * @return 结果
     */
    public int updatePrdtWorkOrder(PrdtWorkOrder prdtWorkOrder);

    /**
     * 删除工单
     * 
     * @param workOrderId 工单ID
     * @return 结果
     */
    public int deletePrdtWorkOrderById(Long workOrderId);

    /**
     * 批量删除工单
     * 
     * @param workOrderIds 需要删除的数据ID
     * @return 结果
     */
    public int deletePrdtWorkOrderByIds(String[] workOrderIds);
}
