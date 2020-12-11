package com.ruoyi.rawmate.service.impl;

import java.util.List;

import com.ruoyi.rawmate.domain.RawMateBattery;
import com.ruoyi.rawmate.mapper.RawMateBatteryMapper;
import com.ruoyi.rawmate.service.IRawMateBatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 电池Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-11
 */
@Service
public class RawMateBatteryServiceImpl implements IRawMateBatteryService
{
    @Autowired
    private RawMateBatteryMapper rawMateBatteryMapper;

    /**
     * 查询电池
     * 
     * @param batteryId 电池ID
     * @return 电池
     */
    @Override
    public RawMateBattery selectRawMateBatteryById(Long batteryId)
    {
        return rawMateBatteryMapper.selectRawMateBatteryById(batteryId);
    }

    /**
     * 查询电池列表
     * 
     * @param rawMateBattery 电池
     * @return 电池
     */
    @Override
    public List<RawMateBattery> selectRawMateBatteryList(RawMateBattery rawMateBattery)
    {
        return rawMateBatteryMapper.selectRawMateBatteryList(rawMateBattery);
    }

    /**
     * 新增电池
     * 
     * @param rawMateBattery 电池
     * @return 结果
     */
    @Override
    public int insertRawMateBattery(RawMateBattery rawMateBattery)
    {
        return rawMateBatteryMapper.insertRawMateBattery(rawMateBattery);
    }

    /**
     * 修改电池
     * 
     * @param rawMateBattery 电池
     * @return 结果
     */
    @Override
    public int updateRawMateBattery(RawMateBattery rawMateBattery)
    {
        return rawMateBatteryMapper.updateRawMateBattery(rawMateBattery);
    }

    /**
     * 删除电池对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRawMateBatteryByIds(String ids)
    {
        return rawMateBatteryMapper.deleteRawMateBatteryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除电池信息
     * 
     * @param batteryId 电池ID
     * @return 结果
     */
    @Override
    public int deleteRawMateBatteryById(Long batteryId)
    {
        return rawMateBatteryMapper.deleteRawMateBatteryById(batteryId);
    }
}
