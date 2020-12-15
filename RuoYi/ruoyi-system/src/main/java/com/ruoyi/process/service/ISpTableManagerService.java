package com.ruoyi.process.service;

import java.util.List;
import com.ruoyi.process.domain.SpTableManager;

/**
 * 基础数据配置平台Service接口
 * 
 * @author ruoyi
 * @date 2020-12-14
 */
public interface ISpTableManagerService 
{
    /**
     * 查询基础数据配置平台
     * 
     * @param id 基础数据配置平台ID
     * @return 基础数据配置平台
     */
    public SpTableManager selectSpTableManagerById(String id);

    /**
     * 查询基础数据配置平台列表
     * 
     * @param spTableManager 基础数据配置平台
     * @return 基础数据配置平台集合
     */
    public List<SpTableManager> selectSpTableManagerList(SpTableManager spTableManager);

    /**
     * 新增基础数据配置平台
     * 
     * @param spTableManager 基础数据配置平台
     * @return 结果
     */
    public int insertSpTableManager(SpTableManager spTableManager);

    /**
     * 修改基础数据配置平台
     * 
     * @param spTableManager 基础数据配置平台
     * @return 结果
     */
    public int updateSpTableManager(SpTableManager spTableManager);

    /**
     * 批量删除基础数据配置平台
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSpTableManagerByIds(String ids);

    /**
     * 删除基础数据配置平台信息
     * 
     * @param id 基础数据配置平台ID
     * @return 结果
     */
    public int deleteSpTableManagerById(String id);
}
