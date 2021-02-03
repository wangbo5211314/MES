package com.ruoyi.purcmanage.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.purcmanage.mapper.PurcOrderMapper;
import com.ruoyi.purcmanage.domain.PurcOrder;
import com.ruoyi.purcmanage.service.IPurcOrderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 采购订单Service业务层处理
 * 
 * @author 王博
 * @date 2021-01-25
 */
@Service("cgddList")
public class PurcOrderServiceImpl implements IPurcOrderService 
{
    @Autowired
    private PurcOrderMapper purcOrderMapper;

    /**
     * 查询采购订单
     * 
     * @param id 采购订单ID
     * @return 采购订单
     */
    @Override
    public PurcOrder selectPurcOrderById(Long id)
    {
        return purcOrderMapper.selectPurcOrderById(id);
    }

    /**
     * 查询采购订单列表
     * 
     * @param purcOrder 采购订单
     * @return 采购订单
     */
    @Override
    public List<PurcOrder> selectPurcOrderList(PurcOrder purcOrder)
    {
        return purcOrderMapper.selectPurcOrderList(purcOrder);
    }

    /**
     * 新增采购订单
     * 
     * @param purcOrder 采购订单
     * @return 结果
     */
    @Override
    public int insertPurcOrder(PurcOrder purcOrder)
    {
        purcOrder.setCreateTime(DateUtils.getNowDate());
        return purcOrderMapper.insertPurcOrder(purcOrder);
    }

    /**
     * 修改采购订单
     * 
     * @param purcOrder 采购订单
     * @return 结果
     */
    @Override
    public int updatePurcOrder(PurcOrder purcOrder)
    {
        purcOrder.setUpdateTime(DateUtils.getNowDate());
        return purcOrderMapper.updatePurcOrder(purcOrder);
    }

    /**
     * 删除采购订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePurcOrderByIds(String ids)
    {
        return purcOrderMapper.deletePurcOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除采购订单信息
     * 
     * @param id 采购订单ID
     * @return 结果
     */
    @Override
    public int deletePurcOrderById(Long id)
    {
        return purcOrderMapper.deletePurcOrderById(id);
    }
}
