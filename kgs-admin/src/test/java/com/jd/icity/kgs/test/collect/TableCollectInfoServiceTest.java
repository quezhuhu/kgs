package com.jd.icity.kgs.test.collect;

import com.jd.icity.kgs.collect.service.ITableCollectLogService;
import com.jd.icity.kgs.web.controller.collect.TableCollectInfoController;
import com.jd.icity.kgs.collect.service.ITableCollectInfoService;
import com.jd.icity.kgs.web.controller.collect.TableCollectLogController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author quezhuhu
 * @create 2024/1/30 22:00
 */

@SpringBootTest
public class TableCollectInfoServiceTest {
    @Autowired
    private ITableCollectInfoService tableCollectInfoService;

    @Autowired
    private TableCollectInfoController tableCollectInfoController;

    @Autowired
    ITableCollectLogService tableCollectLogService;

    @Autowired
    TableCollectLogController tableCollectLogController;

    @Test
    void queryAllTest(){
        System.out.println(tableCollectInfoService.selectTableCollectInfoList(null));
    }

    @Test
    void queryByIdTest(){
        tableCollectInfoController.list(null);
    }

    @Test
    void queryByTableCodeTest(){
        System.out.println(tableCollectLogService.selectTableCollectLogByTableCode("483f2681-cde9-48b0-8988-a8c35fcc52c8"));
    }

    @Test
    void queryByTableCodeTest2(){
        tableCollectLogController.getLogByTableCode("483f2681-cde9-48b0-8988-a8c35fcc52c8");
    }
}

