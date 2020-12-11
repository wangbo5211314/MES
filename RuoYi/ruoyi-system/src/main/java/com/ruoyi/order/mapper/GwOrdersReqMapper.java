package com.ruoyi.order.mapper;

import java.util.List;
import com.ruoyi.order.domain.GwOrdersReq;

/**
 * 国网采购订单-请求Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-08
 */
public interface GwOrdersReqMapper 
{
    /**
     * 查询国网采购订单-请求
     * 
     * @param nnRequestId 国网采购订单-请求ID
     * @return 国网采购订单-请求
     */
    public GwOrdersReq selectGwOrdersReqById(Long nnRequestId);

    /**
     * 查询国网采购订单-请求列表
     * 
     * @param gwOrdersReq 国网采购订单-请求
     * @return 国网采购订单-请求集合
     */
    public List<GwOrdersReq> selectGwOrdersReqList(GwOrdersReq gwOrdersReq);

    /**
     * 新增国网采购订单-请求
     * 
     * @param gwOrdersReq 国网采购订单-请求
     * @return 结果
     */
    public int insertGwOrdersReq(GwOrdersReq gwOrdersReq);

    /**
     * 修改国网采购订单-请求
     * 
     * @param gwOrdersReq 国网采购订单-请求
     * @return 结果
     */
    public int updateGwOrdersReq(GwOrdersReq gwOrdersReq);

    /**
     * 删除国网采购订单-请求
     * 
     * @param nnRequestId 国网采购订单-请求ID
     * @return 结果
     */
    public int deleteGwOrdersReqById(Long nnRequestId);

    /**
     * 批量删除国网采购订单-请求
     * 
     * @param nnRequestIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteGwOrdersReqByIds(String[] nnRequestIds);
}
