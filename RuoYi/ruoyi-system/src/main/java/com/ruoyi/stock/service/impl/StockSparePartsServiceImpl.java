package com.ruoyi.stock.service.impl;

import java.util.List;

import com.ruoyi.stock.domain.StockSpareParts;
import com.ruoyi.stock.mapper.StockSparePartsMapper;
import com.ruoyi.stock.service.IStockSparePartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 备品备件库存Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-10
 */
@Service
public class StockSparePartsServiceImpl implements IStockSparePartsService
{
    @Autowired
    private StockSparePartsMapper stockSparePartsMapper;

    /**
     * 查询备品备件库存
     * 
     * @param spareStockId 备品备件库存ID
     * @return 备品备件库存
     */
    @Override
    public StockSpareParts selectStockSparePartsById(Long spareStockId)
    {
        return stockSparePartsMapper.selectStockSparePartsById(spareStockId);
    }

    /**
     * 查询备品备件库存列表
     * 
     * @param stockSpareParts 备品备件库存
     * @return 备品备件库存
     */
    @Override
    public List<StockSpareParts> selectStockSparePartsList(StockSpareParts stockSpareParts)
    {
        return stockSparePartsMapper.selectStockSparePartsList(stockSpareParts);
    }

    /**
     * 新增备品备件库存
     * 
     * @param stockSpareParts 备品备件库存
     * @return 结果
     */
    @Override
    public int insertStockSpareParts(StockSpareParts stockSpareParts)
    {
        return stockSparePartsMapper.insertStockSpareParts(stockSpareParts);
    }

    /**
     * 修改备品备件库存
     * 
     * @param stockSpareParts 备品备件库存
     * @return 结果
     */
    @Override
    public int updateStockSpareParts(StockSpareParts stockSpareParts)
    {
        return stockSparePartsMapper.updateStockSpareParts(stockSpareParts);
    }

    /**
     * 删除备品备件库存对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStockSparePartsByIds(String ids)
    {
        return stockSparePartsMapper.deleteStockSparePartsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除备品备件库存信息
     * 
     * @param spareStockId 备品备件库存ID
     * @return 结果
     */
    @Override
    public int deleteStockSparePartsById(Long spareStockId)
    {
        return stockSparePartsMapper.deleteStockSparePartsById(spareStockId);
    }
}
