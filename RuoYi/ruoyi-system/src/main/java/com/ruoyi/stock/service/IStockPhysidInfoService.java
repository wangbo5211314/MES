package com.ruoyi.stock.service;

import com.ruoyi.stock.domain.StockPhysidInfo;

import java.util.List;


/**
 * 实物ID 信息Service接口
 * 
 * @author wnagbo
 * @date 2020-12-10
 */
public interface IStockPhysidInfoService 
{
    /**
     * 查询实物ID 信息
     * 
     * @param phsyidInfoId 实物ID 信息ID
     * @return 实物ID 信息
     */
    public StockPhysidInfo selectStockPhysidInfoById(Long phsyidInfoId);

    /**
     * 查询实物ID 信息列表
     * 
     * @param stockPhysidInfo 实物ID 信息
     * @return 实物ID 信息集合
     */
    public List<StockPhysidInfo> selectStockPhysidInfoList(StockPhysidInfo stockPhysidInfo);

    /**
     * 新增实物ID 信息
     * 
     * @param stockPhysidInfo 实物ID 信息
     * @return 结果
     */
    public int insertStockPhysidInfo(StockPhysidInfo stockPhysidInfo);

    /**
     * 修改实物ID 信息
     * 
     * @param stockPhysidInfo 实物ID 信息
     * @return 结果
     */
    public int updateStockPhysidInfo(StockPhysidInfo stockPhysidInfo);

    /**
     * 批量删除实物ID 信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStockPhysidInfoByIds(String ids);

    /**
     * 删除实物ID 信息信息
     * 
     * @param phsyidInfoId 实物ID 信息ID
     * @return 结果
     */
    public int deleteStockPhysidInfoById(Long phsyidInfoId);
}
