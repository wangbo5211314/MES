package com.ruoyi.equipman.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备日常维护对象 equip_daily
 * 
 * @author 王博
 * @date 2021-01-28
 */
public class EquipDaily extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表id */
    private Long sbrcwhbId;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private String equipNum;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String equipName;

    /** 设备厂家 */
    @Excel(name = "设备厂家")
    private String equipCj;

    /** 设备状态 */
    @Excel(name = "设备状态")
    private String equipStatus;

    /** 设备开机时间 */
    @Excel(name = "设备开机时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date openTime;

    /** 设备关机时间 */
    @Excel(name = "设备关机时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date closeTime;

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

    public void setSbrcwhbId(Long sbrcwhbId) 
    {
        this.sbrcwhbId = sbrcwhbId;
    }

    public Long getSbrcwhbId() 
    {
        return sbrcwhbId;
    }
    public void setEquipNum(String equipNum) 
    {
        this.equipNum = equipNum;
    }

    public String getEquipNum() 
    {
        return equipNum;
    }
    public void setEquipName(String equipName) 
    {
        this.equipName = equipName;
    }

    public String getEquipName() 
    {
        return equipName;
    }
    public void setEquipCj(String equipCj) 
    {
        this.equipCj = equipCj;
    }

    public String getEquipCj() 
    {
        return equipCj;
    }
    public void setEquipStatus(String equipStatus) 
    {
        this.equipStatus = equipStatus;
    }

    public String getEquipStatus() 
    {
        return equipStatus;
    }
    public void setOpenTime(Date openTime) 
    {
        this.openTime = openTime;
    }

    public Date getOpenTime() 
    {
        return openTime;
    }
    public void setCloseTime(Date closeTime) 
    {
        this.closeTime = closeTime;
    }

    public Date getCloseTime() 
    {
        return closeTime;
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
            .append("sbrcwhbId", getSbrcwhbId())
            .append("equipNum", getEquipNum())
            .append("equipName", getEquipName())
            .append("equipCj", getEquipCj())
            .append("equipStatus", getEquipStatus())
            .append("openTime", getOpenTime())
            .append("closeTime", getCloseTime())
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
