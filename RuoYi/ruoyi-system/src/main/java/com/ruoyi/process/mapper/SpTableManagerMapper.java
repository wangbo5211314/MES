package com.ruoyi.process.mapper;

import java.util.List;
import com.ruoyi.process.domain.SpTableManager;

/**
 * 基础数据配置平台Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-22
 */
public interface SpTableManagerMapper 
{
    /**
     * 查询基础数据配置平台
     * 
     * @param id 基础数据配置平台ID
     * @return 基础数据配置平台
     */
    public SpTableManager selectSpTableManagerById(Long id);

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
     * 删除基础数据配置平台
     * 
     * @param id 基础数据配置平台ID
     * @return 结果
     */
    public int deleteSpTableManagerById(Long id);

    /**
     * 批量删除基础数据配置平台
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSpTableManagerByIds(String[] ids);
}
