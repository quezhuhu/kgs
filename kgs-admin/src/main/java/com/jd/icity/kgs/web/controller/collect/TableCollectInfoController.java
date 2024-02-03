package com.jd.icity.kgs.web.controller.collect;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.jd.icity.kgs.collect.service.ITableInfoService;
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
import com.jd.icity.kgs.collect.domain.TableCollectInfo;
import com.jd.icity.kgs.collect.service.ITableCollectInfoService;
import com.jd.icity.kgs.common.utils.poi.ExcelUtil;
import com.jd.icity.kgs.common.core.page.TableDataInfo;

/**
 * 数据采集任务Controller
 * 
 * @author ruoyi
 * @date 2024-01-30
 */
@RestController
@RequestMapping("/collect/task")
public class TableCollectInfoController extends BaseController
{
    @Autowired
    private ITableCollectInfoService tableCollectInfoService;

    @Autowired
    private ITableInfoService tableInfoService;

    /**
     * 查询数据采集任务列表
     */
    @PreAuthorize("@ss.hasPermi('collect:task:list')")
    @GetMapping("/list")
    public TableDataInfo list(TableCollectInfo tableCollectInfo)
    {
        startPage();
        List<TableCollectInfo> list = tableCollectInfoService.selectTableCollectInfoList(tableCollectInfo);
        return getDataTable(list);
    }

    /**
     * 导出数据采集任务列表
     */
    @PreAuthorize("@ss.hasPermi('collect:task:export')")
    @Log(title = "数据采集任务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TableCollectInfo tableCollectInfo)
    {
        List<TableCollectInfo> list = tableCollectInfoService.selectTableCollectInfoList(tableCollectInfo);
        ExcelUtil<TableCollectInfo> util = new ExcelUtil<TableCollectInfo>(TableCollectInfo.class);
        util.exportExcel(response, list, "数据采集任务数据");
    }

    /**
     * 获取数据采集任务详细信息
     */
    @PreAuthorize("@ss.hasPermi('collect:task:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tableCollectInfoService.selectTableCollectInfoById(id));
    }

    /**
     * 新增数据采集任务
     */
    @PreAuthorize("@ss.hasPermi('collect:task:add')")
    @Log(title = "数据采集任务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TableCollectInfo tableCollectInfo)
    {
        return toAjax(tableCollectInfoService.insertTableCollectInfo(tableCollectInfo));
    }

    /**
     * 修改数据采集任务
     */
    @PreAuthorize("@ss.hasPermi('collect:task:edit')")
    @Log(title = "数据采集任务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TableCollectInfo tableCollectInfo)
    {
        return toAjax(tableCollectInfoService.updateTableCollectInfo(tableCollectInfo));
    }

    /**
     * 删除数据采集任务
     */
    @PreAuthorize("@ss.hasPermi('collect:task:remove')")
    @Log(title = "数据采集任务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tableCollectInfoService.deleteTableCollectInfoByIds(ids));
    }
}
