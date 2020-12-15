package com.ruoyi.jiance.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 耐压对象 t_detect_volt_result
 * 
 * @author wangbo
 * @date 2020-12-15
 */
public class DetectVoltResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 耐压结论表ID */
    private Long id;

    /** 检定任务编号 */
    @Excel(name = "检定任务编号")
    private String taskId;

    /** 装置号 */
    @Excel(name = "装置号")
    private String device;

    /** 表号 */
    @Excel(name = "表号")
    private String barcode;

    /** 工位号 */
    @Excel(name = "工位号")
    private String gw;

    /** 结论 */
    @Excel(name = "结论")
    private String result;

    /** 不合格原因 */
    @Excel(name = "不合格原因")
    private String veryReason;

    /** 检测日期 */
    @Excel(name = "检测日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date chkDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTaskId(String taskId) 
    {
        this.taskId = taskId;
    }

    public String getTaskId() 
    {
        return taskId;
    }
    public void setDevice(String device) 
    {
        this.device = device;
    }

    public String getDevice() 
    {
        return device;
    }
    public void setBarcode(String barcode) 
    {
        this.barcode = barcode;
    }

    public String getBarcode() 
    {
        return barcode;
    }
    public void setGw(String gw) 
    {
        this.gw = gw;
    }

    public String getGw() 
    {
        return gw;
    }
    public void setResult(String result) 
    {
        this.result = result;
    }

    public String getResult() 
    {
        return result;
    }
    public void setVeryReason(String veryReason) 
    {
        this.veryReason = veryReason;
    }

    public String getVeryReason() 
    {
        return veryReason;
    }
    public void setChkDate(Date chkDate) 
    {
        this.chkDate = chkDate;
    }

    public Date getChkDate() 
    {
        return chkDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("taskId", getTaskId())
            .append("device", getDevice())
            .append("barcode", getBarcode())
            .append("gw", getGw())
            .append("result", getResult())
            .append("veryReason", getVeryReason())
            .append("chkDate", getChkDate())
            .toString();
    }
}
