package com.ruoyi.jiance.service.impl;

import java.util.List;

import com.ruoyi.jiance.domain.DetectImageResult;
import com.ruoyi.jiance.mapper.DetectImageResultMapper;
import com.ruoyi.jiance.service.IDetectImageResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 图像结论表Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-15
 */
@Service
public class DetectImageResultServiceImpl implements IDetectImageResultService
{
    @Autowired
    private DetectImageResultMapper detectImageResultMapper;

    /**
     * 查询图像结论表
     * 
     * @param id 图像结论表ID
     * @return 图像结论表
     */
    @Override
    public DetectImageResult selectDetectImageResultById(Long id)
    {
        return detectImageResultMapper.selectDetectImageResultById(id);
    }

    /**
     * 查询图像结论表列表
     * 
     * @param detectImageResult 图像结论表
     * @return 图像结论表
     */
    @Override
    public List<DetectImageResult> selectDetectImageResultList(DetectImageResult detectImageResult)
    {
        return detectImageResultMapper.selectDetectImageResultList(detectImageResult);
    }

    /**
     * 新增图像结论表
     * 
     * @param detectImageResult 图像结论表
     * @return 结果
     */
    @Override
    public int insertDetectImageResult(DetectImageResult detectImageResult)
    {
        return detectImageResultMapper.insertDetectImageResult(detectImageResult);
    }

    /**
     * 修改图像结论表
     * 
     * @param detectImageResult 图像结论表
     * @return 结果
     */
    @Override
    public int updateDetectImageResult(DetectImageResult detectImageResult)
    {
        return detectImageResultMapper.updateDetectImageResult(detectImageResult);
    }

    /**
     * 删除图像结论表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDetectImageResultByIds(String ids)
    {
        return detectImageResultMapper.deleteDetectImageResultByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除图像结论表信息
     * 
     * @param id 图像结论表ID
     * @return 结果
     */
    @Override
    public int deleteDetectImageResultById(Long id)
    {
        return detectImageResultMapper.deleteDetectImageResultById(id);
    }
}
