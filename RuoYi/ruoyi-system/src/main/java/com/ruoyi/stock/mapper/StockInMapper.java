package com.ruoyi.stock.mapper;

import java.util.List;

import com.ruoyi.stock.domain.StockIn;

/**
 * 入库单Mapper接口
 * 
 * @author 王博
 * @date 2021-01-26
 */
public interface StockInMapper 
{
    /**
     * 查询入库单
     * 
     * @param rkId 入库单ID
     * @return 入库单
     */
    public StockIn selectStockInById(Long rkId);

    /**
     * 查询入库单列表
     * 
     * @param stockIn 入库单
     * @return 入库单集合
     */
    public List<StockIn> selectStockInList(StockIn stockIn);

    /**
     * 新增入库单
     * 
     * @param stockIn 入库单
     * @return 结果
     */
    public int insertStockIn(StockIn stockIn);

    /**
     * 修改入库单
     * 
     * @param stockIn 入库单
     * @return 结果
     */
    public int updateStockIn(StockIn stockIn);

    /**
     * 删除入库单
     * 
     * @param rkId 入库单ID
     * @return 结果
     */
    public int deleteStockInById(Long rkId);

    /**
     * 批量删除入库单
     * 
     * @param rkIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStockInByIds(String[] rkIds);
}
