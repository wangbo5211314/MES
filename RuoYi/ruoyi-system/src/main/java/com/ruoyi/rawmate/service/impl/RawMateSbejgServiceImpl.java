package com.ruoyi.rawmate.service.impl;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateSbejg;
import com.ruoyi.rawmate.mapper.RawMateSbejgMapper;
import com.ruoyi.rawmate.service.IRawMateSbejgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 瞬变二极管Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Service
public class RawMateSbejgServiceImpl implements IRawMateSbejgService
{
    @Autowired
    private RawMateSbejgMapper rawMateSbejgMapper;

    /**
     * 查询瞬变二极管
     * 
     * @param sbejgId 瞬变二极管ID
     * @return 瞬变二极管
     */
    @Override
    public RawMateSbejg selectRawMateSbejgById(Long sbejgId)
    {
        return rawMateSbejgMapper.selectRawMateSbejgById(sbejgId);
    }

    /**
     * 查询瞬变二极管列表
     * 
     * @param rawMateSbejg 瞬变二极管
     * @return 瞬变二极管
     */
    @Override
    public List<RawMateSbejg> selectRawMateSbejgList(RawMateSbejg rawMateSbejg)
    {
        return rawMateSbejgMapper.selectRawMateSbejgList(rawMateSbejg);
    }

    /**
     * 新增瞬变二极管
     * 
     * @param rawMateSbejg 瞬变二极管
     * @return 结果
     */
    @Override
    public int insertRawMateSbejg(RawMateSbejg rawMateSbejg)
    {
        return rawMateSbejgMapper.insertRawMateSbejg(rawMateSbejg);
    }

    /**
     * 修改瞬变二极管
     * 
     * @param rawMateSbejg 瞬变二极管
     * @return 结果
     */
    @Override
    public int updateRawMateSbejg(RawMateSbejg rawMateSbejg)
    {
        return rawMateSbejgMapper.updateRawMateSbejg(rawMateSbejg);
    }

    /**
     * 删除瞬变二极管对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRawMateSbejgByIds(String ids)
    {
        return rawMateSbejgMapper.deleteRawMateSbejgByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除瞬变二极管信息
     * 
     * @param sbejgId 瞬变二极管ID
     * @return 结果
     */
    @Override
    public int deleteRawMateSbejgById(Long sbejgId)
    {
        return rawMateSbejgMapper.deleteRawMateSbejgById(sbejgId);
    }
}
