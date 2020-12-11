package com.ruoyi.rawmate.mapper;

import com.ruoyi.rawmate.domain.RawMateBattery;

import java.util.List;

/**
 * 电池Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-11
 */
public interface RawMateBatteryMapper 
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
     * 删除电池
     * 
     * @param batteryId 电池ID
     * @return 结果
     */
    public int deleteRawMateBatteryById(Long batteryId);

    /**
     * 批量删除电池
     * 
     * @param batteryIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteRawMateBatteryByIds(String[] batteryIds);
}
