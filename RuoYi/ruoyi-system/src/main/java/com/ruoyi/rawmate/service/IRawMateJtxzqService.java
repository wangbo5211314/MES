package com.ruoyi.rawmate.service;

import com.ruoyi.rawmate.domain.RawMateJtxzq;

import java.util.List;

/**
 * 晶体谐振器Service接口
 * 
 * @author wangbo
 * @date 2020-12-11
 */
public interface IRawMateJtxzqService 
{
    /**
     * 查询晶体谐振器
     * 
     * @param jtxzqId 晶体谐振器ID
     * @return 晶体谐振器
     */
    public RawMateJtxzq selectRawMateJtxzqById(Long jtxzqId);

    /**
     * 查询晶体谐振器列表
     * 
     * @param rawMateJtxzq 晶体谐振器
     * @return 晶体谐振器集合
     */
    public List<RawMateJtxzq> selectRawMateJtxzqList(RawMateJtxzq rawMateJtxzq);

    /**
     * 新增晶体谐振器
     * 
     * @param rawMateJtxzq 晶体谐振器
     * @return 结果
     */
    public int insertRawMateJtxzq(RawMateJtxzq rawMateJtxzq);

    /**
     * 修改晶体谐振器
     * 
     * @param rawMateJtxzq 晶体谐振器
     * @return 结果
     */
    public int updateRawMateJtxzq(RawMateJtxzq rawMateJtxzq);

    /**
     * 批量删除晶体谐振器
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRawMateJtxzqByIds(String ids);

    /**
     * 删除晶体谐振器信息
     * 
     * @param jtxzqId 晶体谐振器ID
     * @return 结果
     */
    public int deleteRawMateJtxzqById(Long jtxzqId);
}
