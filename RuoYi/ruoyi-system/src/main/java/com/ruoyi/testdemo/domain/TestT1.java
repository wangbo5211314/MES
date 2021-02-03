package com.ruoyi.testdemo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试时间与人对象 test_t1
 * 
 * @author wangbo
 * @date 2020-12-29
 */
public class TestT1 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long ID;

    /** 日常 */
    @Excel(name = "日常")
    private String daily;

    public void setID(Long ID) 
    {
        this.ID = ID;
    }

    public Long getID() 
    {
        return ID;
    }
    public void setDaily(String daily) 
    {
        this.daily = daily;
    }

    public String getDaily() 
    {
        return daily;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ID", getID())
            .append("updateTime", getUpdateTime())
            .append("updateBy", getUpdateBy())
            .append("daily", getDaily())
            .append("createTime", getCreateTime())
            .append("createBy", getCreateBy())
            .toString();
    }
}
