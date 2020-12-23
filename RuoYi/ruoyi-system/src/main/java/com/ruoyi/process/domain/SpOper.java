package com.ruoyi.process.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础数据维护-工序对象 sp_oper
 * 
 * @author wangbo
 * @date 2020-12-23
 */
public class SpOper extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long spOperId;

    /** 工序代码 */
    @Excel(name = "工序代码")
    private String oper;

    /** 工序描述 */
    @Excel(name = "工序描述")
    private String operDesc;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createUsername;

    /** 最后更新人 */
    @Excel(name = "最后更新人")
    private String updateUsername;

    public void setSpOperId(Long spOperId) 
    {
        this.spOperId = spOperId;
    }

    public Long getSpOperId() 
    {
        return spOperId;
    }
    public void setOper(String oper) 
    {
        this.oper = oper;
    }

    public String getOper() 
    {
        return oper;
    }
    public void setOperDesc(String operDesc) 
    {
        this.operDesc = operDesc;
    }

    public String getOperDesc() 
    {
        return operDesc;
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
            .append("spOperId", getSpOperId())
            .append("oper", getOper())
            .append("operDesc", getOperDesc())
            .append("createTime", getCreateTime())
            .append("createUsername", getCreateUsername())
            .append("updateTime", getUpdateTime())
            .append("updateUsername", getUpdateUsername())
            .toString();
    }
}
