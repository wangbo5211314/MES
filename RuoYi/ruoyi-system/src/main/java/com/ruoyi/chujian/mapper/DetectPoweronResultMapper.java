package com.ruoyi.chujian.mapper;

import com.ruoyi.chujian.domain.DetectPoweronResult;

import java.util.List;


/**
 * 上电初检Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-15
 */
public interface DetectPoweronResultMapper 
{
    /**
     * 查询上电初检
     * 
     * @param id 上电初检ID
     * @return 上电初检
     */
    public DetectPoweronResult selectDetectPoweronResultById(Long id);

    /**
     * 查询上电初检列表
     * 
     * @param detectPoweronResult 上电初检
     * @return 上电初检集合
     */
    public List<DetectPoweronResult> selectDetectPoweronResultList(DetectPoweronResult detectPoweronResult);

    /**
     * 新增上电初检
     * 
     * @param detectPoweronResult 上电初检
     * @return 结果
     */
    public int insertDetectPoweronResult(DetectPoweronResult detectPoweronResult);

    /**
     * 修改上电初检
     * 
     * @param detectPoweronResult 上电初检
     * @return 结果
     */
    public int updateDetectPoweronResult(DetectPoweronResult detectPoweronResult);

    /**
     * 删除上电初检
     * 
     * @param id 上电初检ID
     * @return 结果
     */
    public int deleteDetectPoweronResultById(Long id);

    /**
     * 批量删除上电初检
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDetectPoweronResultByIds(String[] ids);
}
