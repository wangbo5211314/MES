package com.ruoyi.beancodecom.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生产数据来源对象 shanghai1101
 * 
 * @author 王博
 * @date 2021-01-11
 */
public class ActDataSource extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    @Excel(name = "ID")
    private Long id;

    /** 主码 */
    @Excel(name = "主码")
    private String plateName;

    /** 左上角码 */
    @Excel(name = "左上角码")
    private String qrLeft;

    /** 右上角码 */
    @Excel(name = "右上角码")
    private String qrRight;

    /** 截码 */
    @Excel(name = "截码")
    private String plateNum;

    /** 时间 */
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

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
    public void setPlateNum(String plateNum) 
    {
        this.plateNum = plateNum;
    }

    public String getPlateNum() 
    {
        return plateNum;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("plateName", getPlateName())
            .append("qrLeft", getQrLeft())
            .append("qrRight", getQrRight())
            .append("plateNum", getPlateNum())
            .append("date", getDate())
            .toString();
    }
}
