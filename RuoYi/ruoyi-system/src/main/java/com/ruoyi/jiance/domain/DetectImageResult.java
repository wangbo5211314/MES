package com.ruoyi.jiance.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 图像结论表对象 t_detect_image_result
 * 
 * @author wangbo
 * @date 2020-12-15
 */
public class DetectImageResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 图像结论表ID */
    private Long id;

    /** 任务号 */
    @Excel(name = "任务号")
    private String taskId;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private String device;

    /** 条码 */
    @Excel(name = "条码")
    private String barcode;

    /** 工位 */
    @Excel(name = "工位")
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

    /** 图片路径 */
    @Excel(name = "图片路径")
    private String imagepath;

    /** 读取标志 */
    @Excel(name = "读取标志")
    private String readFlag;

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
    public void setImagepath(String imagepath) 
    {
        this.imagepath = imagepath;
    }

    public String getImagepath() 
    {
        return imagepath;
    }
    public void setReadFlag(String readFlag) 
    {
        this.readFlag = readFlag;
    }

    public String getReadFlag() 
    {
        return readFlag;
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
            .append("imagepath", getImagepath())
            .append("readFlag", getReadFlag())
            .toString();
    }
}
