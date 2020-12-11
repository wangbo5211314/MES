package com.ruoyi.rawmate.domain;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 电池对象 raw_mate_battery
 * 
 * @author wangbo
 * @date 2020-12-11
 */
public class RawMateBattery extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 电池ID */
    private Long batteryId;

    /** 采集规范版本号 */
    @Excel(name = "采集规范版本号")
    private String cletNormVers;

    /** 生产订单编号 */
    @Excel(name = "生产订单编号")
    private String prdtOrderNum;

    /** 工单编号 */
    @Excel(name = "工单编号")
    private String listNum;

    /** 检验数据编号 */
    @Excel(name = "检验数据编号")
    private String testDataNum;

    /** 检验时间 */
    @Excel(name = "检验时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date testTime;

    /** 创建时间/抓取时间 */
    @Excel(name = "创建时间/抓取时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cretTime;

    /** 原材料制造商 */
    @Excel(name = "原材料制造商")
    private String mateMaker;

    /** 规格型号 */
    @Excel(name = "规格型号")
    private String specsType;

    /** 下限值 */
    @Excel(name = "下限值")
    private Long lowLimit;

    /** 上限值 */
    @Excel(name = "上限值")
    private Long upLimit;

    /** 工序编码 */
    @Excel(name = "工序编码")
    private String procCode;

    /** 电压值(V) */
    @Excel(name = "电压值(V)")
    private BigDecimal voltageValue;

    /** 电池检测结论 */
    @Excel(name = "电池检测结论")
    private String dcTestResult;

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

    public void setBatteryId(Long batteryId) 
    {
        this.batteryId = batteryId;
    }

    public Long getBatteryId() 
    {
        return batteryId;
    }
    public void setCletNormVers(String cletNormVers) 
    {
        this.cletNormVers = cletNormVers;
    }

    public String getCletNormVers() 
    {
        return cletNormVers;
    }
    public void setPrdtOrderNum(String prdtOrderNum) 
    {
        this.prdtOrderNum = prdtOrderNum;
    }

    public String getPrdtOrderNum() 
    {
        return prdtOrderNum;
    }
    public void setListNum(String listNum) 
    {
        this.listNum = listNum;
    }

    public String getListNum() 
    {
        return listNum;
    }
    public void setTestDataNum(String testDataNum) 
    {
        this.testDataNum = testDataNum;
    }

    public String getTestDataNum() 
    {
        return testDataNum;
    }
    public void setTestTime(Date testTime) 
    {
        this.testTime = testTime;
    }

    public Date getTestTime() 
    {
        return testTime;
    }
    public void setCretTime(Date cretTime) 
    {
        this.cretTime = cretTime;
    }

    public Date getCretTime() 
    {
        return cretTime;
    }
    public void setMateMaker(String mateMaker) 
    {
        this.mateMaker = mateMaker;
    }

    public String getMateMaker() 
    {
        return mateMaker;
    }
    public void setSpecsType(String specsType) 
    {
        this.specsType = specsType;
    }

    public String getSpecsType() 
    {
        return specsType;
    }
    public void setLowLimit(Long lowLimit) 
    {
        this.lowLimit = lowLimit;
    }

    public Long getLowLimit() 
    {
        return lowLimit;
    }
    public void setUpLimit(Long upLimit) 
    {
        this.upLimit = upLimit;
    }

    public Long getUpLimit() 
    {
        return upLimit;
    }
    public void setProcCode(String procCode) 
    {
        this.procCode = procCode;
    }

    public String getProcCode() 
    {
        return procCode;
    }
    public void setVoltageValue(BigDecimal voltageValue) 
    {
        this.voltageValue = voltageValue;
    }

    public BigDecimal getVoltageValue() 
    {
        return voltageValue;
    }
    public void setDcTestResult(String dcTestResult) 
    {
        this.dcTestResult = dcTestResult;
    }

    public String getDcTestResult() 
    {
        return dcTestResult;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("batteryId", getBatteryId())
            .append("cletNormVers", getCletNormVers())
            .append("prdtOrderNum", getPrdtOrderNum())
            .append("listNum", getListNum())
            .append("testDataNum", getTestDataNum())
            .append("testTime", getTestTime())
            .append("cretTime", getCretTime())
            .append("mateMaker", getMateMaker())
            .append("specsType", getSpecsType())
            .append("lowLimit", getLowLimit())
            .append("upLimit", getUpLimit())
            .append("procCode", getProcCode())
            .append("voltageValue", getVoltageValue())
            .append("dcTestResult", getDcTestResult())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
