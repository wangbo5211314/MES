package com.ruoyi.company.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.company.mapper.CompanyManageMapper;
import com.ruoyi.company.domain.CompanyManage;
import com.ruoyi.company.service.ICompanyManageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 公司管理Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-14
 */
@Service
public class CompanyManageServiceImpl implements ICompanyManageService 
{
    @Autowired
    private CompanyManageMapper companyManageMapper;

    /**
     * 查询公司管理
     * 
     * @param compId 公司管理ID
     * @return 公司管理
     */
    @Override
    public CompanyManage selectCompanyManageById(Long compId)
    {
        return companyManageMapper.selectCompanyManageById(compId);
    }

    /**
     * 查询公司管理列表
     * 
     * @param companyManage 公司管理
     * @return 公司管理
     */
    @Override
    public List<CompanyManage> selectCompanyManageList(CompanyManage companyManage)
    {
        return companyManageMapper.selectCompanyManageList(companyManage);
    }

    /**
     * 新增公司管理
     * 
     * @param companyManage 公司管理
     * @return 结果
     */
    @Override
    public int insertCompanyManage(CompanyManage companyManage)
    {
        return companyManageMapper.insertCompanyManage(companyManage);
    }

    /**
     * 修改公司管理
     * 
     * @param companyManage 公司管理
     * @return 结果
     */
    @Override
    public int updateCompanyManage(CompanyManage companyManage)
    {
        return companyManageMapper.updateCompanyManage(companyManage);
    }

    /**
     * 删除公司管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCompanyManageByIds(String ids)
    {
        return companyManageMapper.deleteCompanyManageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除公司管理信息
     * 
     * @param compId 公司管理ID
     * @return 结果
     */
    @Override
    public int deleteCompanyManageById(Long compId)
    {
        return companyManageMapper.deleteCompanyManageById(compId);
    }
}
