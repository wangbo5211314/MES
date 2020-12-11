package com.ruoyi.stock.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 重点原材料库存对象 stock_key_materi
 * 
 * @author wangbo
 * @date 2020-12-10
 */
public class StockKeyMateri extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 重点原材料库存ID */
    private Long keyMateriStockId;

    /** 采购方总部编码 */
    @Excel(name = "采购方总部编码")
    private String buyerHqCode;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String vendorCode;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String vendorName;

    /** 原材料名称 */
    @Excel(name = "原材料名称")
    private String materiName;

    /** 原材料编码 */
    @Excel(name = "原材料编码")
    private String materiCode;

    /** 原材料库存数量 */
    @Excel(name = "原材料库存数量")
    private Long materiStockNum;

    /** 原材料单位 */
    @Excel(name = "原材料单位")
    private String materiUnit;

    /** 原材料描述 */
    @Excel(name = "原材料描述")
    private String materiDesc;

    /** 原材料供应商 */
    @Excel(name = "原材料供应商")
    private String materiVendor;

    /** 原材料制造商 */
    @Excel(name = "原材料制造商")
    private String materiMaker;

    /** 采购时间 */
    @Excel(name = "采购时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date buyTime;

    /** 采购数量 */
    @Excel(name = "采购数量")
    private Long buyNum;

    /** 到货时间 */
    @Excel(name = "到货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date arrivalTime;

    /** 国网侧需求数量 */
    @Excel(name = "国网侧需求数量")
    private Long gwNeedNum;

    /** 品类 */
    @Excel(name = "品类")
    private String category;

    /** 种类 */
    @Excel(name = "种类")
    private String type;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String dataSour;

    /** 来源数据创建时间 */
    @Excel(name = "来源数据创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date datasourCretTime;

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

    public void setKeyMateriStockId(Long keyMateriStockId) 
    {
        this.keyMateriStockId = keyMateriStockId;
    }

    public Long getKeyMateriStockId() 
    {
        return keyMateriStockId;
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
    public void setMateriName(String materiName) 
    {
        this.materiName = materiName;
    }

    public String getMateriName() 
    {
        return materiName;
    }
    public void setMateriCode(String materiCode) 
    {
        this.materiCode = materiCode;
    }

    public String getMateriCode() 
    {
        return materiCode;
    }
    public void setMateriStockNum(Long materiStockNum) 
    {
        this.materiStockNum = materiStockNum;
    }

    public Long getMateriStockNum() 
    {
        return materiStockNum;
    }
    public void setMateriUnit(String materiUnit) 
    {
        this.materiUnit = materiUnit;
    }

    public String getMateriUnit() 
    {
        return materiUnit;
    }
    public void setMateriDesc(String materiDesc) 
    {
        this.materiDesc = materiDesc;
    }

    public String getMateriDesc() 
    {
        return materiDesc;
    }
    public void setMateriVendor(String materiVendor) 
    {
        this.materiVendor = materiVendor;
    }

    public String getMateriVendor() 
    {
        return materiVendor;
    }
    public void setMateriMaker(String materiMaker) 
    {
        this.materiMaker = materiMaker;
    }

    public String getMateriMaker() 
    {
        return materiMaker;
    }
    public void setBuyTime(Date buyTime) 
    {
        this.buyTime = buyTime;
    }

    public Date getBuyTime() 
    {
        return buyTime;
    }
    public void setBuyNum(Long buyNum) 
    {
        this.buyNum = buyNum;
    }

    public Long getBuyNum() 
    {
        return buyNum;
    }
    public void setArrivalTime(Date arrivalTime) 
    {
        this.arrivalTime = arrivalTime;
    }

    public Date getArrivalTime() 
    {
        return arrivalTime;
    }
    public void setGwNeedNum(Long gwNeedNum) 
    {
        this.gwNeedNum = gwNeedNum;
    }

    public Long getGwNeedNum() 
    {
        return gwNeedNum;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setDataSour(String dataSour) 
    {
        this.dataSour = dataSour;
    }

    public String getDataSour() 
    {
        return dataSour;
    }
    public void setDatasourCretTime(Date datasourCretTime) 
    {
        this.datasourCretTime = datasourCretTime;
    }

    public Date getDatasourCretTime() 
    {
        return datasourCretTime;
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
            .append("keyMateriStockId", getKeyMateriStockId())
            .append("buyerHqCode", getBuyerHqCode())
            .append("vendorCode", getVendorCode())
            .append("vendorName", getVendorName())
            .append("materiName", getMateriName())
            .append("materiCode", getMateriCode())
            .append("materiStockNum", getMateriStockNum())
            .append("materiUnit", getMateriUnit())
            .append("materiDesc", getMateriDesc())
            .append("materiVendor", getMateriVendor())
            .append("materiMaker", getMateriMaker())
            .append("buyTime", getBuyTime())
            .append("buyNum", getBuyNum())
            .append("arrivalTime", getArrivalTime())
            .append("gwNeedNum", getGwNeedNum())
            .append("category", getCategory())
            .append("type", getType())
            .append("dataSour", getDataSour())
            .append("datasourCretTime", getDatasourCretTime())
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
