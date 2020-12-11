package com.ruoyi.rawmate.service.impl;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateJtxzq;
import com.ruoyi.rawmate.mapper.RawMateJtxzqMapper;
import com.ruoyi.rawmate.service.IRawMateJtxzqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 晶体谐振器Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Service
public class RawMateJtxzqServiceImpl implements IRawMateJtxzqService
{
    @Autowired
    private RawMateJtxzqMapper rawMateJtxzqMapper;

    /**
     * 查询晶体谐振器
     * 
     * @param jtxzqId 晶体谐振器ID
     * @return 晶体谐振器
     */
    @Override
    public RawMateJtxzq selectRawMateJtxzqById(Long jtxzqId)
    {
        return rawMateJtxzqMapper.selectRawMateJtxzqById(jtxzqId);
    }

    /**
     * 查询晶体谐振器列表
     * 
     * @param rawMateJtxzq 晶体谐振器
     * @return 晶体谐振器
     */
    @Override
    public List<RawMateJtxzq> selectRawMateJtxzqList(RawMateJtxzq rawMateJtxzq)
    {
        return rawMateJtxzqMapper.selectRawMateJtxzqList(rawMateJtxzq);
    }

    /**
     * 新增晶体谐振器
     * 
     * @param rawMateJtxzq 晶体谐振器
     * @return 结果
     */
    @Override
    public int insertRawMateJtxzq(RawMateJtxzq rawMateJtxzq)
    {
        return rawMateJtxzqMapper.insertRawMateJtxzq(rawMateJtxzq);
    }

    /**
     * 修改晶体谐振器
     * 
     * @param rawMateJtxzq 晶体谐振器
     * @return 结果
     */
    @Override
    public int updateRawMateJtxzq(RawMateJtxzq rawMateJtxzq)
    {
        return rawMateJtxzqMapper.updateRawMateJtxzq(rawMateJtxzq);
    }

    /**
     * 删除晶体谐振器对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRawMateJtxzqByIds(String ids)
    {
        return rawMateJtxzqMapper.deleteRawMateJtxzqByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除晶体谐振器信息
     * 
     * @param jtxzqId 晶体谐振器ID
     * @return 结果
     */
    @Override
    public int deleteRawMateJtxzqById(Long jtxzqId)
    {
        return rawMateJtxzqMapper.deleteRawMateJtxzqById(jtxzqId);
    }
}
