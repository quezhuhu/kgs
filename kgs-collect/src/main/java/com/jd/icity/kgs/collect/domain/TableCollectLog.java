package com.jd.icity.kgs.collect.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.jd.icity.kgs.common.annotation.Excel;
import com.jd.icity.kgs.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 数据采集日志对象 table_collect_log
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
public class TableCollectLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 表索引编码 */
    @Excel(name = "表索引编码")
    private String tableIndexCode;

    /** 表编码 */
    @Excel(name = "表编码")
    private String tableCode;

    /** 开始时间 */
    private Date startTime;

    /** 结束时间 */
    private Date endTime;

    /** 采集任务的状态，可以是成功（'SUCCESS'）或失败（'FAILURE'） */
    @Excel(name = "采集任务的状态，可以是成功", readConverterExp = "'=SUCCESS'")
    private String status;

    /** 如果采集失败，记录错误消息的文本字段 */
    @Excel(name = "如果采集失败，记录错误消息的文本字段")
    private String errorMessage;

    /** 本次任务采集的总行数 */
    @Excel(name = "本次任务采集的总行数")
    private Long collectTotalRows;

    /** 已经执行的批次 */
    @Excel(name = "已经执行的批次")
    private Long batchesProceeded;

    /** 批次大小 */
    @Excel(name = "批次大小")
    private Long batchSize;

    /** 增量采集标识 */
    @Excel(name = "增量采集标识")
    private Integer incrementalFlag;

    /** 执行节点 ip */
    @Excel(name = "执行节点 ip")
    private String execIp;

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
    public void setTableIndexCode(String tableIndexCode) 
    {
        this.tableIndexCode = tableIndexCode;
    }

    public String getTableIndexCode() 
    {
        return tableIndexCode;
    }
    public void setTableCode(String tableCode) 
    {
        this.tableCode = tableCode;
    }

    public String getTableCode() 
    {
        return tableCode;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setErrorMessage(String errorMessage) 
    {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() 
    {
        return errorMessage;
    }
    public void setCollectTotalRows(Long collectTotalRows) 
    {
        this.collectTotalRows = collectTotalRows;
    }

    public Long getCollectTotalRows() 
    {
        return collectTotalRows;
    }
    public void setBatchesProceeded(Long batchesProceeded) 
    {
        this.batchesProceeded = batchesProceeded;
    }

    public Long getBatchesProceeded() 
    {
        return batchesProceeded;
    }
    public void setBatchSize(Long batchSize) 
    {
        this.batchSize = batchSize;
    }

    public Long getBatchSize() 
    {
        return batchSize;
    }
    public void setIncrementalFlag(Integer incrementalFlag) 
    {
        this.incrementalFlag = incrementalFlag;
    }

    public Integer getIncrementalFlag() 
    {
        return incrementalFlag;
    }
    public void setExecIp(String execIp) 
    {
        this.execIp = execIp;
    }

    public String getExecIp() 
    {
        return execIp;
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
            .append("tableIndexCode", getTableIndexCode())
            .append("tableCode", getTableCode())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("status", getStatus())
            .append("errorMessage", getErrorMessage())
            .append("collectTotalRows", getCollectTotalRows())
            .append("batchesProceeded", getBatchesProceeded())
            .append("batchSize", getBatchSize())
            .append("incrementalFlag", getIncrementalFlag())
            .append("execIp", getExecIp())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("modifyUser", getModifyUser())
            .append("modifyTime", getModifyTime())
            .append("delStat", getDelStat())
            .toString();
    }
}
