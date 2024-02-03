package com.jd.icity.kgs.collect.service.impl;

import java.util.List;
import com.jd.icity.kgs.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jd.icity.kgs.collect.mapper.TableCollectRecordMapper;
import com.jd.icity.kgs.collect.domain.TableCollectRecord;
import com.jd.icity.kgs.collect.service.ITableCollectRecordService;

/**
 * 数据采集记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
@Service
public class TableCollectRecordServiceImpl implements ITableCollectRecordService 
{
    @Autowired
    private TableCollectRecordMapper tableCollectRecordMapper;

    /**
     * 查询数据采集记录
     * 
     * @param id 数据采集记录主键
     * @return 数据采集记录
     */
    @Override
    public TableCollectRecord selectTableCollectRecordById(Long id)
    {
        return tableCollectRecordMapper.selectTableCollectRecordById(id);
    }

    /**
     * 查询数据采集记录列表
     * 
     * @param tableCollectRecord 数据采集记录
     * @return 数据采集记录
     */
    @Override
    public List<TableCollectRecord> selectTableCollectRecordList(TableCollectRecord tableCollectRecord)
    {
        return tableCollectRecordMapper.selectTableCollectRecordList(tableCollectRecord);
    }

    /**
     * 新增数据采集记录
     * 
     * @param tableCollectRecord 数据采集记录
     * @return 结果
     */
    @Override
    public int insertTableCollectRecord(TableCollectRecord tableCollectRecord)
    {
        tableCollectRecord.setCreateTime(DateUtils.getNowDate());
        return tableCollectRecordMapper.insertTableCollectRecord(tableCollectRecord);
    }

    /**
     * 修改数据采集记录
     * 
     * @param tableCollectRecord 数据采集记录
     * @return 结果
     */
    @Override
    public int updateTableCollectRecord(TableCollectRecord tableCollectRecord)
    {
        return tableCollectRecordMapper.updateTableCollectRecord(tableCollectRecord);
    }

    /**
     * 批量删除数据采集记录
     * 
     * @param ids 需要删除的数据采集记录主键
     * @return 结果
     */
    @Override
    public int deleteTableCollectRecordByIds(Long[] ids)
    {
        return tableCollectRecordMapper.deleteTableCollectRecordByIds(ids);
    }

    /**
     * 删除数据采集记录信息
     * 
     * @param id 数据采集记录主键
     * @return 结果
     */
    @Override
    public int deleteTableCollectRecordById(Long id)
    {
        return tableCollectRecordMapper.deleteTableCollectRecordById(id);
    }
}
