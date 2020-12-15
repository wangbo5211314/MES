package com.ruoyi.chujian.mapper;

import com.ruoyi.chujian.domain.DetectFirstResult;

import java.util.List;


/**
 * 初校Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-15
 */
public interface DetectFirstResultMapper 
{
    /**
     * 查询初校
     * 
     * @param id 初校ID
     * @return 初校
     */
    public DetectFirstResult selectDetectFirstResultById(Long id);

    /**
     * 查询初校列表
     * 
     * @param detectFirstResult 初校
     * @return 初校集合
     */
    public List<DetectFirstResult> selectDetectFirstResultList(DetectFirstResult detectFirstResult);

    /**
     * 新增初校
     * 
     * @param detectFirstResult 初校
     * @return 结果
     */
    public int insertDetectFirstResult(DetectFirstResult detectFirstResult);

    /**
     * 修改初校
     * 
     * @param detectFirstResult 初校
     * @return 结果
     */
    public int updateDetectFirstResult(DetectFirstResult detectFirstResult);

    /**
     * 删除初校
     * 
     * @param id 初校ID
     * @return 结果
     */
    public int deleteDetectFirstResultById(Long id);

    /**
     * 批量删除初校
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDetectFirstResultByIds(String[] ids);
}
