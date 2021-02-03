package com.ruoyi.beancodecom.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 豆码比对对象 bean_code_jf
 * 
 * @author 王博
 * @date 2021-01-04
 */
public class BeanCode extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 局方ID */

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

    /** 预留 */
   /* @Excel(name = "预留")*/
    private String yl;

    /** 预留2 */
    /*@Excel(name = "预留2")*/
    private String yl2;

    /** 预留3 */
    /*@Excel(name = "预留3")*/
    private String yl3;

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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("plateName", getPlateName())
            .append("qrLeft", getQrLeft())
            .append("qrRight", getQrRight())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .toString();
    }
}
