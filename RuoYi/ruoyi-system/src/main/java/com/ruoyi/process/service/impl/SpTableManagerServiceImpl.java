package com.ruoyi.process.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.process.mapper.SpTableManagerMapper;
import com.ruoyi.process.domain.SpTableManager;
import com.ruoyi.process.service.ISpTableManagerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 基础数据配置平台Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-22
 */
@Service
public class SpTableManagerServiceImpl implements ISpTableManagerService 
{
    @Autowired
    private SpTableManagerMapper spTableManagerMapper;

    /**
     * 查询基础数据配置平台
     * 
     * @param id 基础数据配置平台ID
     * @return 基础数据配置平台
     */
    @Override
    public SpTableManager selectSpTableManagerById(Long id)
    {
        return spTableManagerMapper.selectSpTableManagerById(id);
    }

    /**
     * 查询基础数据配置平台列表
     * 
     * @param spTableManager 基础数据配置平台
     * @return 基础数据配置平台
     */
    @Override
    public List<SpTableManager> selectSpTableManagerList(SpTableManager spTableManager)
    {
        return spTableManagerMapper.selectSpTableManagerList(spTableManager);
    }

    /**
     * 新增基础数据配置平台
     * 
     * @param spTableManager 基础数据配置平台
     * @return 结果
     */
    @Override
    public int insertSpTableManager(SpTableManager spTableManager)
    {
        spTableManager.setCreateTime(DateUtils.getNowDate());
        return spTableManagerMapper.insertSpTableManager(spTableManager);
    }

    /**
     * 修改基础数据配置平台
     * 
     * @param spTableManager 基础数据配置平台
     * @return 结果
     */
    @Override
    public int updateSpTableManager(SpTableManager spTableManager)
    {
        spTableManager.setUpdateTime(DateUtils.getNowDate());
        return spTableManagerMapper.updateSpTableManager(spTableManager);
    }

    /**
     * 删除基础数据配置平台对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSpTableManagerByIds(String ids)
    {
        return spTableManagerMapper.deleteSpTableManagerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除基础数据配置平台信息
     * 
     * @param id 基础数据配置平台ID
     * @return 结果
     */
    @Override
    public int deleteSpTableManagerById(Long id)
    {
        return spTableManagerMapper.deleteSpTableManagerById(id);
    }
}
