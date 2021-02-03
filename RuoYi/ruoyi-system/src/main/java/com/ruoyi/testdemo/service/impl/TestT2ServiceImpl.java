package com.ruoyi.testdemo.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.testdemo.mapper.TestT2Mapper;
import com.ruoyi.testdemo.domain.TestT2;
import com.ruoyi.testdemo.service.ITestT2Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 测试时间与人2Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-29
 */
@Service
public class TestT2ServiceImpl implements ITestT2Service 
{
    @Autowired
    private TestT2Mapper testT2Mapper;

    /**
     * 查询测试时间与人2
     * 
     * @param id 测试时间与人2ID
     * @return 测试时间与人2
     */
    @Override
    public TestT2 selectTestT2ById(Long id)
    {
        return testT2Mapper.selectTestT2ById(id);
    }

    /**
     * 查询测试时间与人2列表
     * 
     * @param testT2 测试时间与人2
     * @return 测试时间与人2
     */
    @Override
    public List<TestT2> selectTestT2List(TestT2 testT2)
    {
        return testT2Mapper.selectTestT2List(testT2);
    }

    /**
     * 新增测试时间与人2
     * 
     * @param testT2 测试时间与人2
     * @return 结果
     */
    @Override
    public int insertTestT2(TestT2 testT2)
    {
        testT2.setCreateTime(DateUtils.getNowDate());
        return testT2Mapper.insertTestT2(testT2);
    }

    /**
     * 修改测试时间与人2
     * 
     * @param testT2 测试时间与人2
     * @return 结果
     */
    @Override
    public int updateTestT2(TestT2 testT2)
    {
        testT2.setUpdateTime(DateUtils.getNowDate());
        return testT2Mapper.updateTestT2(testT2);
    }

    /**
     * 删除测试时间与人2对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTestT2ByIds(String ids)
    {
        return testT2Mapper.deleteTestT2ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除测试时间与人2信息
     * 
     * @param id 测试时间与人2ID
     * @return 结果
     */
    @Override
    public int deleteTestT2ById(Long id)
    {
        return testT2Mapper.deleteTestT2ById(id);
    }
}
