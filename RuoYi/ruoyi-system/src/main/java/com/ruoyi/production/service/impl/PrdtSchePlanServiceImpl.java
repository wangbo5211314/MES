package com.ruoyi.production.service.impl;

import java.util.List;

import com.ruoyi.production.domain.PrdtSchePlan;
import com.ruoyi.production.mapper.PrdtSchePlanMapper;
import com.ruoyi.production.service.IPrdtSchePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 排产计划Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-09
 */
@Service
public class PrdtSchePlanServiceImpl implements IPrdtSchePlanService
{
    @Autowired
    private PrdtSchePlanMapper prdtSchePlanMapper;

    /**
     * 查询排产计划
     * 
     * @param schPlanId 排产计划ID
     * @return 排产计划
     */
    @Override
    public PrdtSchePlan selectPrdtSchePlanById(Long schPlanId)
    {
        return prdtSchePlanMapper.selectPrdtSchePlanById(schPlanId);
    }

    /**
     * 查询排产计划列表
     * 
     * @param prdtSchePlan 排产计划
     * @return 排产计划
     */
    @Override
    public List<PrdtSchePlan> selectPrdtSchePlanList(PrdtSchePlan prdtSchePlan)
    {
        return prdtSchePlanMapper.selectPrdtSchePlanList(prdtSchePlan);
    }

    /**
     * 新增排产计划
     * 
     * @param prdtSchePlan 排产计划
     * @return 结果
     */
    @Override
    public int insertPrdtSchePlan(PrdtSchePlan prdtSchePlan)
    {
        return prdtSchePlanMapper.insertPrdtSchePlan(prdtSchePlan);
    }

    /**
     * 修改排产计划
     * 
     * @param prdtSchePlan 排产计划
     * @return 结果
     */
    @Override
    public int updatePrdtSchePlan(PrdtSchePlan prdtSchePlan)
    {
        return prdtSchePlanMapper.updatePrdtSchePlan(prdtSchePlan);
    }

    /**
     * 删除排产计划对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePrdtSchePlanByIds(String ids)
    {
        return prdtSchePlanMapper.deletePrdtSchePlanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除排产计划信息
     * 
     * @param schPlanId 排产计划ID
     * @return 结果
     */
    @Override
    public int deletePrdtSchePlanById(Long schPlanId)
    {
        return prdtSchePlanMapper.deletePrdtSchePlanById(schPlanId);
    }
}
