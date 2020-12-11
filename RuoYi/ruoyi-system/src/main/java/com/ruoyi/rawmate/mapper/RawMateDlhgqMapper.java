package com.ruoyi.rawmate.mapper;

import com.ruoyi.rawmate.domain.RawMateDlhgq;

import java.util.List;

/**
 * 电流互感器Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-11
 */
public interface RawMateDlhgqMapper 
{
    /**
     * 查询电流互感器
     * 
     * @param dlhgqId 电流互感器ID
     * @return 电流互感器
     */
    public RawMateDlhgq selectRawMateDlhgqById(Long dlhgqId);

    /**
     * 查询电流互感器列表
     * 
     * @param rawMateDlhgq 电流互感器
     * @return 电流互感器集合
     */
    public List<RawMateDlhgq> selectRawMateDlhgqList(RawMateDlhgq rawMateDlhgq);

    /**
     * 新增电流互感器
     * 
     * @param rawMateDlhgq 电流互感器
     * @return 结果
     */
    public int insertRawMateDlhgq(RawMateDlhgq rawMateDlhgq);

    /**
     * 修改电流互感器
     * 
     * @param rawMateDlhgq 电流互感器
     * @return 结果
     */
    public int updateRawMateDlhgq(RawMateDlhgq rawMateDlhgq);

    /**
     * 删除电流互感器
     * 
     * @param dlhgqId 电流互感器ID
     * @return 结果
     */
    public int deleteRawMateDlhgqById(Long dlhgqId);

    /**
     * 批量删除电流互感器
     * 
     * @param dlhgqIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteRawMateDlhgqByIds(String[] dlhgqIds);
}
