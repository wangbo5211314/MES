package com.ruoyi.rawmate.service;

import com.ruoyi.rawmate.domain.RawMateGdohq;

import java.util.List;


/**
 * 光电耦合器Service接口
 * 
 * @author wangbo
 * @date 2020-12-11
 */
public interface IRawMateGdohqService 
{
    /**
     * 查询光电耦合器
     * 
     * @param gdohqId 光电耦合器ID
     * @return 光电耦合器
     */
    public RawMateGdohq selectRawMateGdohqById(Long gdohqId);

    /**
     * 查询光电耦合器列表
     * 
     * @param rawMateGdohq 光电耦合器
     * @return 光电耦合器集合
     */
    public List<RawMateGdohq> selectRawMateGdohqList(RawMateGdohq rawMateGdohq);

    /**
     * 新增光电耦合器
     * 
     * @param rawMateGdohq 光电耦合器
     * @return 结果
     */
    public int insertRawMateGdohq(RawMateGdohq rawMateGdohq);

    /**
     * 修改光电耦合器
     * 
     * @param rawMateGdohq 光电耦合器
     * @return 结果
     */
    public int updateRawMateGdohq(RawMateGdohq rawMateGdohq);

    /**
     * 批量删除光电耦合器
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRawMateGdohqByIds(String ids);

    /**
     * 删除光电耦合器信息
     * 
     * @param gdohqId 光电耦合器ID
     * @return 结果
     */
    public int deleteRawMateGdohqById(Long gdohqId);
}
