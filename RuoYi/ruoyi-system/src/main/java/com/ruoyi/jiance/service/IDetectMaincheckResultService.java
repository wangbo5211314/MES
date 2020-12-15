package com.ruoyi.jiance.service;

import com.ruoyi.jiance.domain.DetectMaincheckResult;

import java.util.List;


/**
 * 复校Service接口
 * 
 * @author wangbo
 * @date 2020-12-15
 */
public interface IDetectMaincheckResultService 
{
    /**
     * 查询复校
     * 
     * @param id 复校ID
     * @return 复校
     */
    public DetectMaincheckResult selectDetectMaincheckResultById(Long id);

    /**
     * 查询复校列表
     * 
     * @param detectMaincheckResult 复校
     * @return 复校集合
     */
    public List<DetectMaincheckResult> selectDetectMaincheckResultList(DetectMaincheckResult detectMaincheckResult);

    /**
     * 新增复校
     * 
     * @param detectMaincheckResult 复校
     * @return 结果
     */
    public int insertDetectMaincheckResult(DetectMaincheckResult detectMaincheckResult);

    /**
     * 修改复校
     * 
     * @param detectMaincheckResult 复校
     * @return 结果
     */
    public int updateDetectMaincheckResult(DetectMaincheckResult detectMaincheckResult);

    /**
     * 批量删除复校
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDetectMaincheckResultByIds(String ids);

    /**
     * 删除复校信息
     * 
     * @param id 复校ID
     * @return 结果
     */
    public int deleteDetectMaincheckResultById(Long id);
}
