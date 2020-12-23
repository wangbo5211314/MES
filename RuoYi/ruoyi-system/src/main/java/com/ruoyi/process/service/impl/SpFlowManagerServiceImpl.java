package com.ruoyi.process.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.process.mapper.SpFlowManagerMapper;
import com.ruoyi.process.domain.SpFlowManager;
import com.ruoyi.process.service.ISpFlowManagerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工艺路线管理Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-23
 */
@Service
public class SpFlowManagerServiceImpl implements ISpFlowManagerService 
{
    @Autowired
    private SpFlowManagerMapper spFlowManagerMapper;

    /**
     * 查询工艺路线管理
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 工艺路线管理
     */
    @Override
    public SpFlowManager selectSpFlowManagerById(Long spFlowId)
    {
        return spFlowManagerMapper.selectSpFlowManagerById(spFlowId);
    }

    /**
     * 查询工艺路线管理列表
     * 
     * @param spFlowManager 工艺路线管理
     * @return 工艺路线管理
     */
    @Override
    public List<SpFlowManager> selectSpFlowManagerList(SpFlowManager spFlowManager)
    {
        return spFlowManagerMapper.selectSpFlowManagerList(spFlowManager);
    }

    /**
     * 新增工艺路线管理
     * 
     * @param spFlowManager 工艺路线管理
     * @return 结果
     */
    @Override
    public int insertSpFlowManager(SpFlowManager spFlowManager)
    {
        spFlowManager.setCreateTime(DateUtils.getNowDate());
        return spFlowManagerMapper.insertSpFlowManager(spFlowManager);
    }

    /**
     * 修改工艺路线管理
     * 
     * @param spFlowManager 工艺路线管理
     * @return 结果
     */
    @Override
    public int updateSpFlowManager(SpFlowManager spFlowManager)
    {
        spFlowManager.setUpdateTime(DateUtils.getNowDate());
        return spFlowManagerMapper.updateSpFlowManager(spFlowManager);
    }

    /**
     * 删除工艺路线管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSpFlowManagerByIds(String ids)
    {
        return spFlowManagerMapper.deleteSpFlowManagerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工艺路线管理信息
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 结果
     */
    @Override
    public int deleteSpFlowManagerById(Long spFlowId)
    {
        return spFlowManagerMapper.deleteSpFlowManagerById(spFlowId);
    }
}
