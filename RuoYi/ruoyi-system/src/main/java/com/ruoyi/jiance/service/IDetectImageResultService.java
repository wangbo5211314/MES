package com.ruoyi.jiance.service;

import com.ruoyi.jiance.domain.DetectImageResult;

import java.util.List;


/**
 * 图像结论表Service接口
 * 
 * @author wangbo
 * @date 2020-12-15
 */
public interface IDetectImageResultService 
{
    /**
     * 查询图像结论表
     * 
     * @param id 图像结论表ID
     * @return 图像结论表
     */
    public DetectImageResult selectDetectImageResultById(Long id);

    /**
     * 查询图像结论表列表
     * 
     * @param detectImageResult 图像结论表
     * @return 图像结论表集合
     */
    public List<DetectImageResult> selectDetectImageResultList(DetectImageResult detectImageResult);

    /**
     * 新增图像结论表
     * 
     * @param detectImageResult 图像结论表
     * @return 结果
     */
    public int insertDetectImageResult(DetectImageResult detectImageResult);

    /**
     * 修改图像结论表
     * 
     * @param detectImageResult 图像结论表
     * @return 结果
     */
    public int updateDetectImageResult(DetectImageResult detectImageResult);

    /**
     * 批量删除图像结论表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDetectImageResultByIds(String ids);

    /**
     * 删除图像结论表信息
     * 
     * @param id 图像结论表ID
     * @return 结果
     */
    public int deleteDetectImageResultById(Long id);
}
