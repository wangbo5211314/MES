package com.ruoyi.rawmate.service.impl;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateYmdz;
import com.ruoyi.rawmate.mapper.RawMateYmdzMapper;
import com.ruoyi.rawmate.service.IRawMateYmdzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 压敏电阻Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Service
public class RawMateYmdzServiceImpl implements IRawMateYmdzService
{
    @Autowired
    private RawMateYmdzMapper rawMateYmdzMapper;

    /**
     * 查询压敏电阻
     * 
     * @param varistorId 压敏电阻ID
     * @return 压敏电阻
     */
    @Override
    public RawMateYmdz selectRawMateYmdzById(Long varistorId)
    {
        return rawMateYmdzMapper.selectRawMateYmdzById(varistorId);
    }

    /**
     * 查询压敏电阻列表
     * 
     * @param rawMateYmdz 压敏电阻
     * @return 压敏电阻
     */
    @Override
    public List<RawMateYmdz> selectRawMateYmdzList(RawMateYmdz rawMateYmdz)
    {
        return rawMateYmdzMapper.selectRawMateYmdzList(rawMateYmdz);
    }

    /**
     * 新增压敏电阻
     * 
     * @param rawMateYmdz 压敏电阻
     * @return 结果
     */
    @Override
    public int insertRawMateYmdz(RawMateYmdz rawMateYmdz)
    {
        return rawMateYmdzMapper.insertRawMateYmdz(rawMateYmdz);
    }

    /**
     * 修改压敏电阻
     * 
     * @param rawMateYmdz 压敏电阻
     * @return 结果
     */
    @Override
    public int updateRawMateYmdz(RawMateYmdz rawMateYmdz)
    {
        return rawMateYmdzMapper.updateRawMateYmdz(rawMateYmdz);
    }

    /**
     * 删除压敏电阻对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRawMateYmdzByIds(String ids)
    {
        return rawMateYmdzMapper.deleteRawMateYmdzByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除压敏电阻信息
     * 
     * @param varistorId 压敏电阻ID
     * @return 结果
     */
    @Override
    public int deleteRawMateYmdzById(Long varistorId)
    {
        return rawMateYmdzMapper.deleteRawMateYmdzById(varistorId);
    }
}
