package com.jd.icity.kgs.collect.mapper;

import java.util.List;
import com.jd.icity.kgs.collect.domain.TableInfo;

/**
 * 表基本信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-31
 */
public interface TableInfoMapper 
{
    /**
     * 查询表基本信息
     * 
     * @param id 表基本信息主键
     * @return 表基本信息
     */
    public TableInfo selectTableInfoById(Long id);

    /**
     * 查询表基本信息列表
     * 
     * @param tableInfo 表基本信息
     * @return 表基本信息集合
     */
    public List<TableInfo> selectTableInfoList(TableInfo tableInfo);

    /**
     * 新增表基本信息
     * 
     * @param tableInfo 表基本信息
     * @return 结果
     */
    public int insertTableInfo(TableInfo tableInfo);

    /**
     * 修改表基本信息
     * 
     * @param tableInfo 表基本信息
     * @return 结果
     */
    public int updateTableInfo(TableInfo tableInfo);

    /**
     * 删除表基本信息
     * 
     * @param id 表基本信息主键
     * @return 结果
     */
    public int deleteTableInfoById(Long id);

    /**
     * 批量删除表基本信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTableInfoByIds(Long[] ids);
}
