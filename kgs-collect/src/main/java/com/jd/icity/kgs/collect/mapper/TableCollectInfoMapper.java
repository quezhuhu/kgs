package com.jd.icity.kgs.collect.mapper;

import java.util.List;
import com.jd.icity.kgs.collect.domain.TableCollectInfo;

/**
 * 数据采集任务Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
public interface TableCollectInfoMapper 
{
    /**
     * 查询数据采集任务
     * 
     * @param id 数据采集任务主键
     * @return 数据采集任务
     */
    public TableCollectInfo selectTableCollectInfoById(Long id);

    /**
     * 查询数据采集任务列表
     * 
     * @param tableCollectInfo 数据采集任务
     * @return 数据采集任务集合
     */
    public List<TableCollectInfo> selectTableCollectInfoList(TableCollectInfo tableCollectInfo);

    /**
     * 新增数据采集任务
     * 
     * @param tableCollectInfo 数据采集任务
     * @return 结果
     */
    public int insertTableCollectInfo(TableCollectInfo tableCollectInfo);

    /**
     * 修改数据采集任务
     * 
     * @param tableCollectInfo 数据采集任务
     * @return 结果
     */
    public int updateTableCollectInfo(TableCollectInfo tableCollectInfo);

    /**
     * 删除数据采集任务
     * 
     * @param id 数据采集任务主键
     * @return 结果
     */
    public int deleteTableCollectInfoById(Long id);

    /**
     * 批量删除数据采集任务
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTableCollectInfoByIds(Long[] ids);
}
