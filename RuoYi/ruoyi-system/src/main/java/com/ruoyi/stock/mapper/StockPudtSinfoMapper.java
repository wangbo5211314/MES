package com.ruoyi.stock.mapper;

import com.ruoyi.stock.domain.StockPudtSinfo;

import java.util.List;


/**
 * 产成品库存信息Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-10
 */
public interface StockPudtSinfoMapper 
{
    /**
     * 查询产成品库存信息
     * 
     * @param pudtSinfoId 产成品库存信息ID
     * @return 产成品库存信息
     */
    public StockPudtSinfo selectStockPudtSinfoById(Long pudtSinfoId);

    /**
     * 查询产成品库存信息列表
     * 
     * @param stockPudtSinfo 产成品库存信息
     * @return 产成品库存信息集合
     */
    public List<StockPudtSinfo> selectStockPudtSinfoList(StockPudtSinfo stockPudtSinfo);

    /**
     * 新增产成品库存信息
     * 
     * @param stockPudtSinfo 产成品库存信息
     * @return 结果
     */
    public int insertStockPudtSinfo(StockPudtSinfo stockPudtSinfo);

    /**
     * 修改产成品库存信息
     * 
     * @param stockPudtSinfo 产成品库存信息
     * @return 结果
     */
    public int updateStockPudtSinfo(StockPudtSinfo stockPudtSinfo);

    /**
     * 删除产成品库存信息
     * 
     * @param pudtSinfoId 产成品库存信息ID
     * @return 结果
     */
    public int deleteStockPudtSinfoById(Long pudtSinfoId);

    /**
     * 批量删除产成品库存信息
     * 
     * @param pudtSinfoIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStockPudtSinfoByIds(String[] pudtSinfoIds);
}
