package com.ruoyi.rawmate.service;

import com.ruoyi.rawmate.domain.RawMateYmdz;

import java.util.List;


/**
 * 压敏电阻Service接口
 * 
 * @author wangbo
 * @date 2020-12-11
 */
public interface IRawMateYmdzService 
{
    /**
     * 查询压敏电阻
     * 
     * @param varistorId 压敏电阻ID
     * @return 压敏电阻
     */
    public RawMateYmdz selectRawMateYmdzById(Long varistorId);

    /**
     * 查询压敏电阻列表
     * 
     * @param rawMateYmdz 压敏电阻
     * @return 压敏电阻集合
     */
    public List<RawMateYmdz> selectRawMateYmdzList(RawMateYmdz rawMateYmdz);

    /**
     * 新增压敏电阻
     * 
     * @param rawMateYmdz 压敏电阻
     * @return 结果
     */
    public int insertRawMateYmdz(RawMateYmdz rawMateYmdz);

    /**
     * 修改压敏电阻
     * 
     * @param rawMateYmdz 压敏电阻
     * @return 结果
     */
    public int updateRawMateYmdz(RawMateYmdz rawMateYmdz);

    /**
     * 批量删除压敏电阻
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRawMateYmdzByIds(String ids);

    /**
     * 删除压敏电阻信息
     * 
     * @param varistorId 压敏电阻ID
     * @return 结果
     */
    public int deleteRawMateYmdzById(Long varistorId);
}
