package com.ruoyi.rawmate.service;

import com.ruoyi.rawmate.domain.RawMateBattery;

import java.util.List;


/**
 * 电池Service接口
 * 
 * @author wangbo
 * @date 2020-12-11
 */
public interface IRawMateBatteryService 
{
    /**
     * 查询电池
     * 
     * @param batteryId 电池ID
     * @return 电池
     */
    public RawMateBattery selectRawMateBatteryById(Long batteryId);

    /**
     * 查询电池列表
     * 
     * @param rawMateBattery 电池
     * @return 电池集合
     */
    public List<RawMateBattery> selectRawMateBatteryList(RawMateBattery rawMateBattery);

    /**
     * 新增电池
     * 
     * @param rawMateBattery 电池
     * @return 结果
     */
    public int insertRawMateBattery(RawMateBattery rawMateBattery);

    /**
     * 修改电池
     * 
     * @param rawMateBattery 电池
     * @return 结果
     */
    public int updateRawMateBattery(RawMateBattery rawMateBattery);

    /**
     * 批量删除电池
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRawMateBatteryByIds(String ids);

    /**
     * 删除电池信息
     * 
     * @param batteryId 电池ID
     * @return 结果
     */
    public int deleteRawMateBatteryById(Long batteryId);
}
