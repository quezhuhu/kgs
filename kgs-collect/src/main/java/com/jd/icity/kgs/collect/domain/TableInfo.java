package com.jd.icity.kgs.collect.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.jd.icity.kgs.common.annotation.Excel;
import com.jd.icity.kgs.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 表基本信息对象 table_info
 * 
 * @author ruoyi
 * @date 2024-01-31
 */
public class TableInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 表编码 */
    @Excel(name = "表编码")
    private String tableCode;

    /** 表名 */
    @Excel(name = "表名")
    private String tableName;

    /** 数据表标签 */
    @Excel(name = "数据表标签")
    private String tableTags;

    /** 实体类别编码 */
    @Excel(name = "实体类别编码")
    private String entityCategoryCode;

    /** 实体类别名称 */
    @Excel(name = "实体类别名称")
    private String entityCategoryName;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 连接编码 */
    @Excel(name = "连接编码")
    private String connectionKey;

    /** 数据源类型 */
    @Excel(name = "数据源类型")
    private String datasourceType;

    /** 数据源ID */
    @Excel(name = "数据源ID")
    private String datasourceId;

    /** 数据库名称 */
    @Excel(name = "数据库名称")
    private String databaseName;

    /** 标准表标识，1:标准表 0:不合规的表 */
    @Excel(name = "标准表标识，1:标准表 0:不合规的表")
    private Integer standardTableFlag;

    /** 创建用户id */
    @Excel(name = "创建用户id")
    private String createUser;

    /** 更新用户id */
    @Excel(name = "更新用户id")
    private String modifyUser;

    /** 修改时间 */
    private Date modifyTime;

    /** 0：正常 1：删除 */
    @Excel(name = "0：正常 1：删除")
    private Integer delStat;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTableCode(String tableCode) 
    {
        this.tableCode = tableCode;
    }

    public String getTableCode() 
    {
        return tableCode;
    }
    public void setTableName(String tableName) 
    {
        this.tableName = tableName;
    }

    public String getTableName() 
    {
        return tableName;
    }
    public void setTableTags(String tableTags) 
    {
        this.tableTags = tableTags;
    }

    public String getTableTags() 
    {
        return tableTags;
    }
    public void setEntityCategoryCode(String entityCategoryCode) 
    {
        this.entityCategoryCode = entityCategoryCode;
    }

    public String getEntityCategoryCode() 
    {
        return entityCategoryCode;
    }
    public void setEntityCategoryName(String entityCategoryName) 
    {
        this.entityCategoryName = entityCategoryName;
    }

    public String getEntityCategoryName() 
    {
        return entityCategoryName;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setConnectionKey(String connectionKey) 
    {
        this.connectionKey = connectionKey;
    }

    public String getConnectionKey() 
    {
        return connectionKey;
    }
    public void setDatasourceType(String datasourceType) 
    {
        this.datasourceType = datasourceType;
    }

    public String getDatasourceType() 
    {
        return datasourceType;
    }
    public void setDatasourceId(String datasourceId) 
    {
        this.datasourceId = datasourceId;
    }

    public String getDatasourceId() 
    {
        return datasourceId;
    }
    public void setDatabaseName(String databaseName) 
    {
        this.databaseName = databaseName;
    }

    public String getDatabaseName() 
    {
        return databaseName;
    }
    public void setStandardTableFlag(Integer standardTableFlag) 
    {
        this.standardTableFlag = standardTableFlag;
    }

    public Integer getStandardTableFlag() 
    {
        return standardTableFlag;
    }
    public void setCreateUser(String createUser) 
    {
        this.createUser = createUser;
    }

    public String getCreateUser() 
    {
        return createUser;
    }
    public void setModifyUser(String modifyUser) 
    {
        this.modifyUser = modifyUser;
    }

    public String getModifyUser() 
    {
        return modifyUser;
    }
    public void setModifyTime(Date modifyTime) 
    {
        this.modifyTime = modifyTime;
    }

    public Date getModifyTime() 
    {
        return modifyTime;
    }
    public void setDelStat(Integer delStat) 
    {
        this.delStat = delStat;
    }

    public Integer getDelStat() 
    {
        return delStat;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("tableCode", getTableCode())
            .append("tableName", getTableName())
            .append("tableTags", getTableTags())
            .append("entityCategoryCode", getEntityCategoryCode())
            .append("entityCategoryName", getEntityCategoryName())
            .append("description", getDescription())
            .append("connectionKey", getConnectionKey())
            .append("datasourceType", getDatasourceType())
            .append("datasourceId", getDatasourceId())
            .append("databaseName", getDatabaseName())
            .append("standardTableFlag", getStandardTableFlag())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("modifyUser", getModifyUser())
            .append("modifyTime", getModifyTime())
            .append("delStat", getDelStat())
            .toString();
    }
}
