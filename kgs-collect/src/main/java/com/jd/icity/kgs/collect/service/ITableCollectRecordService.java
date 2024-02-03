package com.jd.icity.kgs.collect.service;

import java.util.List;
import com.jd.icity.kgs.collect.domain.TableCollectRecord;

/**
 * 数据采集记录Service接口
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
public interface ITableCollectRecordService 
{
    /**
     * 查询数据采集记录
     * 
     * @param id 数据采集记录主键
     * @return 数据采集记录
     */
    public TableCollectRecord selectTableCollectRecordById(Long id);

    /**
     * 查询数据采集记录列表
     * 
     * @param tableCollectRecord 数据采集记录
     * @return 数据采集记录集合
     */
    public List<TableCollectRecord> selectTableCollectRecordList(TableCollectRecord tableCollectRecord);

    /**
     * 新增数据采集记录
     * 
     * @param tableCollectRecord 数据采集记录
     * @return 结果
     */
    public int insertTableCollectRecord(TableCollectRecord tableCollectRecord);

    /**
     * 修改数据采集记录
     * 
     * @param tableCollectRecord 数据采集记录
     * @return 结果
     */
    public int updateTableCollectRecord(TableCollectRecord tableCollectRecord);

    /**
     * 批量删除数据采集记录
     * 
     * @param ids 需要删除的数据采集记录主键集合
     * @return 结果
     */
    public int deleteTableCollectRecordByIds(Long[] ids);

    /**
     * 删除数据采集记录信息
     * 
     * @param id 数据采集记录主键
     * @return 结果
     */
    public int deleteTableCollectRecordById(Long id);
}
