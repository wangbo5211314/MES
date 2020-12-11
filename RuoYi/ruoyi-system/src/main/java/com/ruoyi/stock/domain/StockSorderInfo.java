package com.ruoyi.stock.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 供货单信息对象 stock_sorder_info
 * 
 * @author wangbo
 * @date 2020-12-10
 */
public class StockSorderInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 供货单信息ID */
    private Long supInfoId;

    /** 采购方总部编码 */
    @Excel(name = "采购方总部编码")
    private String buyerHqCode;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String vendorCode;

    /** 合同类型 */
    @Excel(name = "合同类型")
    private String contType;

    /** 采购供货单编号 */
    @Excel(name = "采购供货单编号")
    private String purcDocuNum;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String contNum;

    /** 合同签订日期 */
    @Excel(name = "合同签订日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date contSignTime;

    /** 工程项目名称 */
    @Excel(name = "工程项目名称")
    private String projectName;

    /** 合同名称 */
    @Excel(name = "合同名称")
    private String contName;

    /** 合同编号(国网经法) */
    @Excel(name = "合同编号(国网经法)")
    private String gwContNum;

    /** 物资大类编号 */
    @Excel(name = "物资大类编号")
    private String mateBigNum;

    /** 物资中类编号 */
    @Excel(name = "物资中类编号")
    private String mateMidNum;

    /** 物资小类编号 */
    @Excel(name = "物资小类编号")
    private String mateSmallNum;

    /** 物资大类名称 */
    @Excel(name = "物资大类名称")
    private String mateBigName;

    /** 物资中类名称 */
    @Excel(name = "物资中类名称")
    private String mateMidName;

    /** 物资小类名称 */
    @Excel(name = "物资小类名称")
    private String mateSmallName;

    /** 货物名称 */
    @Excel(name = "货物名称")
    private String goodsName;

    /** 品类编码 */
    @Excel(name = "品类编码")
    private String cateCode;

    /** 种类编码 */
    @Excel(name = "种类编码")
    private String kindCode;

    /** 采购方公司名称 */
    @Excel(name = "采购方公司名称")
    private String purcCompName;

    /** 采购方公司编码 */
    @Excel(name = "采购方公司编码")
    private String purcCompCode;

    /** 供货单项目号 */
    @Excel(name = "供货单项目号")
    private String supItemNum;

    /** 供货单行项目收货方公司名称 */
    @Excel(name = "供货单行项目收货方公司名称")
    private String sitemAcptName;

    /** 供货单行项目供应商侧物料编码 */
    @Excel(name = "供货单行项目供应商侧物料编码")
    private String sitemVmateCode;

    /** 供货单行项目物料描述 */
    @Excel(name = "供货单行项目物料描述")
    private String sitemMateDesc;

    /** 供货单行项目国网侧物料编码 */
    @Excel(name = "供货单行项目国网侧物料编码")
    private String sitemGwmtCode;

    /** 供货单行项目国网侧物料描述 */
    @Excel(name = "供货单行项目国网侧物料描述")
    private String sitemGwmtDesc;

    /** 供货单行项目采购数量 */
    @Excel(name = "供货单行项目采购数量")
    private Long sitemBuyNum;

    /** 供货单行项目计量单位 */
    @Excel(name = "供货单行项目计量单位")
    private String sitemUnits;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String dataSour;

    /** 来源数据创建时间 */
    @Excel(name = "来源数据创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dsourCreaTime;

    /** 备注 */
    @Excel(name = "备注")
    private String note;

    /** 数据拥有方 */
    @Excel(name = "数据拥有方")
    private String dataOwner;

    /** 数据可见方 */
    @Excel(name = "数据可见方")
    private String dataVisi;

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

    public void setSupInfoId(Long supInfoId) 
    {
        this.supInfoId = supInfoId;
    }

    public Long getSupInfoId() 
    {
        return supInfoId;
    }
    public void setBuyerHqCode(String buyerHqCode) 
    {
        this.buyerHqCode = buyerHqCode;
    }

    public String getBuyerHqCode() 
    {
        return buyerHqCode;
    }
    public void setVendorCode(String vendorCode) 
    {
        this.vendorCode = vendorCode;
    }

    public String getVendorCode() 
    {
        return vendorCode;
    }
    public void setContType(String contType) 
    {
        this.contType = contType;
    }

    public String getContType() 
    {
        return contType;
    }
    public void setPurcDocuNum(String purcDocuNum) 
    {
        this.purcDocuNum = purcDocuNum;
    }

    public String getPurcDocuNum() 
    {
        return purcDocuNum;
    }
    public void setContNum(String contNum) 
    {
        this.contNum = contNum;
    }

    public String getContNum() 
    {
        return contNum;
    }
    public void setContSignTime(Date contSignTime) 
    {
        this.contSignTime = contSignTime;
    }

    public Date getContSignTime() 
    {
        return contSignTime;
    }
    public void setProjectName(String projectName) 
    {
        this.projectName = projectName;
    }

    public String getProjectName() 
    {
        return projectName;
    }
    public void setContName(String contName) 
    {
        this.contName = contName;
    }

    public String getContName() 
    {
        return contName;
    }
    public void setGwContNum(String gwContNum) 
    {
        this.gwContNum = gwContNum;
    }

    public String getGwContNum() 
    {
        return gwContNum;
    }
    public void setMateBigNum(String mateBigNum) 
    {
        this.mateBigNum = mateBigNum;
    }

    public String getMateBigNum() 
    {
        return mateBigNum;
    }
    public void setMateMidNum(String mateMidNum) 
    {
        this.mateMidNum = mateMidNum;
    }

    public String getMateMidNum() 
    {
        return mateMidNum;
    }
    public void setMateSmallNum(String mateSmallNum) 
    {
        this.mateSmallNum = mateSmallNum;
    }

    public String getMateSmallNum() 
    {
        return mateSmallNum;
    }
    public void setMateBigName(String mateBigName) 
    {
        this.mateBigName = mateBigName;
    }

    public String getMateBigName() 
    {
        return mateBigName;
    }
    public void setMateMidName(String mateMidName) 
    {
        this.mateMidName = mateMidName;
    }

    public String getMateMidName() 
    {
        return mateMidName;
    }
    public void setMateSmallName(String mateSmallName) 
    {
        this.mateSmallName = mateSmallName;
    }

    public String getMateSmallName() 
    {
        return mateSmallName;
    }
    public void setGoodsName(String goodsName) 
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName() 
    {
        return goodsName;
    }
    public void setCateCode(String cateCode) 
    {
        this.cateCode = cateCode;
    }

    public String getCateCode() 
    {
        return cateCode;
    }
    public void setKindCode(String kindCode) 
    {
        this.kindCode = kindCode;
    }

    public String getKindCode() 
    {
        return kindCode;
    }
    public void setPurcCompName(String purcCompName) 
    {
        this.purcCompName = purcCompName;
    }

    public String getPurcCompName() 
    {
        return purcCompName;
    }
    public void setPurcCompCode(String purcCompCode) 
    {
        this.purcCompCode = purcCompCode;
    }

    public String getPurcCompCode() 
    {
        return purcCompCode;
    }
    public void setSupItemNum(String supItemNum) 
    {
        this.supItemNum = supItemNum;
    }

    public String getSupItemNum() 
    {
        return supItemNum;
    }
    public void setSitemAcptName(String sitemAcptName) 
    {
        this.sitemAcptName = sitemAcptName;
    }

    public String getSitemAcptName() 
    {
        return sitemAcptName;
    }
    public void setSitemVmateCode(String sitemVmateCode) 
    {
        this.sitemVmateCode = sitemVmateCode;
    }

    public String getSitemVmateCode() 
    {
        return sitemVmateCode;
    }
    public void setSitemMateDesc(String sitemMateDesc) 
    {
        this.sitemMateDesc = sitemMateDesc;
    }

    public String getSitemMateDesc() 
    {
        return sitemMateDesc;
    }
    public void setSitemGwmtCode(String sitemGwmtCode) 
    {
        this.sitemGwmtCode = sitemGwmtCode;
    }

    public String getSitemGwmtCode() 
    {
        return sitemGwmtCode;
    }
    public void setSitemGwmtDesc(String sitemGwmtDesc) 
    {
        this.sitemGwmtDesc = sitemGwmtDesc;
    }

    public String getSitemGwmtDesc() 
    {
        return sitemGwmtDesc;
    }
    public void setSitemBuyNum(Long sitemBuyNum) 
    {
        this.sitemBuyNum = sitemBuyNum;
    }

    public Long getSitemBuyNum() 
    {
        return sitemBuyNum;
    }
    public void setSitemUnits(String sitemUnits) 
    {
        this.sitemUnits = sitemUnits;
    }

    public String getSitemUnits() 
    {
        return sitemUnits;
    }
    public void setDataSour(String dataSour) 
    {
        this.dataSour = dataSour;
    }

    public String getDataSour() 
    {
        return dataSour;
    }
    public void setDsourCreaTime(Date dsourCreaTime) 
    {
        this.dsourCreaTime = dsourCreaTime;
    }

    public Date getDsourCreaTime() 
    {
        return dsourCreaTime;
    }
    public void setNote(String note) 
    {
        this.note = note;
    }

    public String getNote() 
    {
        return note;
    }
    public void setDataOwner(String dataOwner) 
    {
        this.dataOwner = dataOwner;
    }

    public String getDataOwner() 
    {
        return dataOwner;
    }
    public void setDataVisi(String dataVisi) 
    {
        this.dataVisi = dataVisi;
    }

    public String getDataVisi() 
    {
        return dataVisi;
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
            .append("supInfoId", getSupInfoId())
            .append("buyerHqCode", getBuyerHqCode())
            .append("vendorCode", getVendorCode())
            .append("contType", getContType())
            .append("purcDocuNum", getPurcDocuNum())
            .append("contNum", getContNum())
            .append("contSignTime", getContSignTime())
            .append("projectName", getProjectName())
            .append("contName", getContName())
            .append("gwContNum", getGwContNum())
            .append("mateBigNum", getMateBigNum())
            .append("mateMidNum", getMateMidNum())
            .append("mateSmallNum", getMateSmallNum())
            .append("mateBigName", getMateBigName())
            .append("mateMidName", getMateMidName())
            .append("mateSmallName", getMateSmallName())
            .append("goodsName", getGoodsName())
            .append("cateCode", getCateCode())
            .append("kindCode", getKindCode())
            .append("purcCompName", getPurcCompName())
            .append("purcCompCode", getPurcCompCode())
            .append("supItemNum", getSupItemNum())
            .append("sitemAcptName", getSitemAcptName())
            .append("sitemVmateCode", getSitemVmateCode())
            .append("sitemMateDesc", getSitemMateDesc())
            .append("sitemGwmtCode", getSitemGwmtCode())
            .append("sitemGwmtDesc", getSitemGwmtDesc())
            .append("sitemBuyNum", getSitemBuyNum())
            .append("sitemUnits", getSitemUnits())
            .append("dataSour", getDataSour())
            .append("dsourCreaTime", getDsourCreaTime())
            .append("note", getNote())
            .append("dataOwner", getDataOwner())
            .append("dataVisi", getDataVisi())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
