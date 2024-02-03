package com.jd.icity.kgs.collect.service.impl;

import java.util.List;
import com.jd.icity.kgs.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jd.icity.kgs.collect.mapper.TableCollectLogMapper;
import com.jd.icity.kgs.collect.domain.TableCollectLog;
import com.jd.icity.kgs.collect.service.ITableCollectLogService;

/**
 * 数据采集日志Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
@Service
public class TableCollectLogServiceImpl implements ITableCollectLogService 
{
    @Autowired
    private TableCollectLogMapper tableCollectLogMapper;

    /**
     * 查询数据采集日志
     * 
     * @param id 数据采集日志主键
     * @return 数据采集日志
     */
    @Override
    public TableCollectLog selectTableCollectLogById(Long id)
    {
        return tableCollectLogMapper.selectTableCollectLogById(id);
    }

    /**
     * 查询数据采集日志列表
     * 
     * @param tableCollectLog 数据采集日志
     * @return 数据采集日志
     */
    @Override
    public List<TableCollectLog> selectTableCollectLogList(TableCollectLog tableCollectLog)
    {
        return tableCollectLogMapper.selectTableCollectLogList(tableCollectLog);
    }

    @Override
    public List<TableCollectLog> selectTableCollectLogByTableCode(String tableCode)
    {
        return tableCollectLogMapper.selectTableCollectLogByTableCode(tableCode);
    }

    /**
     * 新增数据采集日志
     * 
     * @param tableCollectLog 数据采集日志
     * @return 结果
     */
    @Override
    public int insertTableCollectLog(TableCollectLog tableCollectLog)
    {
        tableCollectLog.setCreateTime(DateUtils.getNowDate());
        return tableCollectLogMapper.insertTableCollectLog(tableCollectLog);
    }

    /**
     * 修改数据采集日志
     * 
     * @param tableCollectLog 数据采集日志
     * @return 结果
     */
    @Override
    public int updateTableCollectLog(TableCollectLog tableCollectLog)
    {
        return tableCollectLogMapper.updateTableCollectLog(tableCollectLog);
    }

    /**
     * 批量删除数据采集日志
     * 
     * @param ids 需要删除的数据采集日志主键
     * @return 结果
     */
    @Override
    public int deleteTableCollectLogByIds(Long[] ids)
    {
        return tableCollectLogMapper.deleteTableCollectLogByIds(ids);
    }

    /**
     * 删除数据采集日志信息
     * 
     * @param id 数据采集日志主键
     * @return 结果
     */
    @Override
    public int deleteTableCollectLogById(Long id)
    {
        return tableCollectLogMapper.deleteTableCollectLogById(id);
    }

}
