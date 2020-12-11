package com.ruoyi.order.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售订单对象 sales_order
 * 
 * @author wangbo
 * @date 2020-12-08
 */
public class SalesOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 销售订单ID */
    private Long salesOrderId;

    /** 采购方总部编码 */
    @Excel(name = "采购方总部编码")
    private String buyerHqCode;

    /** 销售订单号 */
    @Excel(name = "销售订单号")
    private String saleOrderNum;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String vendorCode;

    /** 采购方公司编码 */
    @Excel(name = "采购方公司编码")
    private String buyerCompanyCode;

    /** 采购方公司名称 */
    @Excel(name = "采购方公司名称")
    private String buyerCompanyName;

    /** 采购方公司省份 */
    @Excel(name = "采购方公司省份")
    private String buyerCompanyProvince;

    /** 品类编码 */
    @Excel(name = "品类编码")
    private String categoryCode;

    /** 种类编码 */
    @Excel(name = "种类编码")
    private String kindCode;

    /** 销售订单状态 */
    @Excel(name = "销售订单状态")
    private String saleOrderStatus;

    /** 销售订单行项目号 */
    @Excel(name = "销售订单行项目号")
    private String saleOrderitemNum;

    /** 采购订单行项目ID */
    @Excel(name = "采购订单行项目ID")
    private String purchaseOrderitemId;

    /** 物资编码 */
    @Excel(name = "物资编码")
    private String meterialCode;

    /** 物资名称 */
    @Excel(name = "物资名称")
    private String meterialName;

    /** 物资单位 */
    @Excel(name = "物资单位")
    private String meterialUnit;

    /** 物资数量 */
    @Excel(name = "物资数量")
    private Long meterialNum;

    /** 数据拥有方 */
    @Excel(name = "数据拥有方")
    private String dataOwner;

    /** 数据可见方 */
    @Excel(name = "数据可见方")
    private String dataVisible;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String dataSource;

    /** 来源数据创建时间 */
    @Excel(name = "来源数据创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date datasourceCreateTime;

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

    public void setSalesOrderId(Long salesOrderId) 
    {
        this.salesOrderId = salesOrderId;
    }

    public Long getSalesOrderId() 
    {
        return salesOrderId;
    }
    public void setBuyerHqCode(String buyerHqCode) 
    {
        this.buyerHqCode = buyerHqCode;
    }

    public String getBuyerHqCode() 
    {
        return buyerHqCode;
    }
    public void setSaleOrderNum(String saleOrderNum) 
    {
        this.saleOrderNum = saleOrderNum;
    }

    public String getSaleOrderNum() 
    {
        return saleOrderNum;
    }
    public void setVendorCode(String vendorCode) 
    {
        this.vendorCode = vendorCode;
    }

    public String getVendorCode() 
    {
        return vendorCode;
    }
    public void setBuyerCompanyCode(String buyerCompanyCode) 
    {
        this.buyerCompanyCode = buyerCompanyCode;
    }

    public String getBuyerCompanyCode() 
    {
        return buyerCompanyCode;
    }
    public void setBuyerCompanyName(String buyerCompanyName) 
    {
        this.buyerCompanyName = buyerCompanyName;
    }

    public String getBuyerCompanyName() 
    {
        return buyerCompanyName;
    }
    public void setBuyerCompanyProvince(String buyerCompanyProvince) 
    {
        this.buyerCompanyProvince = buyerCompanyProvince;
    }

    public String getBuyerCompanyProvince() 
    {
        return buyerCompanyProvince;
    }
    public void setCategoryCode(String categoryCode) 
    {
        this.categoryCode = categoryCode;
    }

    public String getCategoryCode() 
    {
        return categoryCode;
    }
    public void setKindCode(String kindCode) 
    {
        this.kindCode = kindCode;
    }

    public String getKindCode() 
    {
        return kindCode;
    }
    public void setSaleOrderStatus(String saleOrderStatus) 
    {
        this.saleOrderStatus = saleOrderStatus;
    }

    public String getSaleOrderStatus() 
    {
        return saleOrderStatus;
    }
    public void setSaleOrderitemNum(String saleOrderitemNum) 
    {
        this.saleOrderitemNum = saleOrderitemNum;
    }

    public String getSaleOrderitemNum() 
    {
        return saleOrderitemNum;
    }
    public void setPurchaseOrderitemId(String purchaseOrderitemId) 
    {
        this.purchaseOrderitemId = purchaseOrderitemId;
    }

    public String getPurchaseOrderitemId() 
    {
        return purchaseOrderitemId;
    }
    public void setMeterialCode(String meterialCode) 
    {
        this.meterialCode = meterialCode;
    }

    public String getMeterialCode() 
    {
        return meterialCode;
    }
    public void setMeterialName(String meterialName) 
    {
        this.meterialName = meterialName;
    }

    public String getMeterialName() 
    {
        return meterialName;
    }
    public void setMeterialUnit(String meterialUnit) 
    {
        this.meterialUnit = meterialUnit;
    }

    public String getMeterialUnit() 
    {
        return meterialUnit;
    }
    public void setMeterialNum(Long meterialNum) 
    {
        this.meterialNum = meterialNum;
    }

    public Long getMeterialNum() 
    {
        return meterialNum;
    }
    public void setDataOwner(String dataOwner) 
    {
        this.dataOwner = dataOwner;
    }

    public String getDataOwner() 
    {
        return dataOwner;
    }
    public void setDataVisible(String dataVisible) 
    {
        this.dataVisible = dataVisible;
    }

    public String getDataVisible() 
    {
        return dataVisible;
    }
    public void setDataSource(String dataSource) 
    {
        this.dataSource = dataSource;
    }

    public String getDataSource() 
    {
        return dataSource;
    }
    public void setDatasourceCreateTime(Date datasourceCreateTime) 
    {
        this.datasourceCreateTime = datasourceCreateTime;
    }

    public Date getDatasourceCreateTime() 
    {
        return datasourceCreateTime;
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
            .append("salesOrderId", getSalesOrderId())
            .append("buyerHqCode", getBuyerHqCode())
            .append("saleOrderNum", getSaleOrderNum())
            .append("vendorCode", getVendorCode())
            .append("buyerCompanyCode", getBuyerCompanyCode())
            .append("buyerCompanyName", getBuyerCompanyName())
            .append("buyerCompanyProvince", getBuyerCompanyProvince())
            .append("categoryCode", getCategoryCode())
            .append("kindCode", getKindCode())
            .append("saleOrderStatus", getSaleOrderStatus())
            .append("saleOrderitemNum", getSaleOrderitemNum())
            .append("purchaseOrderitemId", getPurchaseOrderitemId())
            .append("meterialCode", getMeterialCode())
            .append("meterialName", getMeterialName())
            .append("meterialUnit", getMeterialUnit())
            .append("meterialNum", getMeterialNum())
            .append("dataOwner", getDataOwner())
            .append("dataVisible", getDataVisible())
            .append("dataSource", getDataSource())
            .append("datasourceCreateTime", getDatasourceCreateTime())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
