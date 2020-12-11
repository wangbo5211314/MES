package com.ruoyi.rawmate.service.impl;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateDlhgq;
import com.ruoyi.rawmate.mapper.RawMateDlhgqMapper;
import com.ruoyi.rawmate.service.IRawMateDlhgqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 电流互感器Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Service
public class RawMateDlhgqServiceImpl implements IRawMateDlhgqService
{
    @Autowired
    private RawMateDlhgqMapper rawMateDlhgqMapper;

    /**
     * 查询电流互感器
     * 
     * @param dlhgqId 电流互感器ID
     * @return 电流互感器
     */
    @Override
    public RawMateDlhgq selectRawMateDlhgqById(Long dlhgqId)
    {
        return rawMateDlhgqMapper.selectRawMateDlhgqById(dlhgqId);
    }

    /**
     * 查询电流互感器列表
     * 
     * @param rawMateDlhgq 电流互感器
     * @return 电流互感器
     */
    @Override
    public List<RawMateDlhgq> selectRawMateDlhgqList(RawMateDlhgq rawMateDlhgq)
    {
        return rawMateDlhgqMapper.selectRawMateDlhgqList(rawMateDlhgq);
    }

    /**
     * 新增电流互感器
     * 
     * @param rawMateDlhgq 电流互感器
     * @return 结果
     */
    @Override
    public int insertRawMateDlhgq(RawMateDlhgq rawMateDlhgq)
    {
        return rawMateDlhgqMapper.insertRawMateDlhgq(rawMateDlhgq);
    }

    /**
     * 修改电流互感器
     * 
     * @param rawMateDlhgq 电流互感器
     * @return 结果
     */
    @Override
    public int updateRawMateDlhgq(RawMateDlhgq rawMateDlhgq)
    {
        return rawMateDlhgqMapper.updateRawMateDlhgq(rawMateDlhgq);
    }

    /**
     * 删除电流互感器对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRawMateDlhgqByIds(String ids)
    {
        return rawMateDlhgqMapper.deleteRawMateDlhgqByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除电流互感器信息
     * 
     * @param dlhgqId 电流互感器ID
     * @return 结果
     */
    @Override
    public int deleteRawMateDlhgqById(Long dlhgqId)
    {
        return rawMateDlhgqMapper.deleteRawMateDlhgqById(dlhgqId);
    }
}
