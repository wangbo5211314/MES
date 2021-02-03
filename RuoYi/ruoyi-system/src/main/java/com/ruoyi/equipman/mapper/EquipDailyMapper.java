package com.ruoyi.equipman.mapper;

import java.util.List;
import com.ruoyi.equipman.domain.EquipDaily;

/**
 * 设备日常维护Mapper接口
 * 
 * @author 王博
 * @date 2021-01-28
 */
public interface EquipDailyMapper 
{
    /**
     * 查询设备日常维护
     * 
     * @param sbrcwhbId 设备日常维护ID
     * @return 设备日常维护
     */
    public EquipDaily selectEquipDailyById(Long sbrcwhbId);

    /**
     * 查询设备日常维护列表
     * 
     * @param equipDaily 设备日常维护
     * @return 设备日常维护集合
     */
    public List<EquipDaily> selectEquipDailyList(EquipDaily equipDaily);

    /**
     * 新增设备日常维护
     * 
     * @param equipDaily 设备日常维护
     * @return 结果
     */
    public int insertEquipDaily(EquipDaily equipDaily);

    /**
     * 修改设备日常维护
     * 
     * @param equipDaily 设备日常维护
     * @return 结果
     */
    public int updateEquipDaily(EquipDaily equipDaily);

    /**
     * 删除设备日常维护
     * 
     * @param sbrcwhbId 设备日常维护ID
     * @return 结果
     */
    public int deleteEquipDailyById(Long sbrcwhbId);

    /**
     * 批量删除设备日常维护
     * 
     * @param sbrcwhbIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteEquipDailyByIds(String[] sbrcwhbIds);
}
