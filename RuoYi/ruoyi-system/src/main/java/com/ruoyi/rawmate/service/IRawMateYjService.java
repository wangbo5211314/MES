package com.ruoyi.rawmate.service;

import com.ruoyi.rawmate.domain.RawMateYj;

import java.util.List;


/**
 * 液晶Service接口
 * 
 * @author wangbo
 * @date 2020-12-11
 */
public interface IRawMateYjService 
{
    /**
     * 查询液晶
     * 
     * @param yjId 液晶ID
     * @return 液晶
     */
    public RawMateYj selectRawMateYjById(Long yjId);

    /**
     * 查询液晶列表
     * 
     * @param rawMateYj 液晶
     * @return 液晶集合
     */
    public List<RawMateYj> selectRawMateYjList(RawMateYj rawMateYj);

    /**
     * 新增液晶
     * 
     * @param rawMateYj 液晶
     * @return 结果
     */
    public int insertRawMateYj(RawMateYj rawMateYj);

    /**
     * 修改液晶
     * 
     * @param rawMateYj 液晶
     * @return 结果
     */
    public int updateRawMateYj(RawMateYj rawMateYj);

    /**
     * 批量删除液晶
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRawMateYjByIds(String ids);

    /**
     * 删除液晶信息
     * 
     * @param yjId 液晶ID
     * @return 结果
     */
    public int deleteRawMateYjById(Long yjId);
}
