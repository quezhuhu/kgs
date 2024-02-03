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
import com.jd.icity.kgs.collect.domain.TableCollectRecord;
import com.jd.icity.kgs.collect.service.ITableCollectRecordService;
import com.jd.icity.kgs.common.utils.poi.ExcelUtil;
import com.jd.icity.kgs.common.core.page.TableDataInfo;

/**
 * 数据采集记录Controller
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
@RestController
@RequestMapping("/collect/record")
public class TableCollectRecordController extends BaseController
{
    @Autowired
    private ITableCollectRecordService tableCollectRecordService;

    /**
     * 查询数据采集记录列表
     */
    @PreAuthorize("@ss.hasPermi('collect:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(TableCollectRecord tableCollectRecord)
    {
        startPage();
        List<TableCollectRecord> list = tableCollectRecordService.selectTableCollectRecordList(tableCollectRecord);
        return getDataTable(list);
    }

    /**
     * 导出数据采集记录列表
     */
    @PreAuthorize("@ss.hasPermi('collect:record:export')")
    @Log(title = "数据采集记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TableCollectRecord tableCollectRecord)
    {
        List<TableCollectRecord> list = tableCollectRecordService.selectTableCollectRecordList(tableCollectRecord);
        ExcelUtil<TableCollectRecord> util = new ExcelUtil<TableCollectRecord>(TableCollectRecord.class);
        util.exportExcel(response, list, "数据采集记录数据");
    }

    /**
     * 获取数据采集记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('collect:record:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tableCollectRecordService.selectTableCollectRecordById(id));
    }

    /**
     * 新增数据采集记录
     */
    @PreAuthorize("@ss.hasPermi('collect:record:add')")
    @Log(title = "数据采集记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TableCollectRecord tableCollectRecord)
    {
        return toAjax(tableCollectRecordService.insertTableCollectRecord(tableCollectRecord));
    }

    /**
     * 修改数据采集记录
     */
    @PreAuthorize("@ss.hasPermi('collect:record:edit')")
    @Log(title = "数据采集记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TableCollectRecord tableCollectRecord)
    {
        return toAjax(tableCollectRecordService.updateTableCollectRecord(tableCollectRecord));
    }

    /**
     * 删除数据采集记录
     */
    @PreAuthorize("@ss.hasPermi('collect:record:remove')")
    @Log(title = "数据采集记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tableCollectRecordService.deleteTableCollectRecordByIds(ids));
    }
}
