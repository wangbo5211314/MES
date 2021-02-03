package com.ruoyi.order.service;

import com.ruoyi.order.domain.GwOrdersReturn;

import java.util.List;


/**
 * 国网采购订单-返回Service接口
 * 
 * @author wangbo
 * @date 2020-12-08
 */
public interface IGwOrdersReturnService 
{
    /**
     * 查询国网采购订单-返回
     * 
     * @param nnReturnId 国网采购订单-返回ID
     * @return 国网采购订单-返回
     */
    public GwOrdersReturn selectGwOrdersReturnById(Long nnReturnId);

    /**
     * 查询国网采购订单-返回列表
     * 
     * @param gwOrdersReturn 国网采购订单-返回
     * @return 国网采购订单-返回集合
     */
    public List<GwOrdersReturn> selectGwOrdersReturnList(GwOrdersReturn gwOrdersReturn);

    /**
     * 新增国网采购订单-返回
     * 
     * @param gwOrdersReturn 国网采购订单-返回
     * @return 结果
     */
    public int insertGwOrdersReturn(GwOrdersReturn gwOrdersReturn);

    /**
     * 修改国网采购订单-返回
     * 
     * @param gwOrdersReturn 国网采购订单-返回
     * @return 结果
     */
    public int updateGwOrdersReturn(GwOrdersReturn gwOrdersReturn);

    /**
     * 批量删除国网采购订单-返回
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGwOrdersReturnByIds(String ids);

    /**
     * 删除国网采购订单-返回信息
     * 
     * @param nnReturnId 国网采购订单-返回ID
     * @return 结果
     */
    public int deleteGwOrdersReturnById(Long nnReturnId);

    public String importGwordersreturn(List<GwOrdersReturn> gwOrdersReturnsList, Boolean isUpdateSupport);

}
