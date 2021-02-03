package com.ruoyi.stock.mapper;

import java.util.List;
import com.ruoyi.stock.domain.StockOut;

/**
 * 出库单Mapper接口
 * 
 * @author 王博
 * @date 2021-01-28
 */
public interface StockOutMapper 
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
     * 删除出库单
     * 
     * @param ckId 出库单ID
     * @return 结果
     */
    public int deleteStockOutById(Long ckId);

    /**
     * 批量删除出库单
     * 
     * @param ckIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStockOutByIds(String[] ckIds);
}
