package com.ruoyi.production.service;

import com.ruoyi.production.domain.Production;

import java.util.List;


/**
 * 报工信息Service接口
 * 
 * @author wangbo
 * @date 2020-12-10
 */
public interface IProductionService 
{
    /**
     * 查询报工信息
     * 
     * @param repoInfoId 报工信息ID
     * @return 报工信息
     */
    public Production selectProductionById(Long repoInfoId);

    /**
     * 查询报工信息列表
     * 
     * @param production 报工信息
     * @return 报工信息集合
     */
    public List<Production> selectProductionList(Production production);

    /**
     * 新增报工信息
     * 
     * @param production 报工信息
     * @return 结果
     */
    public int insertProduction(Production production);

    /**
     * 修改报工信息
     * 
     * @param production 报工信息
     * @return 结果
     */
    public int updateProduction(Production production);

    /**
     * 批量删除报工信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteProductionByIds(String ids);

    /**
     * 删除报工信息信息
     * 
     * @param repoInfoId 报工信息ID
     * @return 结果
     */
    public int deleteProductionById(Long repoInfoId);
}
