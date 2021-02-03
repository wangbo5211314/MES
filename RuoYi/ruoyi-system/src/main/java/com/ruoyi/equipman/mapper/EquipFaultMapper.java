package com.ruoyi.equipman.mapper;

import java.util.List;
import com.ruoyi.equipman.domain.EquipFault;

/**
 * 设备故障管理Mapper接口
 * 
 * @author 王博
 * @date 2021-01-28
 */
public interface EquipFaultMapper 
{
    /**
     * 查询设备故障管理
     * 
     * @param sbgzbId 设备故障管理ID
     * @return 设备故障管理
     */
    public EquipFault selectEquipFaultById(Long sbgzbId);

    /**
     * 查询设备故障管理列表
     * 
     * @param equipFault 设备故障管理
     * @return 设备故障管理集合
     */
    public List<EquipFault> selectEquipFaultList(EquipFault equipFault);

    /**
     * 新增设备故障管理
     * 
     * @param equipFault 设备故障管理
     * @return 结果
     */
    public int insertEquipFault(EquipFault equipFault);

    /**
     * 修改设备故障管理
     * 
     * @param equipFault 设备故障管理
     * @return 结果
     */
    public int updateEquipFault(EquipFault equipFault);

    /**
     * 删除设备故障管理
     * 
     * @param sbgzbId 设备故障管理ID
     * @return 结果
     */
    public int deleteEquipFaultById(Long sbgzbId);

    /**
     * 批量删除设备故障管理
     * 
     * @param sbgzbIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteEquipFaultByIds(String[] sbgzbIds);
}
