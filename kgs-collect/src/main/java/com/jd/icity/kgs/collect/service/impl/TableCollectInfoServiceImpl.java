package com.jd.icity.kgs.collect.service.impl;

import java.util.List;
import com.jd.icity.kgs.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jd.icity.kgs.collect.mapper.TableCollectInfoMapper;
import com.jd.icity.kgs.collect.domain.TableCollectInfo;
import com.jd.icity.kgs.collect.service.ITableCollectInfoService;

/**
 * 数据采集任务Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
@Service
public class TableCollectInfoServiceImpl implements ITableCollectInfoService 
{
    @Autowired
    private TableCollectInfoMapper tableCollectInfoMapper;

    /**
     * 查询数据采集任务
     * 
     * @param id 数据采集任务主键
     * @return 数据采集任务
     */
    @Override
    public TableCollectInfo selectTableCollectInfoById(Long id)
    {
        return tableCollectInfoMapper.selectTableCollectInfoById(id);
    }

    /**
     * 查询数据采集任务列表
     * 
     * @param tableCollectInfo 数据采集任务
     * @return 数据采集任务
     */
    @Override
    public List<TableCollectInfo> selectTableCollectInfoList(TableCollectInfo tableCollectInfo)
    {
        return tableCollectInfoMapper.selectTableCollectInfoList(tableCollectInfo);
    }

    /**
     * 新增数据采集任务
     * 
     * @param tableCollectInfo 数据采集任务
     * @return 结果
     */
    @Override
    public int insertTableCollectInfo(TableCollectInfo tableCollectInfo)
    {
        tableCollectInfo.setCreateTime(DateUtils.getNowDate());
        return tableCollectInfoMapper.insertTableCollectInfo(tableCollectInfo);
    }

    /**
     * 修改数据采集任务
     * 
     * @param tableCollectInfo 数据采集任务
     * @return 结果
     */
    @Override
    public int updateTableCollectInfo(TableCollectInfo tableCollectInfo)
    {
        return tableCollectInfoMapper.updateTableCollectInfo(tableCollectInfo);
    }

    /**
     * 批量删除数据采集任务
     * 
     * @param ids 需要删除的数据采集任务主键
     * @return 结果
     */
    @Override
    public int deleteTableCollectInfoByIds(Long[] ids)
    {
        return tableCollectInfoMapper.deleteTableCollectInfoByIds(ids);
    }

    /**
     * 删除数据采集任务信息
     * 
     * @param id 数据采集任务主键
     * @return 结果
     */
    @Override
    public int deleteTableCollectInfoById(Long id)
    {
        return tableCollectInfoMapper.deleteTableCollectInfoById(id);
    }
}
