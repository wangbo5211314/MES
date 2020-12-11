package com.ruoyi.stock.mapper;

import com.ruoyi.stock.domain.StockSpareParts;

import java.util.List;


/**
 * 备品备件库存Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-10
 */
public interface StockSparePartsMapper 
{
    /**
     * 查询备品备件库存
     * 
     * @param spareStockId 备品备件库存ID
     * @return 备品备件库存
     */
    public StockSpareParts selectStockSparePartsById(Long spareStockId);

    /**
     * 查询备品备件库存列表
     * 
     * @param stockSpareParts 备品备件库存
     * @return 备品备件库存集合
     */
    public List<StockSpareParts> selectStockSparePartsList(StockSpareParts stockSpareParts);

    /**
     * 新增备品备件库存
     * 
     * @param stockSpareParts 备品备件库存
     * @return 结果
     */
    public int insertStockSpareParts(StockSpareParts stockSpareParts);

    /**
     * 修改备品备件库存
     * 
     * @param stockSpareParts 备品备件库存
     * @return 结果
     */
    public int updateStockSpareParts(StockSpareParts stockSpareParts);

    /**
     * 删除备品备件库存
     * 
     * @param spareStockId 备品备件库存ID
     * @return 结果
     */
    public int deleteStockSparePartsById(Long spareStockId);

    /**
     * 批量删除备品备件库存
     * 
     * @param spareStockIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStockSparePartsByIds(String[] spareStockIds);
}
