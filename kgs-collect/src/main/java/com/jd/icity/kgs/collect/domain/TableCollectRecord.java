package com.jd.icity.kgs.collect.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.jd.icity.kgs.common.annotation.Excel;
import com.jd.icity.kgs.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 数据采集记录对象 table_collect_record
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
public class TableCollectRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 表编码 */
    @Excel(name = "表编码")
    private String tableCode;

    /** 上次采集时间 */
    private Date lastCollectTime;

    /** 当前采集时间 */
    private Date currentCollectTime;

    /** 完成采集时间 */
    private Date finishCollectTime;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

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
    public void setLastCollectTime(Date lastCollectTime) 
    {
        this.lastCollectTime = lastCollectTime;
    }

    public Date getLastCollectTime() 
    {
        return lastCollectTime;
    }
    public void setCurrentCollectTime(Date currentCollectTime) 
    {
        this.currentCollectTime = currentCollectTime;
    }

    public Date getCurrentCollectTime() 
    {
        return currentCollectTime;
    }
    public void setFinishCollectTime(Date finishCollectTime) 
    {
        this.finishCollectTime = finishCollectTime;
    }

    public Date getFinishCollectTime() 
    {
        return finishCollectTime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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
            .append("lastCollectTime", getLastCollectTime())
            .append("currentCollectTime", getCurrentCollectTime())
            .append("finishCollectTime", getFinishCollectTime())
            .append("status", getStatus())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("modifyUser", getModifyUser())
            .append("modifyTime", getModifyTime())
            .append("delStat", getDelStat())
            .toString();
    }
}
