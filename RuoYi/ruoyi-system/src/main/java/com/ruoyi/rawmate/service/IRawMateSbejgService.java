package com.ruoyi.rawmate.service;

import com.ruoyi.rawmate.domain.RawMateSbejg;

import java.util.List;


/**
 * 瞬变二极管Service接口
 * 
 * @author wangbo
 * @date 2020-12-11
 */
public interface IRawMateSbejgService 
{
    /**
     * 查询瞬变二极管
     * 
     * @param sbejgId 瞬变二极管ID
     * @return 瞬变二极管
     */
    public RawMateSbejg selectRawMateSbejgById(Long sbejgId);

    /**
     * 查询瞬变二极管列表
     * 
     * @param rawMateSbejg 瞬变二极管
     * @return 瞬变二极管集合
     */
    public List<RawMateSbejg> selectRawMateSbejgList(RawMateSbejg rawMateSbejg);

    /**
     * 新增瞬变二极管
     * 
     * @param rawMateSbejg 瞬变二极管
     * @return 结果
     */
    public int insertRawMateSbejg(RawMateSbejg rawMateSbejg);

    /**
     * 修改瞬变二极管
     * 
     * @param rawMateSbejg 瞬变二极管
     * @return 结果
     */
    public int updateRawMateSbejg(RawMateSbejg rawMateSbejg);

    /**
     * 批量删除瞬变二极管
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRawMateSbejgByIds(String ids);

    /**
     * 删除瞬变二极管信息
     * 
     * @param sbejgId 瞬变二极管ID
     * @return 结果
     */
    public int deleteRawMateSbejgById(Long sbejgId);
}
