package com.ruoyi.tecsche.service.impl;

import java.util.List;

import com.ruoyi.order.domain.SalesOrder;
import com.ruoyi.order.mapper.SalesOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.tecsche.mapper.TecScheBomMapper;
import com.ruoyi.tecsche.domain.TecScheBom;
import com.ruoyi.tecsche.service.ITecScheBomService;
import com.ruoyi.common.core.text.Convert;

/**
 * BOM清单Service业务层处理
 * 
 * @author 王博
 * @date 2021-01-12
 */
@Service("BOMList")
public class TecScheBomServiceImpl implements ITecScheBomService 
{
    @Autowired
    private TecScheBomMapper tecScheBomMapper;
    @Autowired
    private SalesOrderMapper salesOrderMapper;


    /**
     * 查询BOM清单
     * 
     * @param bomId BOM清单ID
     * @return BOM清单
     */
    @Override
    public TecScheBom selectTecScheBomById(Long bomId)
    {
        return tecScheBomMapper.selectTecScheBomById(bomId);
    }

    /**
     * 查询BOM清单列表
     * 
     * @param tecScheBom BOM清单
     * @return BOM清单
     */
    @Override
    public List<TecScheBom> selectTecScheBomList(TecScheBom tecScheBom, SalesOrder salesOrder)
    {
        /*关联销售订单的数据，查询到销售订单名称yl后写入bom对应的字段里*/
        List<TecScheBom> TSBlist = tecScheBomMapper.selectTecScheBomList(tecScheBom);
        List<SalesOrder> SOlist = salesOrderMapper.selectSalesOrderList(salesOrder);
        /*System.out.println("TSBlist列表："+TSBlist);
        System.out.println("SOlist列表："+SOlist);*/
        for (TecScheBom tsb:TSBlist
        ) {
            //System.out.println("tsb的值"+tsb.getSaleOrderNum());
            for (SalesOrder sod:SOlist
            ) {
                //System.out.println("sod的值"+sod.getSaleOrderNum());
                if((tsb.getSaleOrderNum()).equals(sod.getSaleOrderNum())){
                    /*if((sod.getYl()!=null)||(sod.getYl()!="")) {*/
                        //如果销售订单名称不为空，则进行复制。
                        tsb.setSaleOrderName(sod.getYl());
                        //修改数据库中的值
                        tecScheBomMapper.updateTecScheBom(tsb);
                        System.out.println("销售订单的销售订单名称：" + sod.getYl());
                        System.out.println("销售订单名称数据复制成功");
                    /*}*//*else{
                        tsb.setSaleOrderName("kong");
                        //修改数据库中的值
                        tecScheBomMapper.updateTecScheBom(tsb);
                    }*/
                }/*else{

                  *//*  tsb.setSaleOrderName("");
                    //修改数据库中的值
                    tecScheBomMapper.updateTecScheBom(tsb);*//*
                }*/

            }
        }
        /*return tecScheBomMapper.selectTecScheBomList(tecScheBom);*/
        return TSBlist;
    }

    /**
     * 新增BOM清单
     * 
     * @param tecScheBom BOM清单
     * @return 结果
     */
    @Override
    public int insertTecScheBom(TecScheBom tecScheBom)
    {
        return tecScheBomMapper.insertTecScheBom(tecScheBom);
    }

    /**
     * 修改BOM清单
     * 
     * @param tecScheBom BOM清单
     * @return 结果
     */
    @Override
    public int updateTecScheBom(TecScheBom tecScheBom)
    {
        return tecScheBomMapper.updateTecScheBom(tecScheBom);
    }

    /**
     * 删除BOM清单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTecScheBomByIds(String ids)
    {
        return tecScheBomMapper.deleteTecScheBomByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除BOM清单信息
     * 
     * @param bomId BOM清单ID
     * @return 结果
     */
    @Override
    public int deleteTecScheBomById(Long bomId)
    {
        return tecScheBomMapper.deleteTecScheBomById(bomId);
    }
}
