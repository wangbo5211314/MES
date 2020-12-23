package com.ruoyi.process.service;

import java.util.List;
import com.ruoyi.process.domain.PrcsRouGL;

/**
 * 工艺路线管理Service接口
 * 
 * @author wangbo
 * @date 2020-12-23
 */
public interface IPrcsRouGLService 
{
    /**
     * 查询工艺路线管理
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 工艺路线管理
     */
    public PrcsRouGL selectPrcsRouGLById(Long spFlowId);

    /**
     * 查询工艺路线管理列表
     * 
     * @param prcsRouGL 工艺路线管理
     * @return 工艺路线管理集合
     */
    public List<PrcsRouGL> selectPrcsRouGLList(PrcsRouGL prcsRouGL);

    /**
     * 新增工艺路线管理
     * 
     * @param prcsRouGL 工艺路线管理
     * @return 结果
     */
    public int insertPrcsRouGL(PrcsRouGL prcsRouGL);

    /**
     * 修改工艺路线管理
     * 
     * @param prcsRouGL 工艺路线管理
     * @return 结果
     */
    public int updatePrcsRouGL(PrcsRouGL prcsRouGL);

    /**
     * 批量删除工艺路线管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePrcsRouGLByIds(String ids);

    /**
     * 删除工艺路线管理信息
     * 
     * @param spFlowId 工艺路线管理ID
     * @return 结果
     */
    public int deletePrcsRouGLById(Long spFlowId);
}
