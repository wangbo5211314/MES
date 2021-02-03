package com.ruoyi.stock.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.stock.mapper.StockOutMapper;
import com.ruoyi.stock.domain.StockOut;
import com.ruoyi.stock.service.IStockOutService;
import com.ruoyi.common.core.text.Convert;

/**
 * 出库单Service业务层处理
 * 
 * @author 王博
 * @date 2021-01-28
 */
@Service
public class StockOutServiceImpl implements IStockOutService 
{
    @Autowired
    private StockOutMapper stockOutMapper;

    /**
     * 查询出库单
     * 
     * @param ckId 出库单ID
     * @return 出库单
     */
    @Override
    public StockOut selectStockOutById(Long ckId)
    {
        return stockOutMapper.selectStockOutById(ckId);
    }

    /**
     * 查询出库单列表
     * 
     * @param stockOut 出库单
     * @return 出库单
     */
    @Override
    public List<StockOut> selectStockOutList(StockOut stockOut)
    {
        return stockOutMapper.selectStockOutList(stockOut);
    }

    /**
     * 新增出库单
     * 
     * @param stockOut 出库单
     * @return 结果
     */
    @Override
    public int insertStockOut(StockOut stockOut)
    {
        stockOut.setCreateTime(DateUtils.getNowDate());
        return stockOutMapper.insertStockOut(stockOut);
    }

    /**
     * 修改出库单
     * 
     * @param stockOut 出库单
     * @return 结果
     */
    @Override
    public int updateStockOut(StockOut stockOut)
    {
        stockOut.setUpdateTime(DateUtils.getNowDate());
        return stockOutMapper.updateStockOut(stockOut);
    }

    /**
     * 删除出库单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStockOutByIds(String ids)
    {
        return stockOutMapper.deleteStockOutByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除出库单信息
     * 
     * @param ckId 出库单ID
     * @return 结果
     */
    @Override
    public int deleteStockOutById(Long ckId)
    {
        return stockOutMapper.deleteStockOutById(ckId);
    }
}
