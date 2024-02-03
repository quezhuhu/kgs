package com.jd.icity.kgs.collect.service;

import java.util.List;
import com.jd.icity.kgs.collect.domain.TableCollectLog;

/**
 * 数据采集日志Service接口
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
public interface ITableCollectLogService 
{
    /**
     * 查询数据采集日志
     * 
     * @param id 数据采集日志主键
     * @return 数据采集日志
     */
    public TableCollectLog selectTableCollectLogById(Long id);

    /**
     * 查询数据采集日志列表
     * 
     * @param tableCollectLog 数据采集日志
     * @return 数据采集日志集合
     */
    public List<TableCollectLog> selectTableCollectLogList(TableCollectLog tableCollectLog);

    /**
     * 新增数据采集日志
     * 
     * @param tableCollectLog 数据采集日志
     * @return 结果
     */
    public int insertTableCollectLog(TableCollectLog tableCollectLog);

    /**
     * 修改数据采集日志
     * 
     * @param tableCollectLog 数据采集日志
     * @return 结果
     */
    public int updateTableCollectLog(TableCollectLog tableCollectLog);

    /**
     * 批量删除数据采集日志
     * 
     * @param ids 需要删除的数据采集日志主键集合
     * @return 结果
     */
    public int deleteTableCollectLogByIds(Long[] ids);

    /**
     * 删除数据采集日志信息
     * 
     * @param id 数据采集日志主键
     * @return 结果
     */
    public int deleteTableCollectLogById(Long id);

    public List<TableCollectLog> selectTableCollectLogByTableCode(String tableCode);
}
