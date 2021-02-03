package com.ruoyi.testdemo.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.testdemo.mapper.TestT1Mapper;
import com.ruoyi.testdemo.domain.TestT1;
import com.ruoyi.testdemo.service.ITestT1Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 测试时间与人Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-29
 */
@Service
public class TestT1ServiceImpl implements ITestT1Service 
{
    @Autowired
    private TestT1Mapper testT1Mapper;

    /**
     * 查询测试时间与人
     * 
     * @param ID 测试时间与人ID
     * @return 测试时间与人
     */
    @Override
    public TestT1 selectTestT1ById(Long ID)
    {
        return testT1Mapper.selectTestT1ById(ID);
    }

    /**
     * 查询测试时间与人列表
     * 
     * @param testT1 测试时间与人
     * @return 测试时间与人
     */
    @Override
    public List<TestT1> selectTestT1List(TestT1 testT1)
    {
        return testT1Mapper.selectTestT1List(testT1);
    }

    /**
     * 新增测试时间与人
     * 
     * @param testT1 测试时间与人
     * @return 结果
     */
    @Override
    public int insertTestT1(TestT1 testT1)
    {
        testT1.setCreateTime(DateUtils.getNowDate());
        return testT1Mapper.insertTestT1(testT1);
    }

    /**
     * 修改测试时间与人
     * 
     * @param testT1 测试时间与人
     * @return 结果
     */
    @Override
    public int updateTestT1(TestT1 testT1)
    {
        testT1.setUpdateTime(DateUtils.getNowDate());
        return testT1Mapper.updateTestT1(testT1);
    }

    /**
     * 删除测试时间与人对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTestT1ByIds(String ids)
    {
        return testT1Mapper.deleteTestT1ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除测试时间与人信息
     * 
     * @param ID 测试时间与人ID
     * @return 结果
     */
    @Override
    public int deleteTestT1ById(Long ID)
    {
        return testT1Mapper.deleteTestT1ById(ID);
    }
}
