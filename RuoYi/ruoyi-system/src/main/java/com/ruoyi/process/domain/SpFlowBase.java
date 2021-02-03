package com.ruoyi.process.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础数据维护-流程对象 sp_flow_base
 * 
 * @author 王博
 * @date 2021-01-29
 */
public class SpFlowBase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表id */
    private Long spFlowId;

    /** 流程代号 */
    @Excel(name = "流程代号")
    private String flowNum;

    /** 流程名称 */
    @Excel(name = "流程名称")
    private String flowName;

    /** 线体描述 */
    @Excel(name = "线体描述")
    private String flowDesc;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createUsername;

    /** 最后更新人 */
    @Excel(name = "最后更新人")
    private String updateUsername;

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
    private Long ylint;

    public void setSpFlowId(Long spFlowId) 
    {
        this.spFlowId = spFlowId;
    }

    public Long getSpFlowId() 
    {
        return spFlowId;
    }
    public void setFlowNum(String flowNum) 
    {
        this.flowNum = flowNum;
    }

    public String getFlowNum() 
    {
        return flowNum;
    }
    public void setFlowName(String flowName) 
    {
        this.flowName = flowName;
    }

    public String getFlowName() 
    {
        return flowName;
    }
    public void setFlowDesc(String flowDesc) 
    {
        this.flowDesc = flowDesc;
    }

    public String getFlowDesc() 
    {
        return flowDesc;
    }
    public void setCreateUsername(String createUsername) 
    {
        this.createUsername = createUsername;
    }

    public String getCreateUsername() 
    {
        return createUsername;
    }
    public void setUpdateUsername(String updateUsername) 
    {
        this.updateUsername = updateUsername;
    }

    public String getUpdateUsername() 
    {
        return updateUsername;
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
    public void setYlint(Long ylint) 
    {
        this.ylint = ylint;
    }

    public Long getYlint() 
    {
        return ylint;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("spFlowId", getSpFlowId())
            .append("flowNum", getFlowNum())
            .append("flowName", getFlowName())
            .append("flowDesc", getFlowDesc())
            .append("createTime", getCreateTime())
            .append("createUsername", getCreateUsername())
            .append("updateTime", getUpdateTime())
            .append("updateUsername", getUpdateUsername())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .append("ylint", getYlint())
            .toString();
    }
}
