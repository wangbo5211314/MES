package com.ruoyi.stock.service.impl;

import java.util.List;

import com.ruoyi.stock.domain.StockPhysidInfo;
import com.ruoyi.stock.mapper.StockPhysidInfoMapper;
import com.ruoyi.stock.service.IStockPhysidInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 实物ID 信息Service业务层处理
 * 
 * @author wnagbo
 * @date 2020-12-10
 */
@Service
public class StockPhysidInfoServiceImpl implements IStockPhysidInfoService
{
    @Autowired
    private StockPhysidInfoMapper stockPhysidInfoMapper;

    /**
     * 查询实物ID 信息
     * 
     * @param phsyidInfoId 实物ID 信息ID
     * @return 实物ID 信息
     */
    @Override
    public StockPhysidInfo selectStockPhysidInfoById(Long phsyidInfoId)
    {
        return stockPhysidInfoMapper.selectStockPhysidInfoById(phsyidInfoId);
    }

    /**
     * 查询实物ID 信息列表
     * 
     * @param stockPhysidInfo 实物ID 信息
     * @return 实物ID 信息
     */
    @Override
    public List<StockPhysidInfo> selectStockPhysidInfoList(StockPhysidInfo stockPhysidInfo)
    {
        return stockPhysidInfoMapper.selectStockPhysidInfoList(stockPhysidInfo);
    }

    /**
     * 新增实物ID 信息
     * 
     * @param stockPhysidInfo 实物ID 信息
     * @return 结果
     */
    @Override
    public int insertStockPhysidInfo(StockPhysidInfo stockPhysidInfo)
    {
        return stockPhysidInfoMapper.insertStockPhysidInfo(stockPhysidInfo);
    }

    /**
     * 修改实物ID 信息
     * 
     * @param stockPhysidInfo 实物ID 信息
     * @return 结果
     */
    @Override
    public int updateStockPhysidInfo(StockPhysidInfo stockPhysidInfo)
    {
        return stockPhysidInfoMapper.updateStockPhysidInfo(stockPhysidInfo);
    }

    /**
     * 删除实物ID 信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStockPhysidInfoByIds(String ids)
    {
        return stockPhysidInfoMapper.deleteStockPhysidInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除实物ID 信息信息
     * 
     * @param phsyidInfoId 实物ID 信息ID
     * @return 结果
     */
    @Override
    public int deleteStockPhysidInfoById(Long phsyidInfoId)
    {
        return stockPhysidInfoMapper.deleteStockPhysidInfoById(phsyidInfoId);
    }
}
