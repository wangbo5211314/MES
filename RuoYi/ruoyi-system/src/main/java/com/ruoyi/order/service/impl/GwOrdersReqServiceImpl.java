package com.ruoyi.order.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.order.mapper.GwOrdersReqMapper;
import com.ruoyi.order.domain.GwOrdersReq;
import com.ruoyi.order.service.IGwOrdersReqService;
import com.ruoyi.common.core.text.Convert;

/**
 * 国网采购订单-请求Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-08
 */
@Service
public class GwOrdersReqServiceImpl implements IGwOrdersReqService 
{
    @Autowired
    private GwOrdersReqMapper gwOrdersReqMapper;

    /**
     * 查询国网采购订单-请求
     * 
     * @param nnRequestId 国网采购订单-请求ID
     * @return 国网采购订单-请求
     */
    @Override
    public GwOrdersReq selectGwOrdersReqById(Long nnRequestId)
    {
        return gwOrdersReqMapper.selectGwOrdersReqById(nnRequestId);
    }

    /**
     * 查询国网采购订单-请求列表
     * 
     * @param gwOrdersReq 国网采购订单-请求
     * @return 国网采购订单-请求
     */
    @Override
    public List<GwOrdersReq> selectGwOrdersReqList(GwOrdersReq gwOrdersReq)
    {
        return gwOrdersReqMapper.selectGwOrdersReqList(gwOrdersReq);
    }

    /**
     * 新增国网采购订单-请求
     * 
     * @param gwOrdersReq 国网采购订单-请求
     * @return 结果
     */
    @Override
    public int insertGwOrdersReq(GwOrdersReq gwOrdersReq)
    {
        return gwOrdersReqMapper.insertGwOrdersReq(gwOrdersReq);
    }

    /**
     * 修改国网采购订单-请求
     * 
     * @param gwOrdersReq 国网采购订单-请求
     * @return 结果
     */
    @Override
    public int updateGwOrdersReq(GwOrdersReq gwOrdersReq)
    {
        return gwOrdersReqMapper.updateGwOrdersReq(gwOrdersReq);
    }

    /**
     * 删除国网采购订单-请求对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGwOrdersReqByIds(String ids)
    {
        return gwOrdersReqMapper.deleteGwOrdersReqByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除国网采购订单-请求信息
     * 
     * @param nnRequestId 国网采购订单-请求ID
     * @return 结果
     */
    @Override
    public int deleteGwOrdersReqById(Long nnRequestId)
    {
        return gwOrdersReqMapper.deleteGwOrdersReqById(nnRequestId);
    }
}
