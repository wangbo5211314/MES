package com.ruoyi.stock.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产成品库存信息对象 stock_pudt_sinfo
 * 
 * @author wangbo
 * @date 2020-12-10
 */
public class StockPudtSinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 产成品库存信息ID */
    private Long pudtSinfoId;

    /** 采购方总部编码 */
    @Excel(name = "采购方总部编码")
    private String buyerHqCode;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String vendorCode;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String vendorName;

    /** 产成品编码 */
    @Excel(name = "产成品编码")
    private String pudtCode;

    /** 产成品名称 */
    @Excel(name = "产成品名称")
    private String pudtName;

    /** 产成品库存剩余数量 */
    @Excel(name = "产成品库存剩余数量")
    private Long pudtSrestNum;

    /** 计量单位 */
    @Excel(name = "计量单位")
    private String units;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String dataSour;

    /** 来源数据创建时间 */
    @Excel(name = "来源数据创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dsourCretTime;

    /** 备注 */
    @Excel(name = "备注")
    private String note;

    /** 数据拥有方 */
    @Excel(name = "数据拥有方")
    private String dataOwner;

    /** 数据可见方 */
    @Excel(name = "数据可见方")
    private String dataVisible;

    /** 国网采购订单号 */
    @Excel(name = "国网采购订单号")
    private String gwPursNum;

    /** 入库批次号 */
    @Excel(name = "入库批次号")
    private String storBatchNum;

    /** 当前入库批次库存剩余数量 */
    @Excel(name = "当前入库批次库存剩余数量")
    private Long curbhStockNum;

    /** 采购方公司名称 */
    @Excel(name = "采购方公司名称")
    private String pursCmpyName;

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

    public void setPudtSinfoId(Long pudtSinfoId) 
    {
        this.pudtSinfoId = pudtSinfoId;
    }

    public Long getPudtSinfoId() 
    {
        return pudtSinfoId;
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
    public void setPudtCode(String pudtCode) 
    {
        this.pudtCode = pudtCode;
    }

    public String getPudtCode() 
    {
        return pudtCode;
    }
    public void setPudtName(String pudtName) 
    {
        this.pudtName = pudtName;
    }

    public String getPudtName() 
    {
        return pudtName;
    }
    public void setPudtSrestNum(Long pudtSrestNum) 
    {
        this.pudtSrestNum = pudtSrestNum;
    }

    public Long getPudtSrestNum() 
    {
        return pudtSrestNum;
    }
    public void setUnits(String units) 
    {
        this.units = units;
    }

    public String getUnits() 
    {
        return units;
    }
    public void setDataSour(String dataSour) 
    {
        this.dataSour = dataSour;
    }

    public String getDataSour() 
    {
        return dataSour;
    }
    public void setDsourCretTime(Date dsourCretTime) 
    {
        this.dsourCretTime = dsourCretTime;
    }

    public Date getDsourCretTime() 
    {
        return dsourCretTime;
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
    public void setGwPursNum(String gwPursNum) 
    {
        this.gwPursNum = gwPursNum;
    }

    public String getGwPursNum() 
    {
        return gwPursNum;
    }
    public void setStorBatchNum(String storBatchNum) 
    {
        this.storBatchNum = storBatchNum;
    }

    public String getStorBatchNum() 
    {
        return storBatchNum;
    }
    public void setCurbhStockNum(Long curbhStockNum) 
    {
        this.curbhStockNum = curbhStockNum;
    }

    public Long getCurbhStockNum() 
    {
        return curbhStockNum;
    }
    public void setPursCmpyName(String pursCmpyName) 
    {
        this.pursCmpyName = pursCmpyName;
    }

    public String getPursCmpyName() 
    {
        return pursCmpyName;
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
            .append("pudtSinfoId", getPudtSinfoId())
            .append("buyerHqCode", getBuyerHqCode())
            .append("vendorCode", getVendorCode())
            .append("vendorName", getVendorName())
            .append("pudtCode", getPudtCode())
            .append("pudtName", getPudtName())
            .append("pudtSrestNum", getPudtSrestNum())
            .append("units", getUnits())
            .append("dataSour", getDataSour())
            .append("dsourCretTime", getDsourCretTime())
            .append("note", getNote())
            .append("dataOwner", getDataOwner())
            .append("dataVisible", getDataVisible())
            .append("gwPursNum", getGwPursNum())
            .append("storBatchNum", getStorBatchNum())
            .append("curbhStockNum", getCurbhStockNum())
            .append("pursCmpyName", getPursCmpyName())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
