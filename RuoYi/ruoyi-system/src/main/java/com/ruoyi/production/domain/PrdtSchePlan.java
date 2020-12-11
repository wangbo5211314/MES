package com.ruoyi.production.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 排产计划对象 prdt_sche_plan
 * 
 * @author wangbo
 * @date 2020-12-09
 */
public class PrdtSchePlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long schPlanId;

    /** 采购方总部编码 */
    @Excel(name = "采购方总部编码")
    private String buyerHqCode;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String vendorCode;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String vendorName;

    /** 采购订单行项目 id */
    @Excel(name = "采购订单行项目 id")
    private String purOrderItemId;

    /** 排产计划编码 */
    @Excel(name = "排产计划编码")
    private String schPlanCode;

    /** 物料编码 */
    @Excel(name = "物料编码")
    private String matCode;

    /** 物料描述 */
    @Excel(name = "物料描述")
    private String matDesc;

    /** 排产数量 */
    @Excel(name = "排产数量")
    private Long schNum;

    /** 品类编码 */
    @Excel(name = "品类编码")
    private String cateCode;

    /** 种类编码 */
    @Excel(name = "种类编码")
    private String typeCode;

    /** 计划开始日期 */
    @Excel(name = "计划开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planStartDate;

    /** 计划工期（天数） */
    @Excel(name = "计划工期", readConverterExp = "天=数")
    private Long planDay;

    /** 计划完成日期 */
    @Excel(name = "计划完成日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planFiniDate;

    /** 实际工期 */
    @Excel(name = "实际工期")
    private Long actuDay;

    /** 实际开始日期 */
    @Excel(name = "实际开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actuStartDate;

    /** 实际完成日期 */
    @Excel(name = "实际完成日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actuFiniDate;

    /** 进度 */
    @Excel(name = "进度")
    private String schedule;

    /** 交付日期（最后日期，底线） */
    @Excel(name = "交付日期", readConverterExp = "最=后日期，底线")
    private Date submitDate;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String dataSour;

    /** 来源数据创建时间 */
    @Excel(name = "来源数据创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date datasoCreateDate;

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

    public void setSchPlanId(Long schPlanId) 
    {
        this.schPlanId = schPlanId;
    }

    public Long getSchPlanId() 
    {
        return schPlanId;
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
    public void setPurOrderItemId(String purOrderItemId) 
    {
        this.purOrderItemId = purOrderItemId;
    }

    public String getPurOrderItemId() 
    {
        return purOrderItemId;
    }
    public void setSchPlanCode(String schPlanCode) 
    {
        this.schPlanCode = schPlanCode;
    }

    public String getSchPlanCode() 
    {
        return schPlanCode;
    }
    public void setMatCode(String matCode) 
    {
        this.matCode = matCode;
    }

    public String getMatCode() 
    {
        return matCode;
    }
    public void setMatDesc(String matDesc) 
    {
        this.matDesc = matDesc;
    }

    public String getMatDesc() 
    {
        return matDesc;
    }
    public void setSchNum(Long schNum) 
    {
        this.schNum = schNum;
    }

    public Long getSchNum() 
    {
        return schNum;
    }
    public void setCateCode(String cateCode) 
    {
        this.cateCode = cateCode;
    }

    public String getCateCode() 
    {
        return cateCode;
    }
    public void setTypeCode(String typeCode) 
    {
        this.typeCode = typeCode;
    }

    public String getTypeCode() 
    {
        return typeCode;
    }
    public void setPlanStartDate(Date planStartDate) 
    {
        this.planStartDate = planStartDate;
    }

    public Date getPlanStartDate() 
    {
        return planStartDate;
    }
    public void setPlanDay(Long planDay) 
    {
        this.planDay = planDay;
    }

    public Long getPlanDay() 
    {
        return planDay;
    }
    public void setPlanFiniDate(Date planFiniDate) 
    {
        this.planFiniDate = planFiniDate;
    }

    public Date getPlanFiniDate() 
    {
        return planFiniDate;
    }
    public void setActuDay(Long actuDay) 
    {
        this.actuDay = actuDay;
    }

    public Long getActuDay() 
    {
        return actuDay;
    }
    public void setActuStartDate(Date actuStartDate) 
    {
        this.actuStartDate = actuStartDate;
    }

    public Date getActuStartDate() 
    {
        return actuStartDate;
    }
    public void setActuFiniDate(Date actuFiniDate) 
    {
        this.actuFiniDate = actuFiniDate;
    }

    public Date getActuFiniDate() 
    {
        return actuFiniDate;
    }
    public void setSchedule(String schedule) 
    {
        this.schedule = schedule;
    }

    public String getSchedule() 
    {
        return schedule;
    }
    public void setSubmitDate(Date submitDate) 
    {
        this.submitDate = submitDate;
    }

    public Date getSubmitDate() 
    {
        return submitDate;
    }
    public void setDataSour(String dataSour) 
    {
        this.dataSour = dataSour;
    }

    public String getDataSour() 
    {
        return dataSour;
    }
    public void setDatasoCreateDate(Date datasoCreateDate) 
    {
        this.datasoCreateDate = datasoCreateDate;
    }

    public Date getDatasoCreateDate() 
    {
        return datasoCreateDate;
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
            .append("schPlanId", getSchPlanId())
            .append("buyerHqCode", getBuyerHqCode())
            .append("vendorCode", getVendorCode())
            .append("vendorName", getVendorName())
            .append("purOrderItemId", getPurOrderItemId())
            .append("schPlanCode", getSchPlanCode())
            .append("matCode", getMatCode())
            .append("matDesc", getMatDesc())
            .append("schNum", getSchNum())
            .append("cateCode", getCateCode())
            .append("typeCode", getTypeCode())
            .append("planStartDate", getPlanStartDate())
            .append("planDay", getPlanDay())
            .append("planFiniDate", getPlanFiniDate())
            .append("actuDay", getActuDay())
            .append("actuStartDate", getActuStartDate())
            .append("actuFiniDate", getActuFiniDate())
            .append("schedule", getSchedule())
            .append("submitDate", getSubmitDate())
            .append("dataSour", getDataSour())
            .append("datasoCreateDate", getDatasoCreateDate())
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
