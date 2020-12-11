package com.ruoyi.order.service.impl;

import java.util.List;

import com.ruoyi.order.domain.ProductionOrder;
import com.ruoyi.order.mapper.ProductionOrderMapper;
import com.ruoyi.order.service.IProductionOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ruoyi.common.core.text.Convert;

/**
 * 生产订单Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-09
 */
@Service
public class ProductionOrderServiceImpl implements IProductionOrderService
{
    @Autowired
    private ProductionOrderMapper productionOrderMapper;

    /**
     * 查询生产订单
     * 
     * @param productionOrderId 生产订单ID
     * @return 生产订单
     */
    @Override
    public ProductionOrder selectProductionOrderById(Long productionOrderId)
    {
        return productionOrderMapper.selectProductionOrderById(productionOrderId);
    }

    /**
     * 查询生产订单列表
     * 
     * @param productionOrder 生产订单
     * @return 生产订单
     */
    @Override
    public List<ProductionOrder> selectProductionOrderList(ProductionOrder productionOrder)
    {
        return productionOrderMapper.selectProductionOrderList(productionOrder);
    }

    /**
     * 新增生产订单
     * 
     * @param productionOrder 生产订单
     * @return 结果
     */
    @Override
    public int insertProductionOrder(ProductionOrder productionOrder)
    {
        return productionOrderMapper.insertProductionOrder(productionOrder);
    }

    /**
     * 修改生产订单
     * 
     * @param productionOrder 生产订单
     * @return 结果
     */
    @Override
    public int updateProductionOrder(ProductionOrder productionOrder)
    {
        return productionOrderMapper.updateProductionOrder(productionOrder);
    }

    /**
     * 删除生产订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteProductionOrderByIds(String ids)
    {
        return productionOrderMapper.deleteProductionOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除生产订单信息
     * 
     * @param productionOrderId 生产订单ID
     * @return 结果
     */
    @Override
    public int deleteProductionOrderById(Long productionOrderId)
    {
        return productionOrderMapper.deleteProductionOrderById(productionOrderId);
    }
}
