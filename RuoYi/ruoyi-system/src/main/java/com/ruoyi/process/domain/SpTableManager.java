package com.ruoyi.process.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础数据配置平台对象 sp_table_manager
 * 
 * @author ruoyi
 * @date 2020-12-14
 */
public class SpTableManager extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 表名称 */
    @Excel(name = "表名称")
    private String tableName;

    /** 业务描述 */
    @Excel(name = "业务描述")
    private String tableDesc;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createUsername;

    /** 最后更新人 */
    @Excel(name = "最后更新人")
    private String updateUsername;

    /** 状态 */
    @Excel(name = "状态")
    private String isDeleted;

    /** 授权(多个用逗号分隔，如：sys:menu:list,sys:menu:create) */
    @Excel(name = "授权(多个用逗号分隔，如：sys:menu:list,sys:menu:create)")
    private String permission;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setTableName(String tableName) 
    {
        this.tableName = tableName;
    }

    public String getTableName() 
    {
        return tableName;
    }
    public void setTableDesc(String tableDesc) 
    {
        this.tableDesc = tableDesc;
    }

    public String getTableDesc() 
    {
        return tableDesc;
    }
    public void setCreateUsername(String createUsername) 
    {
        this.createUsername = createUsername;
    }

    public String getCreateUsername() 
    {
        return createUsername;
    }
    public void setUpdateUsername(String updateUsername) 
    {
        this.updateUsername = updateUsername;
    }

    public String getUpdateUsername() 
    {
        return updateUsername;
    }
    public void setIsDeleted(String isDeleted) 
    {
        this.isDeleted = isDeleted;
    }

    public String getIsDeleted() 
    {
        return isDeleted;
    }
    public void setPermission(String permission) 
    {
        this.permission = permission;
    }

    public String getPermission() 
    {
        return permission;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("tableName", getTableName())
            .append("tableDesc", getTableDesc())
            .append("createTime", getCreateTime())
            .append("createUsername", getCreateUsername())
            .append("updateTime", getUpdateTime())
            .append("updateUsername", getUpdateUsername())
            .append("isDeleted", getIsDeleted())
            .append("permission", getPermission())
            .toString();
    }
}
