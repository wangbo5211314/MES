package com.ruoyi.process.mapper;

import java.util.List;
import com.ruoyi.process.domain.PrcsRouTest;

/**
 * 工艺路线管理测试Mapper接口
 * 
 * @author wangbo
 * @date 2020-12-23
 */
public interface PrcsRouTestMapper 
{
    /**
     * 查询工艺路线管理测试
     * 
     * @param spFlowId 工艺路线管理测试ID
     * @return 工艺路线管理测试
     */
    public PrcsRouTest selectPrcsRouTestById(Long spFlowId);

    /**
     * 查询工艺路线管理测试列表
     * 
     * @param prcsRouTest 工艺路线管理测试
     * @return 工艺路线管理测试集合
     */
    public List<PrcsRouTest> selectPrcsRouTestList(PrcsRouTest prcsRouTest);

    /**
     * 新增工艺路线管理测试
     * 
     * @param prcsRouTest 工艺路线管理测试
     * @return 结果
     */
    public int insertPrcsRouTest(PrcsRouTest prcsRouTest);

    /**
     * 修改工艺路线管理测试
     * 
     * @param prcsRouTest 工艺路线管理测试
     * @return 结果
     */
    public int updatePrcsRouTest(PrcsRouTest prcsRouTest);

    /**
     * 删除工艺路线管理测试
     * 
     * @param spFlowId 工艺路线管理测试ID
     * @return 结果
     */
    public int deletePrcsRouTestById(Long spFlowId);

    /**
     * 批量删除工艺路线管理测试
     * 
     * @param spFlowIds 需要删除的数据ID
     * @return 结果
     */
    public int deletePrcsRouTestByIds(String[] spFlowIds);
}
