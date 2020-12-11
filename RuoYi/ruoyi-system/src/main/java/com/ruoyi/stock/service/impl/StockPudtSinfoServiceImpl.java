package com.ruoyi.stock.service.impl;

import java.util.List;

import com.ruoyi.stock.domain.StockPudtSinfo;
import com.ruoyi.stock.mapper.StockPudtSinfoMapper;
import com.ruoyi.stock.service.IStockPudtSinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 产成品库存信息Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-10
 */
@Service
public class StockPudtSinfoServiceImpl implements IStockPudtSinfoService
{
    @Autowired
    private StockPudtSinfoMapper stockPudtSinfoMapper;

    /**
     * 查询产成品库存信息
     * 
     * @param pudtSinfoId 产成品库存信息ID
     * @return 产成品库存信息
     */
    @Override
    public StockPudtSinfo selectStockPudtSinfoById(Long pudtSinfoId)
    {
        return stockPudtSinfoMapper.selectStockPudtSinfoById(pudtSinfoId);
    }

    /**
     * 查询产成品库存信息列表
     * 
     * @param stockPudtSinfo 产成品库存信息
     * @return 产成品库存信息
     */
    @Override
    public List<StockPudtSinfo> selectStockPudtSinfoList(StockPudtSinfo stockPudtSinfo)
    {
        return stockPudtSinfoMapper.selectStockPudtSinfoList(stockPudtSinfo);
    }

    /**
     * 新增产成品库存信息
     * 
     * @param stockPudtSinfo 产成品库存信息
     * @return 结果
     */
    @Override
    public int insertStockPudtSinfo(StockPudtSinfo stockPudtSinfo)
    {
        return stockPudtSinfoMapper.insertStockPudtSinfo(stockPudtSinfo);
    }

    /**
     * 修改产成品库存信息
     * 
     * @param stockPudtSinfo 产成品库存信息
     * @return 结果
     */
    @Override
    public int updateStockPudtSinfo(StockPudtSinfo stockPudtSinfo)
    {
        return stockPudtSinfoMapper.updateStockPudtSinfo(stockPudtSinfo);
    }

    /**
     * 删除产成品库存信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStockPudtSinfoByIds(String ids)
    {
        return stockPudtSinfoMapper.deleteStockPudtSinfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除产成品库存信息信息
     * 
     * @param pudtSinfoId 产成品库存信息ID
     * @return 结果
     */
    @Override
    public int deleteStockPudtSinfoById(Long pudtSinfoId)
    {
        return stockPudtSinfoMapper.deleteStockPudtSinfoById(pudtSinfoId);
    }
}
