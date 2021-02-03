package com.ruoyi.testdemo.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试时间与人2对象 test_t2
 * 
 * @author wangbo
 * @date 2020-12-29
 */
public class TestT2 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 编码 */
    @Excel(name = "编码")
    private Long biaoId;

    /** 日常 */
    @Excel(name = "日常")
    private String daily;

    /** 备注 */
    @Excel(name = "备注")
    private String beizhu;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBiaoId(Long biaoId) 
    {
        this.biaoId = biaoId;
    }

    public Long getBiaoId() 
    {
        return biaoId;
    }
    public void setDaily(String daily) 
    {
        this.daily = daily;
    }

    public String getDaily() 
    {
        return daily;
    }
    public void setBeizhu(String beizhu) 
    {
        this.beizhu = beizhu;
    }

    public String getBeizhu() 
    {
        return beizhu;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("biaoId", getBiaoId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("daily", getDaily())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("beizhu", getBeizhu())
            .toString();
    }
}
