package com.jd.icity.kgs.web.controller.collect;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jd.icity.kgs.common.annotation.Log;
import com.jd.icity.kgs.common.core.controller.BaseController;
import com.jd.icity.kgs.common.core.domain.AjaxResult;
import com.jd.icity.kgs.common.enums.BusinessType;
import com.jd.icity.kgs.collect.domain.TableCollectLog;
import com.jd.icity.kgs.collect.service.ITableCollectLogService;
import com.jd.icity.kgs.common.utils.poi.ExcelUtil;
import com.jd.icity.kgs.common.core.page.TableDataInfo;

/**
 * 数据采集日志Controller
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
@RestController
@RequestMapping("/collect/log")
public class TableCollectLogController extends BaseController
{
    @Autowired
    private ITableCollectLogService tableCollectLogService;

    /**
     * 查询数据采集日志列表
     */
    @PreAuthorize("@ss.hasPermi('collect:log:list')")
    @GetMapping("/list")
    public TableDataInfo list(TableCollectLog tableCollectLog)
    {
        startPage();
        List<TableCollectLog> list = tableCollectLogService.selectTableCollectLogList(tableCollectLog);
        return getDataTable(list);
    }

    /**
     * 导出数据采集日志列表
     */
    @PreAuthorize("@ss.hasPermi('collect:log:export')")
    @Log(title = "数据采集日志", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TableCollectLog tableCollectLog)
    {
        List<TableCollectLog> list = tableCollectLogService.selectTableCollectLogList(tableCollectLog);
        ExcelUtil<TableCollectLog> util = new ExcelUtil<TableCollectLog>(TableCollectLog.class);
        util.exportExcel(response, list, "数据采集日志数据");
    }

    /**
     * 获取数据采集日志详细信息
     */
    @PreAuthorize("@ss.hasPermi('collect:log:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tableCollectLogService.selectTableCollectLogById(id));
    }

    /**
     * 根据tableCode获取数据采集日志详细信息
     */
    @PreAuthorize("@ss.hasPermi('collect:log:query')")
    @GetMapping
    public TableDataInfo getLogByTableCode(@RequestParam("tableCode") String tableCode)
    {
        startPage();
        List<TableCollectLog> list = tableCollectLogService.selectTableCollectLogByTableCode(tableCode);
        return getDataTable(list);
    }

    /**
     * 新增数据采集日志
     */
    @PreAuthorize("@ss.hasPermi('collect:log:add')")
    @Log(title = "数据采集日志", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TableCollectLog tableCollectLog)
    {
        return toAjax(tableCollectLogService.insertTableCollectLog(tableCollectLog));
    }

    /**
     * 修改数据采集日志
     */
    @PreAuthorize("@ss.hasPermi('collect:log:edit')")
    @Log(title = "数据采集日志", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TableCollectLog tableCollectLog)
    {
        return toAjax(tableCollectLogService.updateTableCollectLog(tableCollectLog));
    }

    /**
     * 删除数据采集日志
     */
    @PreAuthorize("@ss.hasPermi('collect:log:remove')")
    @Log(title = "数据采集日志", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tableCollectLogService.deleteTableCollectLogByIds(ids));
    }
}
