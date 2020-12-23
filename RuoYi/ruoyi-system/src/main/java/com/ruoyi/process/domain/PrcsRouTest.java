package com.ruoyi.process.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工艺路线管理测试对象 sp_flow
 * 
 * @author wangbo
 * @date 2020-12-23
 */
public class PrcsRouTest extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long spFlowId;

    /** 流程代号 */
    @Excel(name = "流程代号")
    private String flow;

    /** 线体描述 */
    @Excel(name = "线体描述")
    private String flowDesc;

    /** 流程绘制 */
    @Excel(name = "流程绘制")
    private String process;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createUsername;

    /** 最后更新人 */
    @Excel(name = "最后更新人")
    private String updateUsername;

    public void setSpFlowId(Long spFlowId) 
    {
        this.spFlowId = spFlowId;
    }

    public Long getSpFlowId() 
    {
        return spFlowId;
    }
    public void setFlow(String flow) 
    {
        this.flow = flow;
    }

    public String getFlow() 
    {
        return flow;
    }
    public void setFlowDesc(String flowDesc) 
    {
        this.flowDesc = flowDesc;
    }

    public String getFlowDesc() 
    {
        return flowDesc;
    }
    public void setProcess(String process) 
    {
        this.process = process;
    }

    public String getProcess() 
    {
        return process;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("spFlowId", getSpFlowId())
            .append("flow", getFlow())
            .append("flowDesc", getFlowDesc())
            .append("process", getProcess())
            .append("createTime", getCreateTime())
            .append("createUsername", getCreateUsername())
            .append("updateTime", getUpdateTime())
            .append("updateUsername", getUpdateUsername())
            .toString();
    }
}
