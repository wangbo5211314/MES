package com.ruoyi.purcmanage.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 采购订单对象 purc_order
 * 
 * @author 王博
 * @date 2021-01-25
 */
public class PurcOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 采购订单ID */
    private Long id;

    /** 采购单号 */
    @Excel(name = "采购单号")
    private String purOrderNum;

    /** 采购单名称 */
    @Excel(name = "采购单名称")
    private String purOrderName;

    /** BOM编号 */
    @Excel(name = "BOM编号")
    private String bomYlId;

    /** 物料名称 */
    @Excel(name = "物料名称")
    private String bomMatName;

    /** bom规格型号 */
    @Excel(name = "bom规格型号")
    private String bomModelType;

    /** 色号 */
    @Excel(name = "色号")
    private String bomColorNum;

    /** bom材质 */
    @Excel(name = "bom材质")
    private String bomMaterial;

    /** bom规格单位 */
    @Excel(name = "bom规格单位")
    private String bomSpetUnits;

    /** bom生产用量 */
    @Excel(name = "bom生产用量")
    private Long bomPudtUseNum;

    /** bom计价单位 */
    @Excel(name = "bom计价单位")
    private String bomValuUnits;

    /** 需采购数量 */
    @Excel(name = "需采购数量")
    private Long xcgNum;

    /** 供货单位 */
    @Excel(name = "供货单位")
    private String supplyUnit;

    /** 供货日期 */
    @Excel(name = "供货日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date supplyDate;

    /** 交货日期 */
    @Excel(name = "交货日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryDate;

    /** 供货联系人 */
    @Excel(name = "供货联系人")
    private String supplyPerple;

    /** 供货商联系电话 */
    @Excel(name = "供货商联系电话")
    private String supplyPhoneNum;

    /** 收货地址 */
    @Excel(name = "收货地址")
    private String receiptAddress;

    /** 子合同编号 */
    @Excel(name = "子合同编号")
    private String saleOrderNum;

    /** 子合同名称 */
    @Excel(name = "子合同名称")
    private String saleOrderName;

    /** 备注 */
    @Excel(name = "备注")
    private String note;

    /** 更新人 */
    @Excel(name = "更新人")
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

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPurOrderNum(String purOrderNum) 
    {
        this.purOrderNum = purOrderNum;
    }

    public String getPurOrderNum() 
    {
        return purOrderNum;
    }
    public void setPurOrderName(String purOrderName) 
    {
        this.purOrderName = purOrderName;
    }

    public String getPurOrderName() 
    {
        return purOrderName;
    }
    public void setBomYlId(String bomYlId) 
    {
        this.bomYlId = bomYlId;
    }

    public String getBomYlId() 
    {
        return bomYlId;
    }
    public void setBomMatName(String bomMatName) 
    {
        this.bomMatName = bomMatName;
    }

    public String getBomMatName() 
    {
        return bomMatName;
    }
    public void setBomModelType(String bomModelType) 
    {
        this.bomModelType = bomModelType;
    }

    public String getBomModelType() 
    {
        return bomModelType;
    }
    public void setBomColorNum(String bomColorNum) 
    {
        this.bomColorNum = bomColorNum;
    }

    public String getBomColorNum() 
    {
        return bomColorNum;
    }
    public void setBomMaterial(String bomMaterial) 
    {
        this.bomMaterial = bomMaterial;
    }

    public String getBomMaterial() 
    {
        return bomMaterial;
    }
    public void setBomSpetUnits(String bomSpetUnits) 
    {
        this.bomSpetUnits = bomSpetUnits;
    }

    public String getBomSpetUnits() 
    {
        return bomSpetUnits;
    }
    public void setBomPudtUseNum(Long bomPudtUseNum) 
    {
        this.bomPudtUseNum = bomPudtUseNum;
    }

    public Long getBomPudtUseNum() 
    {
        return bomPudtUseNum;
    }
    public void setBomValuUnits(String bomValuUnits) 
    {
        this.bomValuUnits = bomValuUnits;
    }

    public String getBomValuUnits() 
    {
        return bomValuUnits;
    }
    public void setXcgNum(Long xcgNum) 
    {
        this.xcgNum = xcgNum;
    }

    public Long getXcgNum() 
    {
        return xcgNum;
    }
    public void setSupplyUnit(String supplyUnit) 
    {
        this.supplyUnit = supplyUnit;
    }

    public String getSupplyUnit() 
    {
        return supplyUnit;
    }
    public void setSupplyDate(Date supplyDate) 
    {
        this.supplyDate = supplyDate;
    }

    public Date getSupplyDate() 
    {
        return supplyDate;
    }
    public void setDeliveryDate(Date deliveryDate) 
    {
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate() 
    {
        return deliveryDate;
    }
    public void setSupplyPerple(String supplyPerple) 
    {
        this.supplyPerple = supplyPerple;
    }

    public String getSupplyPerple() 
    {
        return supplyPerple;
    }
    public void setSupplyPhoneNum(String supplyPhoneNum) 
    {
        this.supplyPhoneNum = supplyPhoneNum;
    }

    public String getSupplyPhoneNum() 
    {
        return supplyPhoneNum;
    }
    public void setReceiptAddress(String receiptAddress) 
    {
        this.receiptAddress = receiptAddress;
    }

    public String getReceiptAddress() 
    {
        return receiptAddress;
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
    public void setNote(String note) 
    {
        this.note = note;
    }

    public String getNote() 
    {
        return note;
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
            .append("id", getId())
            .append("purOrderNum", getPurOrderNum())
            .append("purOrderName", getPurOrderName())
            .append("bomYlId", getBomYlId())
            .append("bomMatName", getBomMatName())
            .append("bomModelType", getBomModelType())
            .append("bomColorNum", getBomColorNum())
            .append("bomMaterial", getBomMaterial())
            .append("bomSpetUnits", getBomSpetUnits())
            .append("bomPudtUseNum", getBomPudtUseNum())
            .append("bomValuUnits", getBomValuUnits())
            .append("xcgNum", getXcgNum())
            .append("supplyUnit", getSupplyUnit())
            .append("supplyDate", getSupplyDate())
            .append("deliveryDate", getDeliveryDate())
            .append("supplyPerple", getSupplyPerple())
            .append("supplyPhoneNum", getSupplyPhoneNum())
            .append("receiptAddress", getReceiptAddress())
            .append("saleOrderNum", getSaleOrderNum())
            .append("saleOrderName", getSaleOrderName())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("note", getNote())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
