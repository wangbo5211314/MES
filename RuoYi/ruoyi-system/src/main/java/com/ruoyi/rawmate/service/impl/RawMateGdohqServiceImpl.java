package com.ruoyi.rawmate.service.impl;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateGdohq;
import com.ruoyi.rawmate.mapper.RawMateGdohqMapper;
import com.ruoyi.rawmate.service.IRawMateGdohqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 光电耦合器Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Service
public class RawMateGdohqServiceImpl implements IRawMateGdohqService
{
    @Autowired
    private RawMateGdohqMapper rawMateGdohqMapper;

    /**
     * 查询光电耦合器
     * 
     * @param gdohqId 光电耦合器ID
     * @return 光电耦合器
     */
    @Override
    public RawMateGdohq selectRawMateGdohqById(Long gdohqId)
    {
        return rawMateGdohqMapper.selectRawMateGdohqById(gdohqId);
    }

    /**
     * 查询光电耦合器列表
     * 
     * @param rawMateGdohq 光电耦合器
     * @return 光电耦合器
     */
    @Override
    public List<RawMateGdohq> selectRawMateGdohqList(RawMateGdohq rawMateGdohq)
    {
        return rawMateGdohqMapper.selectRawMateGdohqList(rawMateGdohq);
    }

    /**
     * 新增光电耦合器
     * 
     * @param rawMateGdohq 光电耦合器
     * @return 结果
     */
    @Override
    public int insertRawMateGdohq(RawMateGdohq rawMateGdohq)
    {
        return rawMateGdohqMapper.insertRawMateGdohq(rawMateGdohq);
    }

    /**
     * 修改光电耦合器
     * 
     * @param rawMateGdohq 光电耦合器
     * @return 结果
     */
    @Override
    public int updateRawMateGdohq(RawMateGdohq rawMateGdohq)
    {
        return rawMateGdohqMapper.updateRawMateGdohq(rawMateGdohq);
    }

    /**
     * 删除光电耦合器对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRawMateGdohqByIds(String ids)
    {
        return rawMateGdohqMapper.deleteRawMateGdohqByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除光电耦合器信息
     * 
     * @param gdohqId 光电耦合器ID
     * @return 结果
     */
    @Override
    public int deleteRawMateGdohqById(Long gdohqId)
    {
        return rawMateGdohqMapper.deleteRawMateGdohqById(gdohqId);
    }
}
