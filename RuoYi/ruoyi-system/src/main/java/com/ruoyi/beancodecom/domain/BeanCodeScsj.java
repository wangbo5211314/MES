package com.ruoyi.beancodecom.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生产数据豆码对象 bean_code_scsj
 * 
 * @author 王博
 * @date 2021-01-04
 */
public class BeanCodeScsj extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 生产数据ID */
    @Excel(name = "id")
    private Long id;

    /** 名称 */
    @Excel(name = "plateName")
    private String plateName;

    /** 右码 */
    @Excel(name = "qrLeft")
    private String qrLeft;

    /** 左码 */
    @Excel(name = "qrRight")
    private String qrRight;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPlateName(String plateName) 
    {
        this.plateName = plateName;
    }

    public String getPlateName() 
    {
        return plateName;
    }
    public void setQrLeft(String qrLeft) 
    {
        this.qrLeft = qrLeft;
    }

    public String getQrLeft() 
    {
        return qrLeft;
    }
    public void setQrRight(String qrRight) 
    {
        this.qrRight = qrRight;
    }

    public String getQrRight() 
    {
        return qrRight;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("plateName", getPlateName())
            .append("qrLeft", getQrLeft())
            .append("qrRight", getQrRight())
            .toString();
    }
}
