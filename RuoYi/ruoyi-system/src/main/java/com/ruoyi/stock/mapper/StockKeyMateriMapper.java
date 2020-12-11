package com.ruoyi.stock.mapper;

import com.ruoyi.stock.domain.StockKeyMateri;

import java.util.List;


/**
 * 重点原材料库存Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-10
 */
public interface StockKeyMateriMapper 
{
    /**
     * 查询重点原材料库存
     * 
     * @param keyMateriStockId 重点原材料库存ID
     * @return 重点原材料库存
     */
    public StockKeyMateri selectStockKeyMateriById(Long keyMateriStockId);

    /**
     * 查询重点原材料库存列表
     * 
     * @param stockKeyMateri 重点原材料库存
     * @return 重点原材料库存集合
     */
    public List<StockKeyMateri> selectStockKeyMateriList(StockKeyMateri stockKeyMateri);

    /**
     * 新增重点原材料库存
     * 
     * @param stockKeyMateri 重点原材料库存
     * @return 结果
     */
    public int insertStockKeyMateri(StockKeyMateri stockKeyMateri);

    /**
     * 修改重点原材料库存
     * 
     * @param stockKeyMateri 重点原材料库存
     * @return 结果
     */
    public int updateStockKeyMateri(StockKeyMateri stockKeyMateri);

    /**
     * 删除重点原材料库存
     * 
     * @param keyMateriStockId 重点原材料库存ID
     * @return 结果
     */
    public int deleteStockKeyMateriById(Long keyMateriStockId);

    /**
     * 批量删除重点原材料库存
     * 
     * @param keyMateriStockIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStockKeyMateriByIds(String[] keyMateriStockIds);
}
