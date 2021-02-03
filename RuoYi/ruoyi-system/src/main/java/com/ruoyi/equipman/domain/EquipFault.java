package com.ruoyi.equipman.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备故障管理对象 equip_fault
 * 
 * @author 王博
 * @date 2021-01-28
 */
public class EquipFault extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 表id */
    private Long sbgzbId;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private String equipNum;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String equipName;

    /** 设备厂家 */
    @Excel(name = "设备厂家")
    private String equipCj;

    /** 故障原因 */
    @Excel(name = "故障原因")
    private String faultReason;

    /** 故障开始时间 */
    @Excel(name = "故障开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date faultStartTime;

    /** 维修结束时间 */
    @Excel(name = "维修结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date repairEndTime;

    /** 维修人 */
    @Excel(name = "维修人")
    private String repairBy;

    /** 备注 */
    @Excel(name = "备注")
    private String note;

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

    public void setSbgzbId(Long sbgzbId) 
    {
        this.sbgzbId = sbgzbId;
    }

    public Long getSbgzbId() 
    {
        return sbgzbId;
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
    public void setFaultReason(String faultReason) 
    {
        this.faultReason = faultReason;
    }

    public String getFaultReason() 
    {
        return faultReason;
    }
    public void setFaultStartTime(Date faultStartTime) 
    {
        this.faultStartTime = faultStartTime;
    }

    public Date getFaultStartTime() 
    {
        return faultStartTime;
    }
    public void setRepairEndTime(Date repairEndTime) 
    {
        this.repairEndTime = repairEndTime;
    }

    public Date getRepairEndTime() 
    {
        return repairEndTime;
    }
    public void setRepairBy(String repairBy) 
    {
        this.repairBy = repairBy;
    }

    public String getRepairBy() 
    {
        return repairBy;
    }
    public void setNote(String note) 
    {
        this.note = note;
    }

    public String getNote() 
    {
        return note;
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
            .append("sbgzbId", getSbgzbId())
            .append("equipNum", getEquipNum())
            .append("equipName", getEquipName())
            .append("equipCj", getEquipCj())
            .append("faultReason", getFaultReason())
            .append("faultStartTime", getFaultStartTime())
            .append("repairEndTime", getRepairEndTime())
            .append("repairBy", getRepairBy())
            .append("note", getNote())
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
