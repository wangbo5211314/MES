package com.ruoyi.stock.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.stock.mapper.StockInMapper;
import com.ruoyi.stock.domain.StockIn;
import com.ruoyi.stock.service.IStockInService;
import com.ruoyi.common.core.text.Convert;

/**
 * 入库单Service业务层处理
 * 
 * @author 王博
 * @date 2021-01-26
 */
@Service
public class StockInServiceImpl implements IStockInService 
{
    @Autowired
    private StockInMapper stockInMapper;

    /**
     * 查询入库单
     * 
     * @param rkId 入库单ID
     * @return 入库单
     */
    @Override
    public StockIn selectStockInById(Long rkId)
    {
        return stockInMapper.selectStockInById(rkId);
    }

    /**
     * 查询入库单列表
     * 
     * @param stockIn 入库单
     * @return 入库单
     */
    @Override
    public List<StockIn> selectStockInList(StockIn stockIn)
    {
        return stockInMapper.selectStockInList(stockIn);
    }

    /**
     * 新增入库单
     * 
     * @param stockIn 入库单
     * @return 结果
     */
    @Override
    public int insertStockIn(StockIn stockIn)
    {
        stockIn.setCreateTime(DateUtils.getNowDate());
        return stockInMapper.insertStockIn(stockIn);
    }

    /**
     * 修改入库单
     * 
     * @param stockIn 入库单
     * @return 结果
     */
    @Override
    public int updateStockIn(StockIn stockIn)
    {
        stockIn.setUpdateTime(DateUtils.getNowDate());
        return stockInMapper.updateStockIn(stockIn);
    }

    /**
     * 删除入库单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStockInByIds(String ids)
    {
        return stockInMapper.deleteStockInByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除入库单信息
     * 
     * @param rkId 入库单ID
     * @return 结果
     */
    @Override
    public int deleteStockInById(Long rkId)
    {
        return stockInMapper.deleteStockInById(rkId);
    }
}
