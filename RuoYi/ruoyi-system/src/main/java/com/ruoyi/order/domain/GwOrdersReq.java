package com.ruoyi.order.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 国网采购订单-请求对象 gw_orders_req
 * 
 * @author wangbo
 * @date 2020-12-08
 */
public class GwOrdersReq extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long nnRequestId;

    /** 采购方总部编码 */
    @Excel(name = "采购方总部编码")
    private String buyerHeadquartersCode;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String vendorCode;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String vendorName;

    /** 合同签订开始日期 */
    @Excel(name = "合同签订开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startContractDate;

    /** 合同签订结束日期 */
    @Excel(name = "合同签订结束日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endContractDate;

    /** 更新时间起 */
    @Excel(name = "更新时间起", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startUpdateTime;

    /** 更新时间起 */
    @Excel(name = "更新时间起", width = 30, dateFormat = "yyyy-MM-dd")
    private Date stopUpdateTime;

    /** 合同编号(国网经法) */
    @Excel(name = "合同编号(国网经法)")
    private String contractNumNn;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String contractNum;

    /** 采购订单编码 */
    @Excel(name = "采购订单编码")
    private String purchaseOrderCode;

    /** 每页条数 */
    @Excel(name = "每页条数")
    private Long numBarsPerPage;

    /** 当前页码 */
    @Excel(name = "当前页码")
    private Long curPageNum;

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

    public void setNnRequestId(Long nnRequestId) 
    {
        this.nnRequestId = nnRequestId;
    }

    public Long getNnRequestId() 
    {
        return nnRequestId;
    }
    public void setBuyerHeadquartersCode(String buyerHeadquartersCode) 
    {
        this.buyerHeadquartersCode = buyerHeadquartersCode;
    }

    public String getBuyerHeadquartersCode() 
    {
        return buyerHeadquartersCode;
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
    public void setStartContractDate(Date startContractDate) 
    {
        this.startContractDate = startContractDate;
    }

    public Date getStartContractDate() 
    {
        return startContractDate;
    }
    public void setEndContractDate(Date endContractDate) 
    {
        this.endContractDate = endContractDate;
    }

    public Date getEndContractDate() 
    {
        return endContractDate;
    }
    public void setStartUpdateTime(Date startUpdateTime) 
    {
        this.startUpdateTime = startUpdateTime;
    }

    public Date getStartUpdateTime() 
    {
        return startUpdateTime;
    }
    public void setStopUpdateTime(Date stopUpdateTime) 
    {
        this.stopUpdateTime = stopUpdateTime;
    }

    public Date getStopUpdateTime() 
    {
        return stopUpdateTime;
    }
    public void setContractNumNn(String contractNumNn) 
    {
        this.contractNumNn = contractNumNn;
    }

    public String getContractNumNn() 
    {
        return contractNumNn;
    }
    public void setContractNum(String contractNum) 
    {
        this.contractNum = contractNum;
    }

    public String getContractNum() 
    {
        return contractNum;
    }
    public void setPurchaseOrderCode(String purchaseOrderCode) 
    {
        this.purchaseOrderCode = purchaseOrderCode;
    }

    public String getPurchaseOrderCode() 
    {
        return purchaseOrderCode;
    }
    public void setNumBarsPerPage(Long numBarsPerPage) 
    {
        this.numBarsPerPage = numBarsPerPage;
    }

    public Long getNumBarsPerPage() 
    {
        return numBarsPerPage;
    }
    public void setCurPageNum(Long curPageNum) 
    {
        this.curPageNum = curPageNum;
    }

    public Long getCurPageNum() 
    {
        return curPageNum;
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
            .append("nnRequestId", getNnRequestId())
            .append("buyerHeadquartersCode", getBuyerHeadquartersCode())
            .append("vendorCode", getVendorCode())
            .append("vendorName", getVendorName())
            .append("startContractDate", getStartContractDate())
            .append("endContractDate", getEndContractDate())
            .append("startUpdateTime", getStartUpdateTime())
            .append("stopUpdateTime", getStopUpdateTime())
            .append("contractNumNn", getContractNumNn())
            .append("contractNum", getContractNum())
            .append("purchaseOrderCode", getPurchaseOrderCode())
            .append("numBarsPerPage", getNumBarsPerPage())
            .append("curPageNum", getCurPageNum())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
