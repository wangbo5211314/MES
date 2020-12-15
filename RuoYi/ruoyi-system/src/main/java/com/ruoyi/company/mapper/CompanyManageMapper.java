package com.ruoyi.company.mapper;

import java.util.List;
import com.ruoyi.company.domain.CompanyManage;

/**
 * 公司管理Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-14
 */
public interface CompanyManageMapper 
{
    /**
     * 查询公司管理
     * 
     * @param compId 公司管理ID
     * @return 公司管理
     */
    public CompanyManage selectCompanyManageById(Long compId);

    /**
     * 查询公司管理列表
     * 
     * @param companyManage 公司管理
     * @return 公司管理集合
     */
    public List<CompanyManage> selectCompanyManageList(CompanyManage companyManage);

    /**
     * 新增公司管理
     * 
     * @param companyManage 公司管理
     * @return 结果
     */
    public int insertCompanyManage(CompanyManage companyManage);

    /**
     * 修改公司管理
     * 
     * @param companyManage 公司管理
     * @return 结果
     */
    public int updateCompanyManage(CompanyManage companyManage);

    /**
     * 删除公司管理
     * 
     * @param compId 公司管理ID
     * @return 结果
     */
    public int deleteCompanyManageById(Long compId);

    /**
     * 批量删除公司管理
     * 
     * @param compIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCompanyManageByIds(String[] compIds);
}
