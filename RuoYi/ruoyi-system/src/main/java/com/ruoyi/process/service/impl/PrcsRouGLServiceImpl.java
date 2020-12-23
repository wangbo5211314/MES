package com.ruoyi.process.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.process.mapper.PrcsRouGLMapper;
import com.ruoyi.process.domain.PrcsRouGL;
import com.ruoyi.process.service.IPrcsRouGLService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工艺路线管理Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-23
 */
@Service
public class PrcsRouGLServiceImpl implements IPrcsRouGLService 
{
    @Autowired
    private PrcsRouGLMapper prcsRouGLMapper;

    /**
     * 查询工艺路线管理
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 工艺路线管理
     */
    @Override
    public PrcsRouGL selectPrcsRouGLById(Long spFlowId)
    {
        return prcsRouGLMapper.selectPrcsRouGLById(spFlowId);
    }

    /**
     * 查询工艺路线管理列表
     * 
     * @param prcsRouGL 工艺路线管理
     * @return 工艺路线管理
     */
    @Override
    public List<PrcsRouGL> selectPrcsRouGLList(PrcsRouGL prcsRouGL)
    {
        return prcsRouGLMapper.selectPrcsRouGLList(prcsRouGL);
    }

    /**
     * 新增工艺路线管理
     * 
     * @param prcsRouGL 工艺路线管理
     * @return 结果
     */
    @Override
    public int insertPrcsRouGL(PrcsRouGL prcsRouGL)
    {
        prcsRouGL.setCreateTime(DateUtils.getNowDate());
        return prcsRouGLMapper.insertPrcsRouGL(prcsRouGL);
    }

    /**
     * 修改工艺路线管理
     * 
     * @param prcsRouGL 工艺路线管理
     * @return 结果
     */
    @Override
    public int updatePrcsRouGL(PrcsRouGL prcsRouGL)
    {
        prcsRouGL.setUpdateTime(DateUtils.getNowDate());
        return prcsRouGLMapper.updatePrcsRouGL(prcsRouGL);
    }

    /**
     * 删除工艺路线管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePrcsRouGLByIds(String ids)
    {
        return prcsRouGLMapper.deletePrcsRouGLByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工艺路线管理信息
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 结果
     */
    @Override
    public int deletePrcsRouGLById(Long spFlowId)
    {
        return prcsRouGLMapper.deletePrcsRouGLById(spFlowId);
    }
}
