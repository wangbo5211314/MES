package com.ruoyi.chujian.service.impl;

import java.util.List;

import com.ruoyi.chujian.domain.DetectFirstResult;
import com.ruoyi.chujian.mapper.DetectFirstResultMapper;
import com.ruoyi.chujian.service.IDetectFirstResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 初校Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-15
 */
@Service
public class DetectFirstResultServiceImpl implements IDetectFirstResultService
{
    @Autowired
    private DetectFirstResultMapper detectFirstResultMapper;

    /**
     * 查询初校
     * 
     * @param id 初校ID
     * @return 初校
     */
    @Override
    public DetectFirstResult selectDetectFirstResultById(Long id)
    {
        return detectFirstResultMapper.selectDetectFirstResultById(id);
    }

    /**
     * 查询初校列表
     * 
     * @param detectFirstResult 初校
     * @return 初校
     */
    @Override
    public List<DetectFirstResult> selectDetectFirstResultList(DetectFirstResult detectFirstResult)
    {
        return detectFirstResultMapper.selectDetectFirstResultList(detectFirstResult);
    }

    /**
     * 新增初校
     * 
     * @param detectFirstResult 初校
     * @return 结果
     */
    @Override
    public int insertDetectFirstResult(DetectFirstResult detectFirstResult)
    {
        return detectFirstResultMapper.insertDetectFirstResult(detectFirstResult);
    }

    /**
     * 修改初校
     * 
     * @param detectFirstResult 初校
     * @return 结果
     */
    @Override
    public int updateDetectFirstResult(DetectFirstResult detectFirstResult)
    {
        return detectFirstResultMapper.updateDetectFirstResult(detectFirstResult);
    }

    /**
     * 删除初校对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDetectFirstResultByIds(String ids)
    {
        return detectFirstResultMapper.deleteDetectFirstResultByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除初校信息
     * 
     * @param id 初校ID
     * @return 结果
     */
    @Override
    public int deleteDetectFirstResultById(Long id)
    {
        return detectFirstResultMapper.deleteDetectFirstResultById(id);
    }
}
