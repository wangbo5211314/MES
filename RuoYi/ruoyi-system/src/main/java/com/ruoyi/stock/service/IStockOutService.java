package com.ruoyi.stock.service;

import java.util.List;
import com.ruoyi.stock.domain.StockOut;

/**
 * 出库单Service接口
 * 
 * @author 王博
 * @date 2021-01-28
 */
public interface IStockOutService 
{
    /**
     * 查询出库单
     * 
     * @param ckId 出库单ID
     * @return 出库单
     */
    public StockOut selectStockOutById(Long ckId);

    /**
     * 查询出库单列表
     * 
     * @param stockOut 出库单
     * @return 出库单集合
     */
    public List<StockOut> selectStockOutList(StockOut stockOut);

    /**
     * 新增出库单
     * 
     * @param stockOut 出库单
     * @return 结果
     */
    public int insertStockOut(StockOut stockOut);

    /**
     * 修改出库单
     * 
     * @param stockOut 出库单
     * @return 结果
     */
    public int updateStockOut(StockOut stockOut);

    /**
     * 批量删除出库单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStockOutByIds(String ids);

    /**
     * 删除出库单信息
     * 
     * @param ckId 出库单ID
     * @return 结果
     */
    public int deleteStockOutById(Long ckId);
}
