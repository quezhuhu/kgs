package com.jd.icity.kgs.web.controller.collect;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jd.icity.kgs.common.annotation.Log;
import com.jd.icity.kgs.common.core.controller.BaseController;
import com.jd.icity.kgs.common.core.domain.AjaxResult;
import com.jd.icity.kgs.common.enums.BusinessType;
import com.jd.icity.kgs.collect.domain.TableInfo;
import com.jd.icity.kgs.collect.service.ITableInfoService;
import com.jd.icity.kgs.common.utils.poi.ExcelUtil;
import com.jd.icity.kgs.common.core.page.TableDataInfo;

/**
 * 表基本信息Controller
 * 
 * @author ruoyi
 * @date 2024-01-31
 */
@RestController
@RequestMapping("/collect/table")
public class TableInfoController extends BaseController
{
    @Autowired
    private ITableInfoService tableInfoService;

    /**
     * 查询表基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('collect:table:list')")
    @GetMapping("/list")
    public TableDataInfo list(TableInfo tableInfo)
    {
        startPage();
        List<TableInfo> list = tableInfoService.selectTableInfoList(tableInfo);
        return getDataTable(list);
    }

    /**
     * 导出表基本信息列表
     */
    @PreAuthorize("@ss.hasPermi('collect:table:export')")
    @Log(title = "表基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TableInfo tableInfo)
    {
        List<TableInfo> list = tableInfoService.selectTableInfoList(tableInfo);
        ExcelUtil<TableInfo> util = new ExcelUtil<TableInfo>(TableInfo.class);
        util.exportExcel(response, list, "表基本信息数据");
    }

    /**
     * 获取表基本信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('collect:table:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tableInfoService.selectTableInfoById(id));
    }

    /**
     * 新增表基本信息
     */
    @PreAuthorize("@ss.hasPermi('collect:table:add')")
    @Log(title = "表基本信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TableInfo tableInfo)
    {
        return toAjax(tableInfoService.insertTableInfo(tableInfo));
    }

    /**
     * 修改表基本信息
     */
    @PreAuthorize("@ss.hasPermi('collect:table:edit')")
    @Log(title = "表基本信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TableInfo tableInfo)
    {
        return toAjax(tableInfoService.updateTableInfo(tableInfo));
    }

    /**
     * 删除表基本信息
     */
    @PreAuthorize("@ss.hasPermi('collect:table:remove')")
    @Log(title = "表基本信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tableInfoService.deleteTableInfoByIds(ids));
    }
}
