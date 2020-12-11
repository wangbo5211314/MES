package com.ruoyi.stock.service;

import com.ruoyi.stock.domain.StockSorderInfo;

import java.util.List;


/**
 * 供货单信息Service接口
 * 
 * @author wangbo
 * @date 2020-12-10
 */
public interface IStockSorderInfoService 
{
    /**
     * 查询供货单信息
     * 
     * @param supInfoId 供货单信息ID
     * @return 供货单信息
     */
    public StockSorderInfo selectStockSorderInfoById(Long supInfoId);

    /**
     * 查询供货单信息列表
     * 
     * @param stockSorderInfo 供货单信息
     * @return 供货单信息集合
     */
    public List<StockSorderInfo> selectStockSorderInfoList(StockSorderInfo stockSorderInfo);

    /**
     * 新增供货单信息
     * 
     * @param stockSorderInfo 供货单信息
     * @return 结果
     */
    public int insertStockSorderInfo(StockSorderInfo stockSorderInfo);

    /**
     * 修改供货单信息
     * 
     * @param stockSorderInfo 供货单信息
     * @return 结果
     */
    public int updateStockSorderInfo(StockSorderInfo stockSorderInfo);

    /**
     * 批量删除供货单信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStockSorderInfoByIds(String ids);

    /**
     * 删除供货单信息信息
     * 
     * @param supInfoId 供货单信息ID
     * @return 结果
     */
    public int deleteStockSorderInfoById(Long supInfoId);
}
