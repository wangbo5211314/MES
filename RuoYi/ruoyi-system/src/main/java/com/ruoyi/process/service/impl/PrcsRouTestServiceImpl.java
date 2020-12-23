package com.ruoyi.process.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.process.mapper.PrcsRouTestMapper;
import com.ruoyi.process.domain.PrcsRouTest;
import com.ruoyi.process.service.IPrcsRouTestService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工艺路线管理测试Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-23
 */
@Service
public class PrcsRouTestServiceImpl implements IPrcsRouTestService 
{
    @Autowired
    private PrcsRouTestMapper prcsRouTestMapper;

    /**
     * 查询工艺路线管理测试
     * 
     * @param spFlowId 工艺路线管理测试ID
     * @return 工艺路线管理测试
     */
    @Override
    public PrcsRouTest selectPrcsRouTestById(Long spFlowId)
    {
        return prcsRouTestMapper.selectPrcsRouTestById(spFlowId);
    }

    /**
     * 查询工艺路线管理测试列表
     * 
     * @param prcsRouTest 工艺路线管理测试
     * @return 工艺路线管理测试
     */
    @Override
    public List<PrcsRouTest> selectPrcsRouTestList(PrcsRouTest prcsRouTest)
    {
        return prcsRouTestMapper.selectPrcsRouTestList(prcsRouTest);
    }

    /**
     * 新增工艺路线管理测试
     * 
     * @param prcsRouTest 工艺路线管理测试
     * @return 结果
     */
    @Override
    public int insertPrcsRouTest(PrcsRouTest prcsRouTest)
    {
        prcsRouTest.setCreateTime(DateUtils.getNowDate());
        return prcsRouTestMapper.insertPrcsRouTest(prcsRouTest);
    }

    /**
     * 修改工艺路线管理测试
     * 
     * @param prcsRouTest 工艺路线管理测试
     * @return 结果
     */
    @Override
    public int updatePrcsRouTest(PrcsRouTest prcsRouTest)
    {
        prcsRouTest.setUpdateTime(DateUtils.getNowDate());
        return prcsRouTestMapper.updatePrcsRouTest(prcsRouTest);
    }

    /**
     * 删除工艺路线管理测试对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePrcsRouTestByIds(String ids)
    {
        return prcsRouTestMapper.deletePrcsRouTestByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工艺路线管理测试信息
     * 
     * @param spFlowId 工艺路线管理测试ID
     * @return 结果
     */
    @Override
    public int deletePrcsRouTestById(Long spFlowId)
    {
        return prcsRouTestMapper.deletePrcsRouTestById(spFlowId);
    }
}
