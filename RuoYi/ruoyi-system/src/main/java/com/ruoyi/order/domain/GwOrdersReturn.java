package com.ruoyi.order.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 国网采购订单-返回对象 gw_orders_return
 * 
 * @author wangbo
 * @date 2020-12-08
 */
public class GwOrdersReturn extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long nnReturnId;

    /** 采购订单编码 */
    @Excel(name = "采购订单编码")
    private String purchaseOrderCode;

    /** 采购订单行项目号 */
    @Excel(name = "采购订单行项目号")
    private String purchaseOrderItemNum;

    /** 采购订单行项目id */
    @Excel(name = "采购订单行项目id")
    private String purchaseOrderItemId;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String contractNum;

    /** 合同名称 */
    @Excel(name = "合同名称")
    private String contractName;

    /** 采购方公司名称 */
    @Excel(name = "采购方公司名称")
    private String purchaserCompanyName;

    /** 采购方公司编码 */
    @Excel(name = "采购方公司编码")
    private String purchaserCompanyCode;

    /** 采购方物料编码 */
    @Excel(name = "采购方物料编码")
    private String purchaserMaterialCode;

    /** 采购方物料描述 */
    @Excel(name = "采购方物料描述")
    private String purchaserMaterialDescrip;

    /** 采购数量 */
    @Excel(name = "采购数量")
    private Long purchaseNum;

    /** 合同编号(国网经法) */
    @Excel(name = "合同编号(国网经法)")
    private String contractNumNn;

    /** 技术规范流水号 */
    @Excel(name = "技术规范流水号")
    private String technicalFlowNum;

    /** 合同签订日期 */
    @Excel(name = "合同签订日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date contractSignedDate;

    /** 合同类型 */
    @Excel(name = "合同类型")
    private String contractType;

    /** 项目编号 */
    @Excel(name = "项目编号")
    private String itemNum;

    /** 工程项目名称 */
    @Excel(name = "工程项目名称")
    private String projectName;

    /** 物资编码 */
    @Excel(name = "物资编码")
    private String materialCode;

    /** 采购技术固化ID */
    @Excel(name = "采购技术固化ID")
    private String purchaseTecCuringId;

    /** 合同包号 */
    @Excel(name = "合同包号")
    private String contractPackageNum;

    /** 招标批次号 */
    @Excel(name = "招标批次号")
    private String tenderNum;

    /** 固化ID描述 */
    @Excel(name = "固化ID描述")
    private String curingidDescrip;

    /** 物资大类编码 */
    @Excel(name = "物资大类编码")
    private String materialBigCode;

    /** 物资中类编码 */
    @Excel(name = "物资中类编码")
    private String materialMidCode;

    /** 物资小类编码 */
    @Excel(name = "物资小类编码")
    private String materialSmallCode;

    /** 物资大类名称 */
    @Excel(name = "物资大类名称")
    private String materialBigName;

    /** 物资中类名称 */
    @Excel(name = "物资中类名称")
    private String materialMidName;

    /** 物资小类名称 */
    @Excel(name = "物资小类名称")
    private String materialSmallName;

    /** 每页条数 */
    @Excel(name = "每页条数")
    private Long numBarsPerPage;

    /** 当前页码 */
    @Excel(name = "当前页码")
    private Long curPageNum;

    /** 页数 */
    @Excel(name = "页数")
    private Long pageNum;

    /** 总记录数 */
    @Excel(name = "总记录数")
    private Long allRecordNum;

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

    public void setNnReturnId(Long nnReturnId) 
    {
        this.nnReturnId = nnReturnId;
    }

    public Long getNnReturnId() 
    {
        return nnReturnId;
    }
    public void setPurchaseOrderCode(String purchaseOrderCode) 
    {
        this.purchaseOrderCode = purchaseOrderCode;
    }

    public String getPurchaseOrderCode() 
    {
        return purchaseOrderCode;
    }
    public void setPurchaseOrderItemNum(String purchaseOrderItemNum) 
    {
        this.purchaseOrderItemNum = purchaseOrderItemNum;
    }

    public String getPurchaseOrderItemNum() 
    {
        return purchaseOrderItemNum;
    }
    public void setPurchaseOrderItemId(String purchaseOrderItemId) 
    {
        this.purchaseOrderItemId = purchaseOrderItemId;
    }

    public String getPurchaseOrderItemId() 
    {
        return purchaseOrderItemId;
    }
    public void setContractNum(String contractNum) 
    {
        this.contractNum = contractNum;
    }

    public String getContractNum() 
    {
        return contractNum;
    }
    public void setContractName(String contractName) 
    {
        this.contractName = contractName;
    }

    public String getContractName() 
    {
        return contractName;
    }
    public void setPurchaserCompanyName(String purchaserCompanyName) 
    {
        this.purchaserCompanyName = purchaserCompanyName;
    }

    public String getPurchaserCompanyName() 
    {
        return purchaserCompanyName;
    }
    public void setPurchaserCompanyCode(String purchaserCompanyCode) 
    {
        this.purchaserCompanyCode = purchaserCompanyCode;
    }

    public String getPurchaserCompanyCode() 
    {
        return purchaserCompanyCode;
    }
    public void setPurchaserMaterialCode(String purchaserMaterialCode) 
    {
        this.purchaserMaterialCode = purchaserMaterialCode;
    }

    public String getPurchaserMaterialCode() 
    {
        return purchaserMaterialCode;
    }
    public void setPurchaserMaterialDescrip(String purchaserMaterialDescrip) 
    {
        this.purchaserMaterialDescrip = purchaserMaterialDescrip;
    }

    public String getPurchaserMaterialDescrip() 
    {
        return purchaserMaterialDescrip;
    }
    public void setPurchaseNum(Long purchaseNum) 
    {
        this.purchaseNum = purchaseNum;
    }

    public Long getPurchaseNum() 
    {
        return purchaseNum;
    }
    public void setContractNumNn(String contractNumNn) 
    {
        this.contractNumNn = contractNumNn;
    }

    public String getContractNumNn() 
    {
        return contractNumNn;
    }
    public void setTechnicalFlowNum(String technicalFlowNum) 
    {
        this.technicalFlowNum = technicalFlowNum;
    }

    public String getTechnicalFlowNum() 
    {
        return technicalFlowNum;
    }
    public void setContractSignedDate(Date contractSignedDate) 
    {
        this.contractSignedDate = contractSignedDate;
    }

    public Date getContractSignedDate() 
    {
        return contractSignedDate;
    }
    public void setContractType(String contractType) 
    {
        this.contractType = contractType;
    }

    public String getContractType() 
    {
        return contractType;
    }
    public void setItemNum(String itemNum) 
    {
        this.itemNum = itemNum;
    }

    public String getItemNum() 
    {
        return itemNum;
    }
    public void setProjectName(String projectName) 
    {
        this.projectName = projectName;
    }

    public String getProjectName() 
    {
        return projectName;
    }
    public void setMaterialCode(String materialCode) 
    {
        this.materialCode = materialCode;
    }

    public String getMaterialCode() 
    {
        return materialCode;
    }
    public void setPurchaseTecCuringId(String purchaseTecCuringId) 
    {
        this.purchaseTecCuringId = purchaseTecCuringId;
    }

    public String getPurchaseTecCuringId() 
    {
        return purchaseTecCuringId;
    }
    public void setContractPackageNum(String contractPackageNum) 
    {
        this.contractPackageNum = contractPackageNum;
    }

    public String getContractPackageNum() 
    {
        return contractPackageNum;
    }
    public void setTenderNum(String tenderNum) 
    {
        this.tenderNum = tenderNum;
    }

    public String getTenderNum() 
    {
        return tenderNum;
    }
    public void setCuringidDescrip(String curingidDescrip) 
    {
        this.curingidDescrip = curingidDescrip;
    }

    public String getCuringidDescrip() 
    {
        return curingidDescrip;
    }
    public void setMaterialBigCode(String materialBigCode) 
    {
        this.materialBigCode = materialBigCode;
    }

    public String getMaterialBigCode() 
    {
        return materialBigCode;
    }
    public void setMaterialMidCode(String materialMidCode) 
    {
        this.materialMidCode = materialMidCode;
    }

    public String getMaterialMidCode() 
    {
        return materialMidCode;
    }
    public void setMaterialSmallCode(String materialSmallCode) 
    {
        this.materialSmallCode = materialSmallCode;
    }

    public String getMaterialSmallCode() 
    {
        return materialSmallCode;
    }
    public void setMaterialBigName(String materialBigName) 
    {
        this.materialBigName = materialBigName;
    }

    public String getMaterialBigName() 
    {
        return materialBigName;
    }
    public void setMaterialMidName(String materialMidName) 
    {
        this.materialMidName = materialMidName;
    }

    public String getMaterialMidName() 
    {
        return materialMidName;
    }
    public void setMaterialSmallName(String materialSmallName) 
    {
        this.materialSmallName = materialSmallName;
    }

    public String getMaterialSmallName() 
    {
        return materialSmallName;
    }
    public void setNumBarsPerPage(Long numBarsPerPage) 
    {
        this.numBarsPerPage = numBarsPerPage;
    }

    public Long getNumBarsPerPage() 
    {
        return numBarsPerPage;
    }
    public void setCurPageNum(Long curPageNum) 
    {
        this.curPageNum = curPageNum;
    }

    public Long getCurPageNum() 
    {
        return curPageNum;
    }
    public void setPageNum(Long pageNum) 
    {
        this.pageNum = pageNum;
    }

    public Long getPageNum() 
    {
        return pageNum;
    }
    public void setAllRecordNum(Long allRecordNum) 
    {
        this.allRecordNum = allRecordNum;
    }

    public Long getAllRecordNum() 
    {
        return allRecordNum;
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
            .append("nnReturnId", getNnReturnId())
            .append("purchaseOrderCode", getPurchaseOrderCode())
            .append("purchaseOrderItemNum", getPurchaseOrderItemNum())
            .append("purchaseOrderItemId", getPurchaseOrderItemId())
            .append("contractNum", getContractNum())
            .append("contractName", getContractName())
            .append("purchaserCompanyName", getPurchaserCompanyName())
            .append("purchaserCompanyCode", getPurchaserCompanyCode())
            .append("purchaserMaterialCode", getPurchaserMaterialCode())
            .append("purchaserMaterialDescrip", getPurchaserMaterialDescrip())
            .append("purchaseNum", getPurchaseNum())
            .append("contractNumNn", getContractNumNn())
            .append("technicalFlowNum", getTechnicalFlowNum())
            .append("contractSignedDate", getContractSignedDate())
            .append("contractType", getContractType())
            .append("itemNum", getItemNum())
            .append("projectName", getProjectName())
            .append("materialCode", getMaterialCode())
            .append("purchaseTecCuringId", getPurchaseTecCuringId())
            .append("contractPackageNum", getContractPackageNum())
            .append("tenderNum", getTenderNum())
            .append("curingidDescrip", getCuringidDescrip())
            .append("materialBigCode", getMaterialBigCode())
            .append("materialMidCode", getMaterialMidCode())
            .append("materialSmallCode", getMaterialSmallCode())
            .append("materialBigName", getMaterialBigName())
            .append("materialMidName", getMaterialMidName())
            .append("materialSmallName", getMaterialSmallName())
            .append("updateTime", getUpdateTime())
            .append("numBarsPerPage", getNumBarsPerPage())
            .append("curPageNum", getCurPageNum())
            .append("pageNum", getPageNum())
            .append("allRecordNum", getAllRecordNum())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
