package com.ruoyi.stock.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 出库单对象 stock_out
 * 
 * @author 王博
 * @date 2021-01-28
 */
public class StockOut extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 出库单id */
    private Long ckId;

    /** 出库单号 */
    @Excel(name = "出库单号")
    private String stockoNum;

    /** 出库单名称 */
    @Excel(name = "出库单名称")
    private String stockoName;

    /** 出库材料名称 */
    @Excel(name = "出库材料名称")
    private String stockoMateName;

    /** 出库材料数量 */
    @Excel(name = "出库材料数量")
    private Long stockoMateNum;

    /** 计量单位 */
    @Excel(name = "计量单位")
    private String stockoMateUnit;

    /** 生产订单编号 */
    @Excel(name = "生产订单编号")
    private String scOrderNum;

    /** 生产订单名称 */
    @Excel(name = "生产订单名称")
    private String scOrderName;

    /** 采购订单编号 */
    @Excel(name = "采购订单编号")
    private String cgddNum;

    /** 采购订单名称 */
    @Excel(name = "采购订单名称")
    private String cgddName;

    /** BOM编号 */
    @Excel(name = "BOM编号")
    private String bomYlId;

    /** bom物料名称 */
    @Excel(name = "bom物料名称")
    private String bomMatName;

    /** bom规格型号 */
    @Excel(name = "bom规格型号")
    private String bomModelType;

    /** bom色号 */
    @Excel(name = "bom色号")
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

    /** 销售订单号 */
    @Excel(name = "销售订单号")
    private String saleOrderNum;

    /** 销售订单名称 */
    @Excel(name = "销售订单名称")
    private String saleOrderName;

    /** 备注 */
    @Excel(name = "备注")
    private String note;

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

    /** 总库存数量 */
    @Excel(name = "总库存数量")
    private Long ylint;

    /** 预留int */
    @Excel(name = "预留int")
    private Long ylint2;

    public void setCkId(Long ckId) 
    {
        this.ckId = ckId;
    }

    public Long getCkId() 
    {
        return ckId;
    }
    public void setStockoNum(String stockoNum) 
    {
        this.stockoNum = stockoNum;
    }

    public String getStockoNum() 
    {
        return stockoNum;
    }
    public void setStockoName(String stockoName) 
    {
        this.stockoName = stockoName;
    }

    public String getStockoName() 
    {
        return stockoName;
    }
    public void setStockoMateName(String stockoMateName) 
    {
        this.stockoMateName = stockoMateName;
    }

    public String getStockoMateName() 
    {
        return stockoMateName;
    }
    public void setStockoMateNum(Long stockoMateNum) 
    {
        this.stockoMateNum = stockoMateNum;
    }

    public Long getStockoMateNum() 
    {
        return stockoMateNum;
    }
    public void setStockoMateUnit(String stockoMateUnit) 
    {
        this.stockoMateUnit = stockoMateUnit;
    }

    public String getStockoMateUnit() 
    {
        return stockoMateUnit;
    }
    public void setScOrderNum(String scOrderNum) 
    {
        this.scOrderNum = scOrderNum;
    }

    public String getScOrderNum() 
    {
        return scOrderNum;
    }
    public void setScOrderName(String scOrderName) 
    {
        this.scOrderName = scOrderName;
    }

    public String getScOrderName() 
    {
        return scOrderName;
    }
    public void setCgddNum(String cgddNum) 
    {
        this.cgddNum = cgddNum;
    }

    public String getCgddNum() 
    {
        return cgddNum;
    }
    public void setCgddName(String cgddName) 
    {
        this.cgddName = cgddName;
    }

    public String getCgddName() 
    {
        return cgddName;
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
    public void setYlint(Long ylint) 
    {
        this.ylint = ylint;
    }

    public Long getYlint() 
    {
        return ylint;
    }
    public void setYlint2(Long ylint2) 
    {
        this.ylint2 = ylint2;
    }

    public Long getYlint2() 
    {
        return ylint2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ckId", getCkId())
            .append("stockoNum", getStockoNum())
            .append("stockoName", getStockoName())
            .append("stockoMateName", getStockoMateName())
            .append("stockoMateNum", getStockoMateNum())
            .append("stockoMateUnit", getStockoMateUnit())
            .append("scOrderNum", getScOrderNum())
            .append("scOrderName", getScOrderName())
            .append("cgddNum", getCgddNum())
            .append("cgddName", getCgddName())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("bomYlId", getBomYlId())
            .append("bomMatName", getBomMatName())
            .append("bomModelType", getBomModelType())
            .append("bomColorNum", getBomColorNum())
            .append("bomMaterial", getBomMaterial())
            .append("bomSpetUnits", getBomSpetUnits())
            .append("bomPudtUseNum", getBomPudtUseNum())
            .append("bomValuUnits", getBomValuUnits())
            .append("supplyUnit", getSupplyUnit())
            .append("supplyDate", getSupplyDate())
            .append("deliveryDate", getDeliveryDate())
            .append("supplyPerple", getSupplyPerple())
            .append("supplyPhoneNum", getSupplyPhoneNum())
            .append("receiptAddress", getReceiptAddress())
            .append("saleOrderNum", getSaleOrderNum())
            .append("saleOrderName", getSaleOrderName())
            .append("note", getNote())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .append("ylint", getYlint())
            .append("ylint2", getYlint2())
            .toString();
    }
}
