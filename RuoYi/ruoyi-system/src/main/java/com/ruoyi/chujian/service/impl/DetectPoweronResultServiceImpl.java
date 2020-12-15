package com.ruoyi.chujian.service.impl;

import java.util.List;

import com.ruoyi.chujian.domain.DetectPoweronResult;
import com.ruoyi.chujian.mapper.DetectPoweronResultMapper;
import com.ruoyi.chujian.service.IDetectPoweronResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 上电初检Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-15
 */
@Service
public class DetectPoweronResultServiceImpl implements IDetectPoweronResultService
{
    @Autowired
    private DetectPoweronResultMapper detectPoweronResultMapper;

    /**
     * 查询上电初检
     * 
     * @param id 上电初检ID
     * @return 上电初检
     */
    @Override
    public DetectPoweronResult selectDetectPoweronResultById(Long id)
    {
        return detectPoweronResultMapper.selectDetectPoweronResultById(id);
    }

    /**
     * 查询上电初检列表
     * 
     * @param detectPoweronResult 上电初检
     * @return 上电初检
     */
    @Override
    public List<DetectPoweronResult> selectDetectPoweronResultList(DetectPoweronResult detectPoweronResult)
    {
        return detectPoweronResultMapper.selectDetectPoweronResultList(detectPoweronResult);
    }

    /**
     * 新增上电初检
     * 
     * @param detectPoweronResult 上电初检
     * @return 结果
     */
    @Override
    public int insertDetectPoweronResult(DetectPoweronResult detectPoweronResult)
    {
        return detectPoweronResultMapper.insertDetectPoweronResult(detectPoweronResult);
    }

    /**
     * 修改上电初检
     * 
     * @param detectPoweronResult 上电初检
     * @return 结果
     */
    @Override
    public int updateDetectPoweronResult(DetectPoweronResult detectPoweronResult)
    {
        return detectPoweronResultMapper.updateDetectPoweronResult(detectPoweronResult);
    }

    /**
     * 删除上电初检对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDetectPoweronResultByIds(String ids)
    {
        return detectPoweronResultMapper.deleteDetectPoweronResultByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除上电初检信息
     * 
     * @param id 上电初检ID
     * @return 结果
     */
    @Override
    public int deleteDetectPoweronResultById(Long id)
    {
        return detectPoweronResultMapper.deleteDetectPoweronResultById(id);
    }
}
