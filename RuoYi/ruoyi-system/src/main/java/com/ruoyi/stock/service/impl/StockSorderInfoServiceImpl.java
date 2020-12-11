package com.ruoyi.stock.service.impl;

import java.util.List;

import com.ruoyi.stock.domain.StockSorderInfo;
import com.ruoyi.stock.mapper.StockSorderInfoMapper;
import com.ruoyi.stock.service.IStockSorderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 供货单信息Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-10
 */
@Service
public class StockSorderInfoServiceImpl implements IStockSorderInfoService
{
    @Autowired
    private StockSorderInfoMapper stockSorderInfoMapper;

    /**
     * 查询供货单信息
     * 
     * @param supInfoId 供货单信息ID
     * @return 供货单信息
     */
    @Override
    public StockSorderInfo selectStockSorderInfoById(Long supInfoId)
    {
        return stockSorderInfoMapper.selectStockSorderInfoById(supInfoId);
    }

    /**
     * 查询供货单信息列表
     * 
     * @param stockSorderInfo 供货单信息
     * @return 供货单信息
     */
    @Override
    public List<StockSorderInfo> selectStockSorderInfoList(StockSorderInfo stockSorderInfo)
    {
        return stockSorderInfoMapper.selectStockSorderInfoList(stockSorderInfo);
    }

    /**
     * 新增供货单信息
     * 
     * @param stockSorderInfo 供货单信息
     * @return 结果
     */
    @Override
    public int insertStockSorderInfo(StockSorderInfo stockSorderInfo)
    {
        return stockSorderInfoMapper.insertStockSorderInfo(stockSorderInfo);
    }

    /**
     * 修改供货单信息
     * 
     * @param stockSorderInfo 供货单信息
     * @return 结果
     */
    @Override
    public int updateStockSorderInfo(StockSorderInfo stockSorderInfo)
    {
        return stockSorderInfoMapper.updateStockSorderInfo(stockSorderInfo);
    }

    /**
     * 删除供货单信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStockSorderInfoByIds(String ids)
    {
        return stockSorderInfoMapper.deleteStockSorderInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除供货单信息信息
     * 
     * @param supInfoId 供货单信息ID
     * @return 结果
     */
    @Override
    public int deleteStockSorderInfoById(Long supInfoId)
    {
        return stockSorderInfoMapper.deleteStockSorderInfoById(supInfoId);
    }
}
