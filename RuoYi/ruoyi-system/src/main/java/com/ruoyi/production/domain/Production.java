package com.ruoyi.production.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 报工信息对象 prdt_report_info
 * 
 * @author wangbo
 * @date 2020-12-10
 */
public class Production extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 报工信息ID */
    private Long repoInfoId;

    /** 采购方总部编码 */
    @Excel(name = "采购方总部编码")
    private String buyerHqCode;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String suplCode;

    /** 生产订单编号 */
    @Excel(name = "生产订单编号")
    private String prdtOrderNum;

    /** 产品内部ID号 */
    @Excel(name = "产品内部ID号")
    private String prdtInsidNum;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private String eqmtNum;

    /** 生产批次号 */
    @Excel(name = "生产批次号")
    private String prdtBatchNum;

    /** 工序名称 */
    @Excel(name = "工序名称")
    private String prcesName;

    /** 品类编码 */
    @Excel(name = "品类编码")
    private String categCode;

    /** 种类编码 */
    @Excel(name = "种类编码")
    private String typeCode;

    /** 工序编码 */
    @Excel(name = "工序编码")
    private String prcesCode;

    /** 生产工艺路线编码 */
    @Excel(name = "生产工艺路线编码")
    private String prdtRouteCode;

    /** 生产车间id */
    @Excel(name = "生产车间id")
    private String prdtShopId;

    /** 生产车间编码 */
    @Excel(name = "生产车间编码")
    private String prdtShopCode;

    /** 生产车间名称 */
    @Excel(name = "生产车间名称")
    private String prdtShopName;

    /** 生产工单编号 */
    @Excel(name = "生产工单编号")
    private String prdtWorderNum;

    /** 实物id */
    @Excel(name = "实物id")
    private String pyscId;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String dataSour;

    /** 来源数据创建时间 */
    @Excel(name = "来源数据创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date sourdataCretTime;

    /** 计划开始时间 */
    @Excel(name = "计划开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planStartTime;

    /** 计划结束时间 */
    @Excel(name = "计划结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planEndTime;

    /** 实际开始时间 */
    @Excel(name = "实际开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actuStartTime;

    /** 实际结束时间 */
    @Excel(name = "实际结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actuEndTime;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String orderStatus;

    /** 客户所属省份 */
    @Excel(name = "客户所属省份")
    private String cstmProvince;

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

    public void setRepoInfoId(Long repoInfoId) 
    {
        this.repoInfoId = repoInfoId;
    }

    public Long getRepoInfoId() 
    {
        return repoInfoId;
    }
    public void setBuyerHqCode(String buyerHqCode) 
    {
        this.buyerHqCode = buyerHqCode;
    }

    public String getBuyerHqCode() 
    {
        return buyerHqCode;
    }
    public void setSuplCode(String suplCode) 
    {
        this.suplCode = suplCode;
    }

    public String getSuplCode() 
    {
        return suplCode;
    }
    public void setPrdtOrderNum(String prdtOrderNum) 
    {
        this.prdtOrderNum = prdtOrderNum;
    }

    public String getPrdtOrderNum() 
    {
        return prdtOrderNum;
    }
    public void setPrdtInsidNum(String prdtInsidNum) 
    {
        this.prdtInsidNum = prdtInsidNum;
    }

    public String getPrdtInsidNum() 
    {
        return prdtInsidNum;
    }
    public void setEqmtNum(String eqmtNum) 
    {
        this.eqmtNum = eqmtNum;
    }

    public String getEqmtNum() 
    {
        return eqmtNum;
    }
    public void setPrdtBatchNum(String prdtBatchNum) 
    {
        this.prdtBatchNum = prdtBatchNum;
    }

    public String getPrdtBatchNum() 
    {
        return prdtBatchNum;
    }
    public void setPrcesName(String prcesName) 
    {
        this.prcesName = prcesName;
    }

    public String getPrcesName() 
    {
        return prcesName;
    }
    public void setCategCode(String categCode) 
    {
        this.categCode = categCode;
    }

    public String getCategCode() 
    {
        return categCode;
    }
    public void setTypeCode(String typeCode) 
    {
        this.typeCode = typeCode;
    }

    public String getTypeCode() 
    {
        return typeCode;
    }
    public void setPrcesCode(String prcesCode) 
    {
        this.prcesCode = prcesCode;
    }

    public String getPrcesCode() 
    {
        return prcesCode;
    }
    public void setPrdtRouteCode(String prdtRouteCode) 
    {
        this.prdtRouteCode = prdtRouteCode;
    }

    public String getPrdtRouteCode() 
    {
        return prdtRouteCode;
    }
    public void setPrdtShopId(String prdtShopId) 
    {
        this.prdtShopId = prdtShopId;
    }

    public String getPrdtShopId() 
    {
        return prdtShopId;
    }
    public void setPrdtShopCode(String prdtShopCode) 
    {
        this.prdtShopCode = prdtShopCode;
    }

    public String getPrdtShopCode() 
    {
        return prdtShopCode;
    }
    public void setPrdtShopName(String prdtShopName) 
    {
        this.prdtShopName = prdtShopName;
    }

    public String getPrdtShopName() 
    {
        return prdtShopName;
    }
    public void setPrdtWorderNum(String prdtWorderNum) 
    {
        this.prdtWorderNum = prdtWorderNum;
    }

    public String getPrdtWorderNum() 
    {
        return prdtWorderNum;
    }
    public void setPyscId(String pyscId) 
    {
        this.pyscId = pyscId;
    }

    public String getPyscId() 
    {
        return pyscId;
    }
    public void setDataSour(String dataSour) 
    {
        this.dataSour = dataSour;
    }

    public String getDataSour() 
    {
        return dataSour;
    }
    public void setSourdataCretTime(Date sourdataCretTime) 
    {
        this.sourdataCretTime = sourdataCretTime;
    }

    public Date getSourdataCretTime() 
    {
        return sourdataCretTime;
    }
    public void setPlanStartTime(Date planStartTime) 
    {
        this.planStartTime = planStartTime;
    }

    public Date getPlanStartTime() 
    {
        return planStartTime;
    }
    public void setPlanEndTime(Date planEndTime) 
    {
        this.planEndTime = planEndTime;
    }

    public Date getPlanEndTime() 
    {
        return planEndTime;
    }
    public void setActuStartTime(Date actuStartTime) 
    {
        this.actuStartTime = actuStartTime;
    }

    public Date getActuStartTime() 
    {
        return actuStartTime;
    }
    public void setActuEndTime(Date actuEndTime) 
    {
        this.actuEndTime = actuEndTime;
    }

    public Date getActuEndTime() 
    {
        return actuEndTime;
    }
    public void setOrderStatus(String orderStatus) 
    {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() 
    {
        return orderStatus;
    }
    public void setCstmProvince(String cstmProvince) 
    {
        this.cstmProvince = cstmProvince;
    }

    public String getCstmProvince() 
    {
        return cstmProvince;
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
            .append("repoInfoId", getRepoInfoId())
            .append("buyerHqCode", getBuyerHqCode())
            .append("suplCode", getSuplCode())
            .append("prdtOrderNum", getPrdtOrderNum())
            .append("prdtInsidNum", getPrdtInsidNum())
            .append("eqmtNum", getEqmtNum())
            .append("prdtBatchNum", getPrdtBatchNum())
            .append("prcesName", getPrcesName())
            .append("categCode", getCategCode())
            .append("typeCode", getTypeCode())
            .append("prcesCode", getPrcesCode())
            .append("prdtRouteCode", getPrdtRouteCode())
            .append("prdtShopId", getPrdtShopId())
            .append("prdtShopCode", getPrdtShopCode())
            .append("prdtShopName", getPrdtShopName())
            .append("prdtWorderNum", getPrdtWorderNum())
            .append("pyscId", getPyscId())
            .append("dataSour", getDataSour())
            .append("sourdataCretTime", getSourdataCretTime())
            .append("planStartTime", getPlanStartTime())
            .append("planEndTime", getPlanEndTime())
            .append("actuStartTime", getActuStartTime())
            .append("actuEndTime", getActuEndTime())
            .append("orderStatus", getOrderStatus())
            .append("cstmProvince", getCstmProvince())
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
