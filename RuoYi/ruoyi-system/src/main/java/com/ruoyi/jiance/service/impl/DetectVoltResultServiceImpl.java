package com.ruoyi.jiance.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.jiance.mapper.DetectVoltResultMapper;
import com.ruoyi.jiance.domain.DetectVoltResult;
import com.ruoyi.jiance.service.IDetectVoltResultService;
import com.ruoyi.common.core.text.Convert;

/**
 * 耐压Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-15
 */
@Service
public class DetectVoltResultServiceImpl implements IDetectVoltResultService 
{
    @Autowired
    private DetectVoltResultMapper detectVoltResultMapper;

    /**
     * 查询耐压
     * 
     * @param id 耐压ID
     * @return 耐压
     */
    @Override
    public DetectVoltResult selectDetectVoltResultById(Long id)
    {
        return detectVoltResultMapper.selectDetectVoltResultById(id);
    }

    /**
     * 查询耐压列表
     * 
     * @param detectVoltResult 耐压
     * @return 耐压
     */
    @Override
    public List<DetectVoltResult> selectDetectVoltResultList(DetectVoltResult detectVoltResult)
    {
        return detectVoltResultMapper.selectDetectVoltResultList(detectVoltResult);
    }

    /**
     * 新增耐压
     * 
     * @param detectVoltResult 耐压
     * @return 结果
     */
    @Override
    public int insertDetectVoltResult(DetectVoltResult detectVoltResult)
    {
        return detectVoltResultMapper.insertDetectVoltResult(detectVoltResult);
    }

    /**
     * 修改耐压
     * 
     * @param detectVoltResult 耐压
     * @return 结果
     */
    @Override
    public int updateDetectVoltResult(DetectVoltResult detectVoltResult)
    {
        return detectVoltResultMapper.updateDetectVoltResult(detectVoltResult);
    }

    /**
     * 删除耐压对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDetectVoltResultByIds(String ids)
    {
        return detectVoltResultMapper.deleteDetectVoltResultByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除耐压信息
     * 
     * @param id 耐压ID
     * @return 结果
     */
    @Override
    public int deleteDetectVoltResultById(Long id)
    {
        return detectVoltResultMapper.deleteDetectVoltResultById(id);
    }
}
