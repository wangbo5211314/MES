package com.ruoyi.order.service;

import com.ruoyi.order.domain.SalesOrder;

import java.util.List;


/**
 * 销售订单Service接口
 * 
 * @author wangbo
 * @date 2020-12-08
 */
public interface ISalesOrderService 
{
    /**
     * 查询销售订单
     * 
     * @param salesOrderId 销售订单ID
     * @return 销售订单
     */
    public SalesOrder selectSalesOrderById(Long salesOrderId);

    /**
     * 查询销售订单列表
     * 
     * @param salesOrder 销售订单
     * @return 销售订单集合
     */
    public List<SalesOrder> selectSalesOrderList(SalesOrder salesOrder);

    /**
     * 新增销售订单
     * 
     * @param salesOrder 销售订单
     * @return 结果
     */
    public int insertSalesOrder(SalesOrder salesOrder);

    /**
     * 修改销售订单
     * 
     * @param salesOrder 销售订单
     * @return 结果
     */
    public int updateSalesOrder(SalesOrder salesOrder);

    /**
     * 批量删除销售订单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSalesOrderByIds(String ids);

    /**
     * 删除销售订单信息
     * 
     * @param salesOrderId 销售订单ID
     * @return 结果
     */
    public int deleteSalesOrderById(Long salesOrderId);
}
