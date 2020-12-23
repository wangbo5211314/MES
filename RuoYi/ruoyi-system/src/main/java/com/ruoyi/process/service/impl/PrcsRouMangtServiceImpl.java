package com.ruoyi.process.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.process.mapper.PrcsRouMangtMapper;
import com.ruoyi.process.domain.PrcsRouMangt;
import com.ruoyi.process.service.IPrcsRouMangtService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工艺路线管理Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-23
 */
@Service
public class PrcsRouMangtServiceImpl implements IPrcsRouMangtService 
{
    @Autowired
    private PrcsRouMangtMapper prcsRouMangtMapper;

    /**
     * 查询工艺路线管理
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 工艺路线管理
     */
    @Override
    public PrcsRouMangt selectPrcsRouMangtById(Long spFlowId)
    {
        return prcsRouMangtMapper.selectPrcsRouMangtById(spFlowId);
    }

    /**
     * 查询工艺路线管理列表
     * 
     * @param prcsRouMangt 工艺路线管理
     * @return 工艺路线管理
     */
    @Override
    public List<PrcsRouMangt> selectPrcsRouMangtList(PrcsRouMangt prcsRouMangt)
    {
        return prcsRouMangtMapper.selectPrcsRouMangtList(prcsRouMangt);
    }

    /**
     * 新增工艺路线管理
     * 
     * @param prcsRouMangt 工艺路线管理
     * @return 结果
     */
    @Override
    public int insertPrcsRouMangt(PrcsRouMangt prcsRouMangt)
    {
        prcsRouMangt.setCreateTime(DateUtils.getNowDate());
        return prcsRouMangtMapper.insertPrcsRouMangt(prcsRouMangt);
    }

    /**
     * 修改工艺路线管理
     * 
     * @param prcsRouMangt 工艺路线管理
     * @return 结果
     */
    @Override
    public int updatePrcsRouMangt(PrcsRouMangt prcsRouMangt)
    {
        prcsRouMangt.setUpdateTime(DateUtils.getNowDate());
        return prcsRouMangtMapper.updatePrcsRouMangt(prcsRouMangt);
    }

    /**
     * 删除工艺路线管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePrcsRouMangtByIds(String ids)
    {
        return prcsRouMangtMapper.deletePrcsRouMangtByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工艺路线管理信息
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 结果
     */
    @Override
    public int deletePrcsRouMangtById(Long spFlowId)
    {
        return prcsRouMangtMapper.deletePrcsRouMangtById(spFlowId);
    }
}
