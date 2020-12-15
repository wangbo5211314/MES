package com.ruoyi.company.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 公司管理对象 company
 * 
 * @author wangbo
 * @date 2020-12-14
 */
public class CompanyManage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 公司ID */
    private Long compId;

    /** 公司父ID */
    @Excel(name = "公司父ID")
    private Long compParentId;

    /** 公司编码 */
    @Excel(name = "公司编码")
    private String compCode;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String compTel;

    /** 公司名称 */
    @Excel(name = "公司名称")
    private String compName;

    /** 公司地址 */
    @Excel(name = "公司地址")
    private String compAddress;

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

    public void setCompId(Long compId) 
    {
        this.compId = compId;
    }

    public Long getCompId() 
    {
        return compId;
    }
    public void setCompParentId(Long compParentId) 
    {
        this.compParentId = compParentId;
    }

    public Long getCompParentId() 
    {
        return compParentId;
    }
    public void setCompCode(String compCode) 
    {
        this.compCode = compCode;
    }

    public String getCompCode() 
    {
        return compCode;
    }
    public void setCompTel(String compTel) 
    {
        this.compTel = compTel;
    }

    public String getCompTel() 
    {
        return compTel;
    }
    public void setCompName(String compName) 
    {
        this.compName = compName;
    }

    public String getCompName() 
    {
        return compName;
    }
    public void setCompAddress(String compAddress) 
    {
        this.compAddress = compAddress;
    }

    public String getCompAddress() 
    {
        return compAddress;
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
            .append("compId", getCompId())
            .append("compParentId", getCompParentId())
            .append("compCode", getCompCode())
            .append("compTel", getCompTel())
            .append("compName", getCompName())
            .append("compAddress", getCompAddress())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
