package com.ruoyi.equipman.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.equipman.mapper.EquipDailyMapper;
import com.ruoyi.equipman.domain.EquipDaily;
import com.ruoyi.equipman.service.IEquipDailyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备日常维护Service业务层处理
 * 
 * @author 王博
 * @date 2021-01-28
 */
@Service("equipdaily")
public class EquipDailyServiceImpl implements IEquipDailyService 
{
    @Autowired
    private EquipDailyMapper equipDailyMapper;

    /**
     * 查询设备日常维护
     * 
     * @param sbrcwhbId 设备日常维护ID
     * @return 设备日常维护
     */
    @Override
    public EquipDaily selectEquipDailyById(Long sbrcwhbId)
    {
        return equipDailyMapper.selectEquipDailyById(sbrcwhbId);
    }

    /**
     * 查询设备日常维护列表
     * 
     * @param equipDaily 设备日常维护
     * @return 设备日常维护
     */
    @Override
    public List<EquipDaily> selectEquipDailyList(EquipDaily equipDaily)
    {
        return equipDailyMapper.selectEquipDailyList(equipDaily);
    }

    /**
     * 新增设备日常维护
     * 
     * @param equipDaily 设备日常维护
     * @return 结果
     */
    @Override
    public int insertEquipDaily(EquipDaily equipDaily)
    {
        equipDaily.setCreateTime(DateUtils.getNowDate());
        return equipDailyMapper.insertEquipDaily(equipDaily);
    }

    /**
     * 修改设备日常维护
     * 
     * @param equipDaily 设备日常维护
     * @return 结果
     */
    @Override
    public int updateEquipDaily(EquipDaily equipDaily)
    {
        equipDaily.setUpdateTime(DateUtils.getNowDate());
        return equipDailyMapper.updateEquipDaily(equipDaily);
    }

    /**
     * 删除设备日常维护对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteEquipDailyByIds(String ids)
    {
        return equipDailyMapper.deleteEquipDailyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备日常维护信息
     * 
     * @param sbrcwhbId 设备日常维护ID
     * @return 结果
     */
    @Override
    public int deleteEquipDailyById(Long sbrcwhbId)
    {
        return equipDailyMapper.deleteEquipDailyById(sbrcwhbId);
    }
}
