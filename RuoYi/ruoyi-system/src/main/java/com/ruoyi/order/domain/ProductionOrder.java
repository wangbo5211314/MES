package com.ruoyi.order.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生产订单对象 production_order
 * 
 * @author wangbo
 * @date 2020-12-09
 */
public class ProductionOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 生产订单ID */
    private Long productionOrderId;

    /** 采购方总部编码 */
    @Excel(name = "采购方总部编码")
    private String buyerHqCode;

    /** 订单类型 */
    @Excel(name = "订单类型")
    private String orderType;

    /** 供应商编码 */
    @Excel(name = "供应商编码")
    private String vendorCode;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String vendorName;

    /** 生产订单号 */
    @Excel(name = "生产订单号")
    private String productionOrderNum;

    /** 品类编码 */
    @Excel(name = "品类编码")
    private String categoryCode;

    /** 种类编码 */
    @Excel(name = "种类编码")
    private String kindCode;

    /** 排产计划编码 */
    @Excel(name = "排产计划编码")
    private String schedulingPlanCode;

    /** 采购订单行项目id */
    @Excel(name = "采购订单行项目id")
    private String purchaseOrderItemId;

    /** 数据关联类型 */
    @Excel(name = "数据关联类型")
    private String dataAssociationType;

    /** 销售订单行项目号 */
    @Excel(name = "销售订单行项目号")
    private String saleOrderItemNum;

    /** 厂家物料编码 */
    @Excel(name = "厂家物料编码")
    private String factoryMaterialCode;

    /** 厂家物料名称国网确认 */
    @Excel(name = "厂家物料名称国网确认")
    private String factoryMaterialName;

    /** 厂家物资单位 */
    @Excel(name = "厂家物资单位")
    private String factoryMaterialUnit;

    /** 厂家物料描述 */
    @Excel(name = "厂家物料描述")
    private String factoryMaterialDescription;

    /** 生产数量 */
    @Excel(name = "生产数量")
    private Long producedNum;

    /** 计量单位 */
    @Excel(name = "计量单位")
    private String meteringUnit;

    /** 物资id分组 */
    @Excel(name = "物资id分组")
    private String materialidGroup;

    /** 物资id类型 */
    @Excel(name = "物资id类型")
    private String materialidType;

    /** 产品型号 */
    @Excel(name = "产品型号")
    private String productType;

    /** 计划开始日期 */
    @Excel(name = "计划开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planStartDate;

    /** 计划完成日期 */
    @Excel(name = "计划完成日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planFinishDate;

    /** 实际开始日期 */
    @Excel(name = "实际开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actualStartDate;

    /** 实际完成日期 */
    @Excel(name = "实际完成日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date actualFinishDate;

    /** 生产工厂名称 */
    @Excel(name = "生产工厂名称")
    private String produceFactoryName;

    /** 生产车间名称 */
    @Excel(name = "生产车间名称")
    private String produceShopName;

    /** 生产订单状态 */
    @Excel(name = "生产订单状态")
    private String productionOrderStatus;

    /** 生产中心 */
    @Excel(name = "生产中心")
    private String productionCenter;

    /** 数据来源 */
    @Excel(name = "数据来源")
    private String dataSource;

    /** 来源数据创建时间 */
    @Excel(name = "来源数据创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date datasourceCreateTime;

    /** 数据拥有方 */
    @Excel(name = "数据拥有方")
    private String dataOwner;

    /** 数据可见方 */
    @Excel(name = "数据可见方")
    private String dataVisible;

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

    public void setProductionOrderId(Long productionOrderId) 
    {
        this.productionOrderId = productionOrderId;
    }

    public Long getProductionOrderId() 
    {
        return productionOrderId;
    }
    public void setBuyerHqCode(String buyerHqCode) 
    {
        this.buyerHqCode = buyerHqCode;
    }

    public String getBuyerHqCode() 
    {
        return buyerHqCode;
    }
    public void setOrderType(String orderType) 
    {
        this.orderType = orderType;
    }

    public String getOrderType() 
    {
        return orderType;
    }
    public void setVendorCode(String vendorCode) 
    {
        this.vendorCode = vendorCode;
    }

    public String getVendorCode() 
    {
        return vendorCode;
    }
    public void setVendorName(String vendorName) 
    {
        this.vendorName = vendorName;
    }

    public String getVendorName() 
    {
        return vendorName;
    }
    public void setProductionOrderNum(String productionOrderNum) 
    {
        this.productionOrderNum = productionOrderNum;
    }

    public String getProductionOrderNum() 
    {
        return productionOrderNum;
    }
    public void setCategoryCode(String categoryCode) 
    {
        this.categoryCode = categoryCode;
    }

    public String getCategoryCode() 
    {
        return categoryCode;
    }
    public void setKindCode(String kindCode) 
    {
        this.kindCode = kindCode;
    }

    public String getKindCode() 
    {
        return kindCode;
    }
    public void setSchedulingPlanCode(String schedulingPlanCode) 
    {
        this.schedulingPlanCode = schedulingPlanCode;
    }

    public String getSchedulingPlanCode() 
    {
        return schedulingPlanCode;
    }
    public void setPurchaseOrderItemId(String purchaseOrderItemId) 
    {
        this.purchaseOrderItemId = purchaseOrderItemId;
    }

    public String getPurchaseOrderItemId() 
    {
        return purchaseOrderItemId;
    }
    public void setDataAssociationType(String dataAssociationType) 
    {
        this.dataAssociationType = dataAssociationType;
    }

    public String getDataAssociationType() 
    {
        return dataAssociationType;
    }
    public void setSaleOrderItemNum(String saleOrderItemNum) 
    {
        this.saleOrderItemNum = saleOrderItemNum;
    }

    public String getSaleOrderItemNum() 
    {
        return saleOrderItemNum;
    }
    public void setFactoryMaterialCode(String factoryMaterialCode) 
    {
        this.factoryMaterialCode = factoryMaterialCode;
    }

    public String getFactoryMaterialCode() 
    {
        return factoryMaterialCode;
    }
    public void setFactoryMaterialName(String factoryMaterialName) 
    {
        this.factoryMaterialName = factoryMaterialName;
    }

    public String getFactoryMaterialName() 
    {
        return factoryMaterialName;
    }
    public void setFactoryMaterialUnit(String factoryMaterialUnit) 
    {
        this.factoryMaterialUnit = factoryMaterialUnit;
    }

    public String getFactoryMaterialUnit() 
    {
        return factoryMaterialUnit;
    }
    public void setFactoryMaterialDescription(String factoryMaterialDescription) 
    {
        this.factoryMaterialDescription = factoryMaterialDescription;
    }

    public String getFactoryMaterialDescription() 
    {
        return factoryMaterialDescription;
    }
    public void setProducedNum(Long producedNum) 
    {
        this.producedNum = producedNum;
    }

    public Long getProducedNum() 
    {
        return producedNum;
    }
    public void setMeteringUnit(String meteringUnit) 
    {
        this.meteringUnit = meteringUnit;
    }

    public String getMeteringUnit() 
    {
        return meteringUnit;
    }
    public void setMaterialidGroup(String materialidGroup) 
    {
        this.materialidGroup = materialidGroup;
    }

    public String getMaterialidGroup() 
    {
        return materialidGroup;
    }
    public void setMaterialidType(String materialidType) 
    {
        this.materialidType = materialidType;
    }

    public String getMaterialidType() 
    {
        return materialidType;
    }
    public void setProductType(String productType) 
    {
        this.productType = productType;
    }

    public String getProductType() 
    {
        return productType;
    }
    public void setPlanStartDate(Date planStartDate) 
    {
        this.planStartDate = planStartDate;
    }

    public Date getPlanStartDate() 
    {
        return planStartDate;
    }
    public void setPlanFinishDate(Date planFinishDate) 
    {
        this.planFinishDate = planFinishDate;
    }

    public Date getPlanFinishDate() 
    {
        return planFinishDate;
    }
    public void setActualStartDate(Date actualStartDate) 
    {
        this.actualStartDate = actualStartDate;
    }

    public Date getActualStartDate() 
    {
        return actualStartDate;
    }
    public void setActualFinishDate(Date actualFinishDate) 
    {
        this.actualFinishDate = actualFinishDate;
    }

    public Date getActualFinishDate() 
    {
        return actualFinishDate;
    }
    public void setProduceFactoryName(String produceFactoryName) 
    {
        this.produceFactoryName = produceFactoryName;
    }

    public String getProduceFactoryName() 
    {
        return produceFactoryName;
    }
    public void setProduceShopName(String produceShopName) 
    {
        this.produceShopName = produceShopName;
    }

    public String getProduceShopName() 
    {
        return produceShopName;
    }
    public void setProductionOrderStatus(String productionOrderStatus) 
    {
        this.productionOrderStatus = productionOrderStatus;
    }

    public String getProductionOrderStatus() 
    {
        return productionOrderStatus;
    }
    public void setProductionCenter(String productionCenter) 
    {
        this.productionCenter = productionCenter;
    }

    public String getProductionCenter() 
    {
        return productionCenter;
    }
    public void setDataSource(String dataSource) 
    {
        this.dataSource = dataSource;
    }

    public String getDataSource() 
    {
        return dataSource;
    }
    public void setDatasourceCreateTime(Date datasourceCreateTime) 
    {
        this.datasourceCreateTime = datasourceCreateTime;
    }

    public Date getDatasourceCreateTime() 
    {
        return datasourceCreateTime;
    }
    public void setDataOwner(String dataOwner) 
    {
        this.dataOwner = dataOwner;
    }

    public String getDataOwner() 
    {
        return dataOwner;
    }
    public void setDataVisible(String dataVisible) 
    {
        this.dataVisible = dataVisible;
    }

    public String getDataVisible() 
    {
        return dataVisible;
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
            .append("productionOrderId", getProductionOrderId())
            .append("buyerHqCode", getBuyerHqCode())
            .append("orderType", getOrderType())
            .append("vendorCode", getVendorCode())
            .append("vendorName", getVendorName())
            .append("productionOrderNum", getProductionOrderNum())
            .append("categoryCode", getCategoryCode())
            .append("kindCode", getKindCode())
            .append("schedulingPlanCode", getSchedulingPlanCode())
            .append("purchaseOrderItemId", getPurchaseOrderItemId())
            .append("dataAssociationType", getDataAssociationType())
            .append("saleOrderItemNum", getSaleOrderItemNum())
            .append("factoryMaterialCode", getFactoryMaterialCode())
            .append("factoryMaterialName", getFactoryMaterialName())
            .append("factoryMaterialUnit", getFactoryMaterialUnit())
            .append("factoryMaterialDescription", getFactoryMaterialDescription())
            .append("producedNum", getProducedNum())
            .append("meteringUnit", getMeteringUnit())
            .append("materialidGroup", getMaterialidGroup())
            .append("materialidType", getMaterialidType())
            .append("productType", getProductType())
            .append("planStartDate", getPlanStartDate())
            .append("planFinishDate", getPlanFinishDate())
            .append("actualStartDate", getActualStartDate())
            .append("actualFinishDate", getActualFinishDate())
            .append("produceFactoryName", getProduceFactoryName())
            .append("produceShopName", getProduceShopName())
            .append("productionOrderStatus", getProductionOrderStatus())
            .append("productionCenter", getProductionCenter())
            .append("dataSource", getDataSource())
            .append("datasourceCreateTime", getDatasourceCreateTime())
            .append("dataOwner", getDataOwner())
            .append("dataVisible", getDataVisible())
            .append("yl", getYl())
            .append("yl2", getYl2())
            .append("yl3", getYl3())
            .append("yl4", getYl4())
            .append("yl5", getYl5())
            .toString();
    }
}
