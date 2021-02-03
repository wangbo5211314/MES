package com.ruoyi.testdemo.service;

import java.util.List;
import com.ruoyi.testdemo.domain.TestT1;

/**
 * 测试时间与人Service接口
 * 
 * @author wangbo
 * @date 2020-12-29
 */
public interface ITestT1Service 
{
    /**
     * 查询测试时间与人
     * 
     * @param ID 测试时间与人ID
     * @return 测试时间与人
     */
    public TestT1 selectTestT1ById(Long ID);

    /**
     * 查询测试时间与人列表
     * 
     * @param testT1 测试时间与人
     * @return 测试时间与人集合
     */
    public List<TestT1> selectTestT1List(TestT1 testT1);

    /**
     * 新增测试时间与人
     * 
     * @param testT1 测试时间与人
     * @return 结果
     */
    public int insertTestT1(TestT1 testT1);

    /**
     * 修改测试时间与人
     * 
     * @param testT1 测试时间与人
     * @return 结果
     */
    public int updateTestT1(TestT1 testT1);

    /**
     * 批量删除测试时间与人
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestT1ByIds(String ids);

    /**
     * 删除测试时间与人信息
     * 
     * @param ID 测试时间与人ID
     * @return 结果
     */
    public int deleteTestT1ById(Long ID);
}
