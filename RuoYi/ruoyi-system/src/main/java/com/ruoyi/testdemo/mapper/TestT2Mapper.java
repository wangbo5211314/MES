package com.ruoyi.testdemo.mapper;

import java.util.List;
import com.ruoyi.testdemo.domain.TestT2;

/**
 * 测试时间与人2Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-29
 */
public interface TestT2Mapper 
{
    /**
     * 查询测试时间与人2
     * 
     * @param id 测试时间与人2ID
     * @return 测试时间与人2
     */
    public TestT2 selectTestT2ById(Long id);

    /**
     * 查询测试时间与人2列表
     * 
     * @param testT2 测试时间与人2
     * @return 测试时间与人2集合
     */
    public List<TestT2> selectTestT2List(TestT2 testT2);

    /**
     * 新增测试时间与人2
     * 
     * @param testT2 测试时间与人2
     * @return 结果
     */
    public int insertTestT2(TestT2 testT2);

    /**
     * 修改测试时间与人2
     * 
     * @param testT2 测试时间与人2
     * @return 结果
     */
    public int updateTestT2(TestT2 testT2);

    /**
     * 删除测试时间与人2
     * 
     * @param id 测试时间与人2ID
     * @return 结果
     */
    public int deleteTestT2ById(Long id);

    /**
     * 批量删除测试时间与人2
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestT2ByIds(String[] ids);
}
