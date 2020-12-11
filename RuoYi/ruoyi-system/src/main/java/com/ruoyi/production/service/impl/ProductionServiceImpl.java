package com.ruoyi.production.service.impl;

import java.util.List;

import com.ruoyi.production.domain.Production;
import com.ruoyi.production.mapper.ProductionMapper;
import com.ruoyi.production.service.IProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 报工信息Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-10
 */
@Service
public class ProductionServiceImpl implements IProductionService
{
    @Autowired
    private ProductionMapper productionMapper;

    /**
     * 查询报工信息
     * 
     * @param repoInfoId 报工信息ID
     * @return 报工信息
     */
    @Override
    public Production selectProductionById(Long repoInfoId)
    {
        return productionMapper.selectProductionById(repoInfoId);
    }

    /**
     * 查询报工信息列表
     * 
     * @param production 报工信息
     * @return 报工信息
     */
    @Override
    public List<Production> selectProductionList(Production production)
    {
        return productionMapper.selectProductionList(production);
    }

    /**
     * 新增报工信息
     * 
     * @param production 报工信息
     * @return 结果
     */
    @Override
    public int insertProduction(Production production)
    {
        return productionMapper.insertProduction(production);
    }

    /**
     * 修改报工信息
     * 
     * @param production 报工信息
     * @return 结果
     */
    @Override
    public int updateProduction(Production production)
    {
        return productionMapper.updateProduction(production);
    }

    /**
     * 删除报工信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteProductionByIds(String ids)
    {
        return productionMapper.deleteProductionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除报工信息信息
     * 
     * @param repoInfoId 报工信息ID
     * @return 结果
     */
    @Override
    public int deleteProductionById(Long repoInfoId)
    {
        return productionMapper.deleteProductionById(repoInfoId);
    }
}
