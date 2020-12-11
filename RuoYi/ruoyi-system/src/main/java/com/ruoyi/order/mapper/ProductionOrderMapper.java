package com.ruoyi.order.mapper;

import com.ruoyi.order.domain.ProductionOrder;

import java.util.List;


/**
 * 生产订单Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-09
 */
public interface ProductionOrderMapper 
{
    /**
     * 查询生产订单
     * 
     * @param productionOrderId 生产订单ID
     * @return 生产订单
     */
    public ProductionOrder selectProductionOrderById(Long productionOrderId);

    /**
     * 查询生产订单列表
     * 
     * @param productionOrder 生产订单
     * @return 生产订单集合
     */
    public List<ProductionOrder> selectProductionOrderList(ProductionOrder productionOrder);

    /**
     * 新增生产订单
     * 
     * @param productionOrder 生产订单
     * @return 结果
     */
    public int insertProductionOrder(ProductionOrder productionOrder);

    /**
     * 修改生产订单
     * 
     * @param productionOrder 生产订单
     * @return 结果
     */
    public int updateProductionOrder(ProductionOrder productionOrder);

    /**
     * 删除生产订单
     * 
     * @param productionOrderId 生产订单ID
     * @return 结果
     */
    public int deleteProductionOrderById(Long productionOrderId);

    /**
     * 批量删除生产订单
     * 
     * @param productionOrderIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteProductionOrderByIds(String[] productionOrderIds);
}
