package com.ruoyi.jcfinprdt.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 成品检测对象 jc_fin_prdt
 * 
 * @author 王博
 * @date 2021-01-28
 */
public class JcFinPrdt extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表id */
    private Long cpjcbId;

    /** 成品检测编号 */
    @Excel(name = "成品检测编号")
    private String cpjcNum;

    /** 成品检测名称 */
    @Excel(name = "成品检测名称")
    private String cpjcName;

    /** 成品编号 */
    @Excel(name = "成品编号")
    private String cpNum;

    /** 成品名称 */
    @Excel(name = "成品名称")
    private String cpName;

    /** 销售订单编号 */
    @Excel(name = "销售订单编号")
    private String saleOrderNum;

    /** 销售订单名称 */
    @Excel(name = "销售订单名称")
    private String saleOrderName;

    /** 排产单编号 */
    @Excel(name = "排产单编号")
    private String pcdNum;

    /** 排产单名称 */
    @Excel(name = "排产单名称")
    private String pcdName;

    /** 不良品原因 */
    @Excel(name = "不良品原因")
    private String badPrdtName;

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

    /** 预留int */
    @Excel(name = "预留int")
    private Long ylint1;

    /** 预留int */
    @Excel(name = "预留int")
    private Long ylint2;

    public void setCpjcbId(Long cpjcbId) 
    {
        this.cpjcbId = cpjcbId;
    }

    public Long getCpjcbId() 
    {
        return cpjcbId;
    }
    public void setCpjcNum(String cpjcNum) 
    {
        this.cpjcNum = cpjcNum;
    }

    public String getCpjcNum() 
    {
        return cpjcNum;
    }
    public void setCpjcName(String cpjcName) 
    {
        this.cpjcName = cpjcName;
    }

    public String getCpjcName() 
    {
        return cpjcName;
    }
    public void setCpNum(String cpNum) 
    {
        this.cpNum = cpNum;
    }

    public String getCpNum() 
    {
        return cpNum;
    }
    public void setCpName(String cpName) 
    {
        this.cpName = cpName;
    }

    public String getCpName() 
    {
        return cpName;
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
    public void setPcdNum(String pcdNum) 
    {
        this.pcdNum = pcdNum;
    }

    public String getPcdNum() 
    {
        return pcdNum;
    }
    public void setPcdName(String pcdName) 
    {
        this.pcdName = pcdName;
    }

    public String getPcdName() 
    {
        return pcdName;
    }
    public void setBadPrdtName(String badPrdtName) 
    {
        this.badPrdtName = badPrdtName;
    }

    public String getBadPrdtName() 
    {
        return badPrdtName;
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
    public void setYlint1(Long ylint1) 
    {
        this.ylint1 = ylint1;
    }

    public Long getYlint1() 
    {
        return ylint1;
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
            .append("cpjcbId", getCpjcbId())
            .append("cpjcNum", getCpjcNum())
            .append("cpjcName", getCpjcName())
            .append("cpNum", getCpNum())
            .append("cpName", getCpName())
            .append("saleOrderNum", getSaleOrderNum())
            .append("saleOrderName", getSaleOrderName())
            .append("pcdNum", getPcdNum())
            .append("pcdName", getPcdName())
            .append("badPrdtName", getBadPrdtName())
            .append("note", getNote())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .append("ylint1", getYlint1())
            .append("ylint2", getYlint2())
            .toString();
    }
}
