package com.ruoyi.rawmate.service.impl;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateYj;
import com.ruoyi.rawmate.mapper.RawMateYjMapper;
import com.ruoyi.rawmate.service.IRawMateYjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 液晶Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Service
public class RawMateYjServiceImpl implements IRawMateYjService
{
    @Autowired
    private RawMateYjMapper rawMateYjMapper;

    /**
     * 查询液晶
     * 
     * @param yjId 液晶ID
     * @return 液晶
     */
    @Override
    public RawMateYj selectRawMateYjById(Long yjId)
    {
        return rawMateYjMapper.selectRawMateYjById(yjId);
    }

    /**
     * 查询液晶列表
     * 
     * @param rawMateYj 液晶
     * @return 液晶
     */
    @Override
    public List<RawMateYj> selectRawMateYjList(RawMateYj rawMateYj)
    {
        return rawMateYjMapper.selectRawMateYjList(rawMateYj);
    }

    /**
     * 新增液晶
     * 
     * @param rawMateYj 液晶
     * @return 结果
     */
    @Override
    public int insertRawMateYj(RawMateYj rawMateYj)
    {
        return rawMateYjMapper.insertRawMateYj(rawMateYj);
    }

    /**
     * 修改液晶
     * 
     * @param rawMateYj 液晶
     * @return 结果
     */
    @Override
    public int updateRawMateYj(RawMateYj rawMateYj)
    {
        return rawMateYjMapper.updateRawMateYj(rawMateYj);
    }

    /**
     * 删除液晶对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRawMateYjByIds(String ids)
    {
        return rawMateYjMapper.deleteRawMateYjByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除液晶信息
     * 
     * @param yjId 液晶ID
     * @return 结果
     */
    @Override
    public int deleteRawMateYjById(Long yjId)
    {
        return rawMateYjMapper.deleteRawMateYjById(yjId);
    }
}
