package com.ruoyi.order.service.impl;

import java.util.List;

import com.ruoyi.order.domain.SalesOrder;
import com.ruoyi.order.mapper.SalesOrderMapper;
import com.ruoyi.order.service.ISalesOrderService;
import com.ruoyi.tecsche.domain.TecScheBom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 销售订单Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-08
 */
@Service("salesorder")
public class SalesOrderServiceImpl implements ISalesOrderService
{
    @Autowired
    private SalesOrderMapper salesOrderMapper;

    /**
     * 查询销售订单
     * 
     * @param salesOrderId 销售订单ID
     * @return 销售订单
     */
    @Override
    public SalesOrder selectSalesOrderById(Long salesOrderId)
    {
        return salesOrderMapper.selectSalesOrderById(salesOrderId);
    }

    /**
     * 查询销售订单列表
     * 
     * @param salesOrder 销售订单
     * @return 销售订单
     */
    @Override
    public List<SalesOrder> selectSalesOrderList(SalesOrder salesOrder)
    {

        return salesOrderMapper.selectSalesOrderList(salesOrder);
    }

    /**
     * 新增销售订单
     * 
     * @param salesOrder 销售订单
     * @return 结果
     */
    @Override
    public int insertSalesOrder(SalesOrder salesOrder)
    {
        return salesOrderMapper.insertSalesOrder(salesOrder);
    }

    /**
     * 修改销售订单
     * 
     * @param salesOrder 销售订单
     * @return 结果
     */
    @Override
    public int updateSalesOrder(SalesOrder salesOrder)
    {
        return salesOrderMapper.updateSalesOrder(salesOrder);
    }

    /**
     * 删除销售订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSalesOrderByIds(String ids)
    {
        return salesOrderMapper.deleteSalesOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除销售订单信息
     * 
     * @param salesOrderId 销售订单ID
     * @return 结果
     */
    @Override
    public int deleteSalesOrderById(Long salesOrderId)
    {
        return salesOrderMapper.deleteSalesOrderById(salesOrderId);
    }





}
