package com.ruoyi.rawmate.mapper;

import com.ruoyi.rawmate.domain.RawMateJtxzq;

import java.util.List;

/**
 * 晶体谐振器Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-11
 */
public interface RawMateJtxzqMapper 
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
     * 删除晶体谐振器
     * 
     * @param jtxzqId 晶体谐振器ID
     * @return 结果
     */
    public int deleteRawMateJtxzqById(Long jtxzqId);

    /**
     * 批量删除晶体谐振器
     * 
     * @param jtxzqIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteRawMateJtxzqByIds(String[] jtxzqIds);
}
