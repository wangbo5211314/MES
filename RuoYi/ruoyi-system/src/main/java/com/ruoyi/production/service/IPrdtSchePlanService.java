package com.ruoyi.production.service;

import com.ruoyi.production.domain.PrdtSchePlan;

import java.util.List;


/**
 * 排产计划Service接口
 * 
 * @author wangbo
 * @date 2020-12-09
 */
public interface IPrdtSchePlanService 
{
    /**
     * 查询排产计划
     * 
     * @param schPlanId 排产计划ID
     * @return 排产计划
     */
    public PrdtSchePlan selectPrdtSchePlanById(Long schPlanId);

    /**
     * 查询排产计划列表
     * 
     * @param prdtSchePlan 排产计划
     * @return 排产计划集合
     */
    public List<PrdtSchePlan> selectPrdtSchePlanList(PrdtSchePlan prdtSchePlan);

    /**
     * 新增排产计划
     * 
     * @param prdtSchePlan 排产计划
     * @return 结果
     */
    public int insertPrdtSchePlan(PrdtSchePlan prdtSchePlan);

    /**
     * 修改排产计划
     * 
     * @param prdtSchePlan 排产计划
     * @return 结果
     */
    public int updatePrdtSchePlan(PrdtSchePlan prdtSchePlan);

    /**
     * 批量删除排产计划
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePrdtSchePlanByIds(String ids);

    /**
     * 删除排产计划信息
     * 
     * @param schPlanId 排产计划ID
     * @return 结果
     */
    public int deletePrdtSchePlanById(Long schPlanId);
}
