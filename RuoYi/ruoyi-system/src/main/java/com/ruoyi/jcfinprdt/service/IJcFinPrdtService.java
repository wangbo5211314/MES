package com.ruoyi.jcfinprdt.service;

import java.util.List;
import com.ruoyi.jcfinprdt.domain.JcFinPrdt;

/**
 * 成品检测Service接口
 * 
 * @author 王博
 * @date 2021-01-28
 */
public interface IJcFinPrdtService 
{
    /**
     * 查询成品检测
     * 
     * @param cpjcbId 成品检测ID
     * @return 成品检测
     */
    public JcFinPrdt selectJcFinPrdtById(Long cpjcbId);

    /**
     * 查询成品检测列表
     * 
     * @param jcFinPrdt 成品检测
     * @return 成品检测集合
     */
    public List<JcFinPrdt> selectJcFinPrdtList(JcFinPrdt jcFinPrdt);

    /**
     * 新增成品检测
     * 
     * @param jcFinPrdt 成品检测
     * @return 结果
     */
    public int insertJcFinPrdt(JcFinPrdt jcFinPrdt);

    /**
     * 修改成品检测
     * 
     * @param jcFinPrdt 成品检测
     * @return 结果
     */
    public int updateJcFinPrdt(JcFinPrdt jcFinPrdt);

    /**
     * 批量删除成品检测
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteJcFinPrdtByIds(String ids);

    /**
     * 删除成品检测信息
     * 
     * @param cpjcbId 成品检测ID
     * @return 结果
     */
    public int deleteJcFinPrdtById(Long cpjcbId);
}
