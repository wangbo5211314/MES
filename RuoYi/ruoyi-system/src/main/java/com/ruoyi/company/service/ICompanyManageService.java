package com.ruoyi.company.service;

import java.util.List;
import com.ruoyi.company.domain.CompanyManage;

/**
 * 公司管理Service接口
 * 
 * @author wangbo
 * @date 2020-12-14
 */
public interface ICompanyManageService 
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
     * 批量删除公司管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCompanyManageByIds(String ids);

    /**
     * 删除公司管理信息
     * 
     * @param compId 公司管理ID
     * @return 结果
     */
    public int deleteCompanyManageById(Long compId);
}
