package com.ruoyi.order.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.order.domain.GwOrdersReturn;
import com.ruoyi.order.mapper.GwOrdersReturnMapper;
import com.ruoyi.order.service.IGwOrdersReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.core.text.Convert;

/**
 * 国网采购订单-返回Service业务层处理
 * 
 * @author wangbo
 * @date 2020-12-08
 */
@Service
public class GwOrdersReturnServiceImpl implements IGwOrdersReturnService
{
    @Autowired
    private GwOrdersReturnMapper gwOrdersReturnMapper;

    /**
     * 查询国网采购订单-返回
     * 
     * @param nnReturnId 国网采购订单-返回ID
     * @return 国网采购订单-返回
     */
    @Override
    public GwOrdersReturn selectGwOrdersReturnById(Long nnReturnId)
    {
        return gwOrdersReturnMapper.selectGwOrdersReturnById(nnReturnId);
    }

    /**
     * 查询国网采购订单-返回列表
     * 
     * @param gwOrdersReturn 国网采购订单-返回
     * @return 国网采购订单-返回
     */
    @Override
    public List<GwOrdersReturn> selectGwOrdersReturnList(GwOrdersReturn gwOrdersReturn)
    {
        return gwOrdersReturnMapper.selectGwOrdersReturnList(gwOrdersReturn);
    }

    /**
     * 新增国网采购订单-返回
     * 
     * @param gwOrdersReturn 国网采购订单-返回
     * @return 结果
     */
    @Override
    public int insertGwOrdersReturn(GwOrdersReturn gwOrdersReturn)
    {
        return gwOrdersReturnMapper.insertGwOrdersReturn(gwOrdersReturn);
    }

    /**
     * 修改国网采购订单-返回
     * 
     * @param gwOrdersReturn 国网采购订单-返回
     * @return 结果
     */
    @Override
    public int updateGwOrdersReturn(GwOrdersReturn gwOrdersReturn)
    {
        gwOrdersReturn.setUpdateTime(DateUtils.getNowDate());
        return gwOrdersReturnMapper.updateGwOrdersReturn(gwOrdersReturn);
    }

    /**
     * 删除国网采购订单-返回对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGwOrdersReturnByIds(String ids)
    {
        return gwOrdersReturnMapper.deleteGwOrdersReturnByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除国网采购订单-返回信息
     * 
     * @param nnReturnId 国网采购订单-返回ID
     * @return 结果
     */
    @Override
    public int deleteGwOrdersReturnById(Long nnReturnId)
    {
        return gwOrdersReturnMapper.deleteGwOrdersReturnById(nnReturnId);
    }
}
