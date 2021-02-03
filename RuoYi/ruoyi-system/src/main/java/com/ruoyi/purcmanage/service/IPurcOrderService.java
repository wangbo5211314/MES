package com.ruoyi.purcmanage.service;

import java.util.List;
import com.ruoyi.purcmanage.domain.PurcOrder;

/**
 * 采购订单Service接口
 * 
 * @author 王博
 * @date 2021-01-25
 */
public interface IPurcOrderService 
{
    /**
     * 查询采购订单
     * 
     * @param id 采购订单ID
     * @return 采购订单
     */
    public PurcOrder selectPurcOrderById(Long id);

    /**
     * 查询采购订单列表
     * 
     * @param purcOrder 采购订单
     * @return 采购订单集合
     */
    public List<PurcOrder> selectPurcOrderList(PurcOrder purcOrder);

    /**
     * 新增采购订单
     * 
     * @param purcOrder 采购订单
     * @return 结果
     */
    public int insertPurcOrder(PurcOrder purcOrder);

    /**
     * 修改采购订单
     * 
     * @param purcOrder 采购订单
     * @return 结果
     */
    public int updatePurcOrder(PurcOrder purcOrder);

    /**
     * 批量删除采购订单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePurcOrderByIds(String ids);

    /**
     * 删除采购订单信息
     * 
     * @param id 采购订单ID
     * @return 结果
     */
    public int deletePurcOrderById(Long id);
}
