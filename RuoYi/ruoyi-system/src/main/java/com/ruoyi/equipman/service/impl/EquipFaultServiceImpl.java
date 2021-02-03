package com.ruoyi.equipman.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.equipman.mapper.EquipFaultMapper;
import com.ruoyi.equipman.domain.EquipFault;
import com.ruoyi.equipman.service.IEquipFaultService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备故障管理Service业务层处理
 * 
 * @author 王博
 * @date 2021-01-28
 */
@Service
public class EquipFaultServiceImpl implements IEquipFaultService 
{
    @Autowired
    private EquipFaultMapper equipFaultMapper;

    /**
     * 查询设备故障管理
     * 
     * @param sbgzbId 设备故障管理ID
     * @return 设备故障管理
     */
    @Override
    public EquipFault selectEquipFaultById(Long sbgzbId)
    {
        return equipFaultMapper.selectEquipFaultById(sbgzbId);
    }

    /**
     * 查询设备故障管理列表
     * 
     * @param equipFault 设备故障管理
     * @return 设备故障管理
     */
    @Override
    public List<EquipFault> selectEquipFaultList(EquipFault equipFault)
    {
        return equipFaultMapper.selectEquipFaultList(equipFault);
    }

    /**
     * 新增设备故障管理
     * 
     * @param equipFault 设备故障管理
     * @return 结果
     */
    @Override
    public int insertEquipFault(EquipFault equipFault)
    {
        equipFault.setCreateTime(DateUtils.getNowDate());
        return equipFaultMapper.insertEquipFault(equipFault);
    }

    /**
     * 修改设备故障管理
     * 
     * @param equipFault 设备故障管理
     * @return 结果
     */
    @Override
    public int updateEquipFault(EquipFault equipFault)
    {
        equipFault.setUpdateTime(DateUtils.getNowDate());
        return equipFaultMapper.updateEquipFault(equipFault);
    }

    /**
     * 删除设备故障管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEquipFaultByIds(String ids)
    {
        return equipFaultMapper.deleteEquipFaultByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备故障管理信息
     * 
     * @param sbgzbId 设备故障管理ID
     * @return 结果
     */
    @Override
    public int deleteEquipFaultById(Long sbgzbId)
    {
        return equipFaultMapper.deleteEquipFaultById(sbgzbId);
    }
}
