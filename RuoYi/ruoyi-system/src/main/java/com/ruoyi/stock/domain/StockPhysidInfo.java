package com.ruoyi.stock.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 实物ID 信息对象 stock_physid_info
 * 
 * @author wnagbo
 * @date 2020-12-10
 */
public class StockPhysidInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 实物ID信息ID */
    private Long phsyidInfoId;

    /** 采购方总部编码 */
    @Excel(name = "采购方总部编码")
    private String buyerHqCode;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String vendorCode;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String vendorName;

    /** 实物ID */
    @Excel(name = "实物ID")
    private String physId;

    /** 采购订单行项目id */
    @Excel(name = "采购订单行项目id")
    private String purcOrderItenId;

    /** 实物生产状态 */
    @Excel(name = "实物生产状态")
    private String physPrdtStatus;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String dataSource;

    /** 来源数据创建时间 */
    @Excel(name = "来源数据创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sourdataCretTime;

    /** 备注 */
    @Excel(name = "备注")
    private String note;

    /** 数据拥有方 */
    @Excel(name = "数据拥有方")
    private String dataOwner;

    /** 数据可见方 */
    @Excel(name = "数据可见方")
    private String dataVisible;

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

    public void setPhsyidInfoId(Long phsyidInfoId) 
    {
        this.phsyidInfoId = phsyidInfoId;
    }

    public Long getPhsyidInfoId() 
    {
        return phsyidInfoId;
    }
    public void setBuyerHqCode(String buyerHqCode) 
    {
        this.buyerHqCode = buyerHqCode;
    }

    public String getBuyerHqCode() 
    {
        return buyerHqCode;
    }
    public void setVendorCode(String vendorCode) 
    {
        this.vendorCode = vendorCode;
    }

    public String getVendorCode() 
    {
        return vendorCode;
    }
    public void setVendorName(String vendorName) 
    {
        this.vendorName = vendorName;
    }

    public String getVendorName() 
    {
        return vendorName;
    }
    public void setPhysId(String physId) 
    {
        this.physId = physId;
    }

    public String getPhysId() 
    {
        return physId;
    }
    public void setPurcOrderItenId(String purcOrderItenId) 
    {
        this.purcOrderItenId = purcOrderItenId;
    }

    public String getPurcOrderItenId() 
    {
        return purcOrderItenId;
    }
    public void setPhysPrdtStatus(String physPrdtStatus) 
    {
        this.physPrdtStatus = physPrdtStatus;
    }

    public String getPhysPrdtStatus() 
    {
        return physPrdtStatus;
    }
    public void setDataSource(String dataSource) 
    {
        this.dataSource = dataSource;
    }

    public String getDataSource() 
    {
        return dataSource;
    }
    public void setSourdataCretTime(Date sourdataCretTime) 
    {
        this.sourdataCretTime = sourdataCretTime;
    }

    public Date getSourdataCretTime() 
    {
        return sourdataCretTime;
    }
    public void setNote(String note) 
    {
        this.note = note;
    }

    public String getNote() 
    {
        return note;
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
            .append("phsyidInfoId", getPhsyidInfoId())
            .append("buyerHqCode", getBuyerHqCode())
            .append("vendorCode", getVendorCode())
            .append("vendorName", getVendorName())
            .append("physId", getPhysId())
            .append("purcOrderItenId", getPurcOrderItenId())
            .append("physPrdtStatus", getPhysPrdtStatus())
            .append("dataSource", getDataSource())
            .append("sourdataCretTime", getSourdataCretTime())
            .append("note", getNote())
            .append("dataOwner", getDataOwner())
            .append("dataVisible", getDataVisible())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
