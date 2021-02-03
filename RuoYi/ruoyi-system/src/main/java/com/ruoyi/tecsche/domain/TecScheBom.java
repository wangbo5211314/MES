package com.ruoyi.tecsche.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * BOM清单对象 tec_sche_bom
 * 
 * @author 王博
 * @date 2021-01-12
 */
public class TecScheBom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表id */
    @Excel(name = "表id")
    private Long bomId;

    /** 销售订单编号 */
    @Excel(name = "销售订单编号")
    private String saleOrderNum;

    /** 销售订单名称 */
    @Excel(name = "销售订单名称")
    private String saleOrderName;

    /** 物料名称 */
    @Excel(name = "物料名称")
    private String matName;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String modelType;

    /** 材质 */
    @Excel(name = "材质")
    private String material;

    /** 色号 */
    @Excel(name = "色号")
    private String colorNum;

    /** 规格单位 */
    @Excel(name = "规格单位")
    private String spetUnits;

    /** 生产用量 */
    @Excel(name = "生产用量")
    private Long pudtUseNum;

    /** 计价单位 */
    @Excel(name = "计价单位")
    private String valuUnits;

    /** 预留 */
    @Excel(name = "预留")
    private String yl;

    /** 预留 */
    @Excel(name = "预留")
    private String yl2;

    /** 预留 */
    @Excel(name = "预留")
    private String yl3;

    /** 预留 */
    @Excel(name = "预留")
    private String yl4;

    /** 预留 */
    @Excel(name = "预留")
    private String yl5;

    public void setBomId(Long bomId) 
    {
        this.bomId = bomId;
    }

    public Long getBomId() 
    {
        return bomId;
    }
    public void setSaleOrderNum(String saleOrderNum) 
    {
        this.saleOrderNum = saleOrderNum;
    }

    public String getSaleOrderNum() 
    {
        return saleOrderNum;
    }
    public void setSaleOrderName(String saleOrderName) 
    {
        this.saleOrderName = saleOrderName;
    }

    public String getSaleOrderName() 
    {
        return saleOrderName;
    }
    public void setMatName(String matName) 
    {
        this.matName = matName;
    }

    public String getMatName() 
    {
        return matName;
    }
    public void setModelType(String modelType) 
    {
        this.modelType = modelType;
    }

    public String getModelType() 
    {
        return modelType;
    }
    public void setMaterial(String material) 
    {
        this.material = material;
    }

    public String getMaterial() 
    {
        return material;
    }
    public void setColorNum(String colorNum) 
    {
        this.colorNum = colorNum;
    }

    public String getColorNum() 
    {
        return colorNum;
    }
    public void setSpetUnits(String spetUnits) 
    {
        this.spetUnits = spetUnits;
    }

    public String getSpetUnits() 
    {
        return spetUnits;
    }
    public void setPudtUseNum(Long pudtUseNum) 
    {
        this.pudtUseNum = pudtUseNum;
    }

    public Long getPudtUseNum() 
    {
        return pudtUseNum;
    }
    public void setValuUnits(String valuUnits) 
    {
        this.valuUnits = valuUnits;
    }

    public String getValuUnits() 
    {
        return valuUnits;
    }
    public void setYl(String yl) 
    {
        this.yl = yl;
    }

    public String getYl() 
    {
        return yl;
    }
    public void setYl2(String yl2) 
    {
        this.yl2 = yl2;
    }

    public String getYl2() 
    {
        return yl2;
    }
    public void setYl3(String yl3) 
    {
        this.yl3 = yl3;
    }

    public String getYl3() 
    {
        return yl3;
    }
    public void setYl4(String yl4) 
    {
        this.yl4 = yl4;
    }

    public String getYl4() 
    {
        return yl4;
    }
    public void setYl5(String yl5) 
    {
        this.yl5 = yl5;
    }

    public String getYl5() 
    {
        return yl5;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("bomId", getBomId())
            .append("saleOrderNum", getSaleOrderNum())
            .append("saleOrderName", getSaleOrderName())
            .append("matName", getMatName())
            .append("modelType", getModelType())
            .append("material", getMaterial())
            .append("colorNum", getColorNum())
            .append("spetUnits", getSpetUnits())
            .append("pudtUseNum", getPudtUseNum())
            .append("valuUnits", getValuUnits())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
