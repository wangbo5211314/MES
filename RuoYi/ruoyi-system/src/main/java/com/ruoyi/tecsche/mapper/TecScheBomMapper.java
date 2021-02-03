package com.ruoyi.tecsche.mapper;

import java.util.List;
import com.ruoyi.tecsche.domain.TecScheBom;

/**
 * BOM清单Mapper接口
 * 
 * @author 王博
 * @date 2021-01-12
 */
public interface TecScheBomMapper 
{
    /**
     * 查询BOM清单
     * 
     * @param bomId BOM清单ID
     * @return BOM清单
     */
    public TecScheBom selectTecScheBomById(Long bomId);

    /**
     * 查询BOM清单列表
     * 
     * @param tecScheBom BOM清单
     * @return BOM清单集合
     */
    public List<TecScheBom> selectTecScheBomList(TecScheBom tecScheBom);

    /**
     * 新增BOM清单
     * 
     * @param tecScheBom BOM清单
     * @return 结果
     */
    public int insertTecScheBom(TecScheBom tecScheBom);

    /**
     * 修改BOM清单
     * 
     * @param tecScheBom BOM清单
     * @return 结果
     */
    public int updateTecScheBom(TecScheBom tecScheBom);

    /**
     * 删除BOM清单
     * 
     * @param bomId BOM清单ID
     * @return 结果
     */
    public int deleteTecScheBomById(Long bomId);

    /**
     * 批量删除BOM清单
     * 
     * @param bomIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTecScheBomByIds(String[] bomIds);
}
