package com.jd.icity.kgs.collect.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.jd.icity.kgs.common.annotation.Excel;
import com.jd.icity.kgs.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 数据采集任务对象 table_collect_info
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
public class TableCollectInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 表编码 */
    @Excel(name = "表编码")
    private String tableCode;

    /** 状态：阻塞 未阻塞 */
    @Excel(name = "状态：阻塞 未阻塞")
    private String status;

    /** 上次采集时间 */
    private Date lastCollectTime;

    /** 下次采集时间 */
    private Date nextCollectTime;

    /** 采集间隔(秒) */
    @Excel(name = "采集间隔(秒)")
    private Long collectInterval;

    /** 创建用户id */
    private String createUser;

    /** 更新用户id */
    private String modifyUser;

    /** 修改时间 */
    private Date modifyTime;

    /** 是否删除 */
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
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setLastCollectTime(Date lastCollectTime) 
    {
        this.lastCollectTime = lastCollectTime;
    }

    public Date getLastCollectTime() 
    {
        return lastCollectTime;
    }
    public void setNextCollectTime(Date nextCollectTime) 
    {
        this.nextCollectTime = nextCollectTime;
    }

    public Date getNextCollectTime() 
    {
        return nextCollectTime;
    }
    public void setCollectInterval(Long collectInterval) 
    {
        this.collectInterval = collectInterval;
    }

    public Long getCollectInterval() 
    {
        return collectInterval;
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
            .append("status", getStatus())
            .append("lastCollectTime", getLastCollectTime())
            .append("nextCollectTime", getNextCollectTime())
            .append("collectInterval", getCollectInterval())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("modifyUser", getModifyUser())
            .append("modifyTime", getModifyTime())
            .append("delStat", getDelStat())
            .toString();
    }
}
