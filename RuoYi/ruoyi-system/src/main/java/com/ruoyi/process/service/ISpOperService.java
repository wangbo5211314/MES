package com.ruoyi.process.service;

import java.util.List;
import com.ruoyi.process.domain.SpOper;

/**
 * 基础数据维护-工序Service接口
 * 
 * @author wangbo
 * @date 2020-12-23
 */
public interface ISpOperService 
{
    /**
     * 查询基础数据维护-工序
     * 
     * @param spOperId 基础数据维护-工序ID
     * @return 基础数据维护-工序
     */
    public SpOper selectSpOperById(Long spOperId);

    /**
     * 查询基础数据维护-工序列表
     * 
     * @param spOper 基础数据维护-工序
     * @return 基础数据维护-工序集合
     */
    public List<SpOper> selectSpOperList(SpOper spOper);

    /**
     * 新增基础数据维护-工序
     * 
     * @param spOper 基础数据维护-工序
     * @return 结果
     */
    public int insertSpOper(SpOper spOper);

    /**
     * 修改基础数据维护-工序
     * 
     * @param spOper 基础数据维护-工序
     * @return 结果
     */
    public int updateSpOper(SpOper spOper);

    /**
     * 批量删除基础数据维护-工序
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSpOperByIds(String ids);

    /**
     * 删除基础数据维护-工序信息
     * 
     * @param spOperId 基础数据维护-工序ID
     * @return 结果
     */
    public int deleteSpOperById(Long spOperId);
}
