package com.ruoyi.stock.service.impl;

import java.util.List;

import com.ruoyi.stock.domain.StockKeyMateri;
import com.ruoyi.stock.mapper.StockKeyMateriMapper;
import com.ruoyi.stock.service.IStockKeyMateriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 重点原材料库存Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-10
 */
@Service
public class StockKeyMateriServiceImpl implements IStockKeyMateriService
{
    @Autowired
    private StockKeyMateriMapper stockKeyMateriMapper;

    /**
     * 查询重点原材料库存
     * 
     * @param keyMateriStockId 重点原材料库存ID
     * @return 重点原材料库存
     */
    @Override
    public StockKeyMateri selectStockKeyMateriById(Long keyMateriStockId)
    {
        return stockKeyMateriMapper.selectStockKeyMateriById(keyMateriStockId);
    }

    /**
     * 查询重点原材料库存列表
     * 
     * @param stockKeyMateri 重点原材料库存
     * @return 重点原材料库存
     */
    @Override
    public List<StockKeyMateri> selectStockKeyMateriList(StockKeyMateri stockKeyMateri)
    {
        return stockKeyMateriMapper.selectStockKeyMateriList(stockKeyMateri);
    }

    /**
     * 新增重点原材料库存
     * 
     * @param stockKeyMateri 重点原材料库存
     * @return 结果
     */
    @Override
    public int insertStockKeyMateri(StockKeyMateri stockKeyMateri)
    {
        return stockKeyMateriMapper.insertStockKeyMateri(stockKeyMateri);
    }

    /**
     * 修改重点原材料库存
     * 
     * @param stockKeyMateri 重点原材料库存
     * @return 结果
     */
    @Override
    public int updateStockKeyMateri(StockKeyMateri stockKeyMateri)
    {
        return stockKeyMateriMapper.updateStockKeyMateri(stockKeyMateri);
    }

    /**
     * 删除重点原材料库存对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStockKeyMateriByIds(String ids)
    {
        return stockKeyMateriMapper.deleteStockKeyMateriByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除重点原材料库存信息
     * 
     * @param keyMateriStockId 重点原材料库存ID
     * @return 结果
     */
    @Override
    public int deleteStockKeyMateriById(Long keyMateriStockId)
    {
        return stockKeyMateriMapper.deleteStockKeyMateriById(keyMateriStockId);
    }
}
