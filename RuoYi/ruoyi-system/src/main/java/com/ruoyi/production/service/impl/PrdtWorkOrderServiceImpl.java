package com.ruoyi.production.service.impl;

import java.util.List;

import com.ruoyi.production.domain.PrdtWorkOrder;
import com.ruoyi.production.mapper.PrdtWorkOrderMapper;
import com.ruoyi.production.service.IPrdtWorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 工单Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-09
 */
@Service
public class PrdtWorkOrderServiceImpl implements IPrdtWorkOrderService
{
    @Autowired
    private PrdtWorkOrderMapper prdtWorkOrderMapper;

    /**
     * 查询工单
     * 
     * @param workOrderId 工单ID
     * @return 工单
     */
    @Override
    public PrdtWorkOrder selectPrdtWorkOrderById(Long workOrderId)
    {
        return prdtWorkOrderMapper.selectPrdtWorkOrderById(workOrderId);
    }

    /**
     * 查询工单列表
     * 
     * @param prdtWorkOrder 工单
     * @return 工单
     */
    @Override
    public List<PrdtWorkOrder> selectPrdtWorkOrderList(PrdtWorkOrder prdtWorkOrder)
    {
        return prdtWorkOrderMapper.selectPrdtWorkOrderList(prdtWorkOrder);
    }

    /**
     * 新增工单
     * 
     * @param prdtWorkOrder 工单
     * @return 结果
     */
    @Override
    public int insertPrdtWorkOrder(PrdtWorkOrder prdtWorkOrder)
    {
        return prdtWorkOrderMapper.insertPrdtWorkOrder(prdtWorkOrder);
    }

    /**
     * 修改工单
     * 
     * @param prdtWorkOrder 工单
     * @return 结果
     */
    @Override
    public int updatePrdtWorkOrder(PrdtWorkOrder prdtWorkOrder)
    {
        return prdtWorkOrderMapper.updatePrdtWorkOrder(prdtWorkOrder);
    }

    /**
     * 删除工单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePrdtWorkOrderByIds(String ids)
    {
        return prdtWorkOrderMapper.deletePrdtWorkOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工单信息
     * 
     * @param workOrderId 工单ID
     * @return 结果
     */
    @Override
    public int deletePrdtWorkOrderById(Long workOrderId)
    {
        return prdtWorkOrderMapper.deletePrdtWorkOrderById(workOrderId);
    }
}
