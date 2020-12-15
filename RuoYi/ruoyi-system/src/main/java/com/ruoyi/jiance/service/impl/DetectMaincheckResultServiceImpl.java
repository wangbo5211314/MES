package com.ruoyi.jiance.service.impl;

import java.util.List;

import com.ruoyi.jiance.domain.DetectMaincheckResult;
import com.ruoyi.jiance.mapper.DetectMaincheckResultMapper;
import com.ruoyi.jiance.service.IDetectMaincheckResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 复校Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-15
 */
@Service
public class DetectMaincheckResultServiceImpl implements IDetectMaincheckResultService
{
    @Autowired
    private DetectMaincheckResultMapper detectMaincheckResultMapper;

    /**
     * 查询复校
     * 
     * @param id 复校ID
     * @return 复校
     */
    @Override
    public DetectMaincheckResult selectDetectMaincheckResultById(Long id)
    {
        return detectMaincheckResultMapper.selectDetectMaincheckResultById(id);
    }

    /**
     * 查询复校列表
     * 
     * @param detectMaincheckResult 复校
     * @return 复校
     */
    @Override
    public List<DetectMaincheckResult> selectDetectMaincheckResultList(DetectMaincheckResult detectMaincheckResult)
    {
        return detectMaincheckResultMapper.selectDetectMaincheckResultList(detectMaincheckResult);
    }

    /**
     * 新增复校
     * 
     * @param detectMaincheckResult 复校
     * @return 结果
     */
    @Override
    public int insertDetectMaincheckResult(DetectMaincheckResult detectMaincheckResult)
    {
        return detectMaincheckResultMapper.insertDetectMaincheckResult(detectMaincheckResult);
    }

    /**
     * 修改复校
     * 
     * @param detectMaincheckResult 复校
     * @return 结果
     */
    @Override
    public int updateDetectMaincheckResult(DetectMaincheckResult detectMaincheckResult)
    {
        return detectMaincheckResultMapper.updateDetectMaincheckResult(detectMaincheckResult);
    }

    /**
     * 删除复校对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDetectMaincheckResultByIds(String ids)
    {
        return detectMaincheckResultMapper.deleteDetectMaincheckResultByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除复校信息
     * 
     * @param id 复校ID
     * @return 结果
     */
    @Override
    public int deleteDetectMaincheckResultById(Long id)
    {
        return detectMaincheckResultMapper.deleteDetectMaincheckResultById(id);
    }
}
