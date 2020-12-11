package com.ruoyi.production.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工单对象 prdt_work_order
 * 
 * @author wangbo
 * @date 2020-12-09
 */
public class PrdtWorkOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long workOrderId;

    /** 采购方总部编码 */
    @Excel(name = "采购方总部编码")
    private String buyerHqCode;

    /** 供应商生产订单编号 */
    @Excel(name = "供应商生产订单编号")
    private String venderPrdtOrderNum;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String vendorCode;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String vendorName;

    /** 生产工单编码 */
    @Excel(name = "生产工单编码")
    private String prdtTicketCode;

    /** 品类编码 */
    @Excel(name = "品类编码")
    private String cateCode;

    /** 种类编码 */
    @Excel(name = "种类编码")
    private String kindCode;

    /** 厂家物料编码 */
    @Excel(name = "厂家物料编码")
    private String factMatelCode;

    /** 厂家物料描述 */
    @Excel(name = "厂家物料描述")
    private String factMatelDesc;

    /** 物料批次 */
    @Excel(name = "物料批次")
    private String matelBatch;

    /** 生产数量 */
    @Excel(name = "生产数量")
    private Long prdtNum;

    /** 计量单位 */
    @Excel(name = "计量单位")
    private String meteUnit;

    /** 计划开始日期 */
    @Excel(name = "计划开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planStartDate;

    /** 计划完成日期 */
    @Excel(name = "计划完成日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planEndDate;

    /** 实际开始日期 */
    @Excel(name = "实际开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actuStartDate;

    /** 实际完成日期 */
    @Excel(name = "实际完成日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actuFinishDate;

    /** 工单状态 */
    @Excel(name = "工单状态")
    private String ticketStatu;

    /** 工艺路线编码 */
    @Excel(name = "工艺路线编码")
    private String routeCode;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String dataSource;

    /** 来源数据创建时间 */
    @Excel(name = "来源数据创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date datasourCreateDate;

    /** 逻辑删除 */
    @Excel(name = "逻辑删除")
    private String tombDelete;

    /** 数据拥有方 */
    @Excel(name = "数据拥有方")
    private String dataOwner;

    /** 数据可见方 */
    @Excel(name = "数据可见方")
    private String dataVisible;

    /** 产品型号规格 */
    @Excel(name = "产品型号规格")
    private String prodTypeSize;

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

    public void setWorkOrderId(Long workOrderId) 
    {
        this.workOrderId = workOrderId;
    }

    public Long getWorkOrderId() 
    {
        return workOrderId;
    }
    public void setBuyerHqCode(String buyerHqCode) 
    {
        this.buyerHqCode = buyerHqCode;
    }

    public String getBuyerHqCode() 
    {
        return buyerHqCode;
    }
    public void setVenderPrdtOrderNum(String venderPrdtOrderNum) 
    {
        this.venderPrdtOrderNum = venderPrdtOrderNum;
    }

    public String getVenderPrdtOrderNum() 
    {
        return venderPrdtOrderNum;
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
    public void setPrdtTicketCode(String prdtTicketCode) 
    {
        this.prdtTicketCode = prdtTicketCode;
    }

    public String getPrdtTicketCode() 
    {
        return prdtTicketCode;
    }
    public void setCateCode(String cateCode) 
    {
        this.cateCode = cateCode;
    }

    public String getCateCode() 
    {
        return cateCode;
    }
    public void setKindCode(String kindCode) 
    {
        this.kindCode = kindCode;
    }

    public String getKindCode() 
    {
        return kindCode;
    }
    public void setFactMatelCode(String factMatelCode) 
    {
        this.factMatelCode = factMatelCode;
    }

    public String getFactMatelCode() 
    {
        return factMatelCode;
    }
    public void setFactMatelDesc(String factMatelDesc) 
    {
        this.factMatelDesc = factMatelDesc;
    }

    public String getFactMatelDesc() 
    {
        return factMatelDesc;
    }
    public void setMatelBatch(String matelBatch) 
    {
        this.matelBatch = matelBatch;
    }

    public String getMatelBatch() 
    {
        return matelBatch;
    }
    public void setPrdtNum(Long prdtNum) 
    {
        this.prdtNum = prdtNum;
    }

    public Long getPrdtNum() 
    {
        return prdtNum;
    }
    public void setMeteUnit(String meteUnit) 
    {
        this.meteUnit = meteUnit;
    }

    public String getMeteUnit() 
    {
        return meteUnit;
    }
    public void setPlanStartDate(Date planStartDate) 
    {
        this.planStartDate = planStartDate;
    }

    public Date getPlanStartDate() 
    {
        return planStartDate;
    }
    public void setPlanEndDate(Date planEndDate) 
    {
        this.planEndDate = planEndDate;
    }

    public Date getPlanEndDate() 
    {
        return planEndDate;
    }
    public void setActuStartDate(Date actuStartDate) 
    {
        this.actuStartDate = actuStartDate;
    }

    public Date getActuStartDate() 
    {
        return actuStartDate;
    }
    public void setActuFinishDate(Date actuFinishDate) 
    {
        this.actuFinishDate = actuFinishDate;
    }

    public Date getActuFinishDate() 
    {
        return actuFinishDate;
    }
    public void setTicketStatu(String ticketStatu) 
    {
        this.ticketStatu = ticketStatu;
    }

    public String getTicketStatu() 
    {
        return ticketStatu;
    }
    public void setRouteCode(String routeCode) 
    {
        this.routeCode = routeCode;
    }

    public String getRouteCode() 
    {
        return routeCode;
    }
    public void setDataSource(String dataSource) 
    {
        this.dataSource = dataSource;
    }

    public String getDataSource() 
    {
        return dataSource;
    }
    public void setDatasourCreateDate(Date datasourCreateDate) 
    {
        this.datasourCreateDate = datasourCreateDate;
    }

    public Date getDatasourCreateDate() 
    {
        return datasourCreateDate;
    }
    public void setTombDelete(String tombDelete) 
    {
        this.tombDelete = tombDelete;
    }

    public String getTombDelete() 
    {
        return tombDelete;
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
    public void setProdTypeSize(String prodTypeSize) 
    {
        this.prodTypeSize = prodTypeSize;
    }

    public String getProdTypeSize() 
    {
        return prodTypeSize;
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
            .append("workOrderId", getWorkOrderId())
            .append("buyerHqCode", getBuyerHqCode())
            .append("venderPrdtOrderNum", getVenderPrdtOrderNum())
            .append("vendorCode", getVendorCode())
            .append("vendorName", getVendorName())
            .append("prdtTicketCode", getPrdtTicketCode())
            .append("cateCode", getCateCode())
            .append("kindCode", getKindCode())
            .append("factMatelCode", getFactMatelCode())
            .append("factMatelDesc", getFactMatelDesc())
            .append("matelBatch", getMatelBatch())
            .append("prdtNum", getPrdtNum())
            .append("meteUnit", getMeteUnit())
            .append("planStartDate", getPlanStartDate())
            .append("planEndDate", getPlanEndDate())
            .append("actuStartDate", getActuStartDate())
            .append("actuFinishDate", getActuFinishDate())
            .append("ticketStatu", getTicketStatu())
            .append("routeCode", getRouteCode())
            .append("dataSource", getDataSource())
            .append("datasourCreateDate", getDatasourCreateDate())
            .append("tombDelete", getTombDelete())
            .append("dataOwner", getDataOwner())
            .append("dataVisible", getDataVisible())
            .append("prodTypeSize", getProdTypeSize())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
