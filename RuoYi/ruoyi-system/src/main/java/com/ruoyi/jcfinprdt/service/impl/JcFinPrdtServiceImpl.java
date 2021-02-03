package com.ruoyi.jcfinprdt.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.jcfinprdt.mapper.JcFinPrdtMapper;
import com.ruoyi.jcfinprdt.domain.JcFinPrdt;
import com.ruoyi.jcfinprdt.service.IJcFinPrdtService;
import com.ruoyi.common.core.text.Convert;

/**
 * 成品检测Service业务层处理
 * 
 * @author 王博
 * @date 2021-01-28
 */
@Service
public class JcFinPrdtServiceImpl implements IJcFinPrdtService 
{
    @Autowired
    private JcFinPrdtMapper jcFinPrdtMapper;

    /**
     * 查询成品检测
     * 
     * @param cpjcbId 成品检测ID
     * @return 成品检测
     */
    @Override
    public JcFinPrdt selectJcFinPrdtById(Long cpjcbId)
    {
        return jcFinPrdtMapper.selectJcFinPrdtById(cpjcbId);
    }

    /**
     * 查询成品检测列表
     * 
     * @param jcFinPrdt 成品检测
     * @return 成品检测
     */
    @Override
    public List<JcFinPrdt> selectJcFinPrdtList(JcFinPrdt jcFinPrdt)
    {
        return jcFinPrdtMapper.selectJcFinPrdtList(jcFinPrdt);
    }

    /**
     * 新增成品检测
     * 
     * @param jcFinPrdt 成品检测
     * @return 结果
     */
    @Override
    public int insertJcFinPrdt(JcFinPrdt jcFinPrdt)
    {
        jcFinPrdt.setCreateTime(DateUtils.getNowDate());
        return jcFinPrdtMapper.insertJcFinPrdt(jcFinPrdt);
    }

    /**
     * 修改成品检测
     * 
     * @param jcFinPrdt 成品检测
     * @return 结果
     */
    @Override
    public int updateJcFinPrdt(JcFinPrdt jcFinPrdt)
    {
        jcFinPrdt.setUpdateTime(DateUtils.getNowDate());
        return jcFinPrdtMapper.updateJcFinPrdt(jcFinPrdt);
    }

    /**
     * 删除成品检测对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteJcFinPrdtByIds(String ids)
    {
        return jcFinPrdtMapper.deleteJcFinPrdtByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除成品检测信息
     * 
     * @param cpjcbId 成品检测ID
     * @return 结果
     */
    @Override
    public int deleteJcFinPrdtById(Long cpjcbId)
    {
        return jcFinPrdtMapper.deleteJcFinPrdtById(cpjcbId);
    }
}
