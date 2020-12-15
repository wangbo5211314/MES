package com.ruoyi.jiance.service;

import java.util.List;
import com.ruoyi.jiance.domain.DetectVoltResult;

/**
 * 耐压Service接口
 * 
 * @author wangbo
 * @date 2020-12-15
 */
public interface IDetectVoltResultService 
{
    /**
     * 查询耐压
     * 
     * @param id 耐压ID
     * @return 耐压
     */
    public DetectVoltResult selectDetectVoltResultById(Long id);

    /**
     * 查询耐压列表
     * 
     * @param detectVoltResult 耐压
     * @return 耐压集合
     */
    public List<DetectVoltResult> selectDetectVoltResultList(DetectVoltResult detectVoltResult);

    /**
     * 新增耐压
     * 
     * @param detectVoltResult 耐压
     * @return 结果
     */
    public int insertDetectVoltResult(DetectVoltResult detectVoltResult);

    /**
     * 修改耐压
     * 
     * @param detectVoltResult 耐压
     * @return 结果
     */
    public int updateDetectVoltResult(DetectVoltResult detectVoltResult);

    /**
     * 批量删除耐压
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDetectVoltResultByIds(String ids);

    /**
     * 删除耐压信息
     * 
     * @param id 耐压ID
     * @return 结果
     */
    public int deleteDetectVoltResultById(Long id);
}
