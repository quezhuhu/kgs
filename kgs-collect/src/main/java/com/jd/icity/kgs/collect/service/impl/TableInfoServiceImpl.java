package com.jd.icity.kgs.collect.service.impl;

import java.util.List;
import com.jd.icity.kgs.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jd.icity.kgs.collect.mapper.TableInfoMapper;
import com.jd.icity.kgs.collect.domain.TableInfo;
import com.jd.icity.kgs.collect.service.ITableInfoService;

/**
 * 表基本信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-31
 */
@Service
public class TableInfoServiceImpl implements ITableInfoService 
{
    @Autowired
    private TableInfoMapper tableInfoMapper;

    /**
     * 查询表基本信息
     * 
     * @param id 表基本信息主键
     * @return 表基本信息
     */
    @Override
    public TableInfo selectTableInfoById(Long id)
    {
        return tableInfoMapper.selectTableInfoById(id);
    }

    /**
     * 查询表基本信息列表
     * 
     * @param tableInfo 表基本信息
     * @return 表基本信息
     */
    @Override
    public List<TableInfo> selectTableInfoList(TableInfo tableInfo)
    {
        return tableInfoMapper.selectTableInfoList(tableInfo);
    }

    /**
     * 新增表基本信息
     * 
     * @param tableInfo 表基本信息
     * @return 结果
     */
    @Override
    public int insertTableInfo(TableInfo tableInfo)
    {
        tableInfo.setCreateTime(DateUtils.getNowDate());
        return tableInfoMapper.insertTableInfo(tableInfo);
    }

    /**
     * 修改表基本信息
     * 
     * @param tableInfo 表基本信息
     * @return 结果
     */
    @Override
    public int updateTableInfo(TableInfo tableInfo)
    {
        return tableInfoMapper.updateTableInfo(tableInfo);
    }

    /**
     * 批量删除表基本信息
     * 
     * @param ids 需要删除的表基本信息主键
     * @return 结果
     */
    @Override
    public int deleteTableInfoByIds(Long[] ids)
    {
        return tableInfoMapper.deleteTableInfoByIds(ids);
    }

    /**
     * 删除表基本信息信息
     * 
     * @param id 表基本信息主键
     * @return 结果
     */
    @Override
    public int deleteTableInfoById(Long id)
    {
        return tableInfoMapper.deleteTableInfoById(id);
    }
}
