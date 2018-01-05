package com.dhu.wlq.service.log;

import lombok.extern.slf4j.Slf4j;
import java.util.Date;

@Slf4j
public class Log4jTestDemo {

    public void initialize() {
        //记录debug信息级别的信息
        log.debug("This message level is : {}, time : {}", "debug", new Date());
        //记录info信息级别的信息
        log.info("This message level is : {}, time : {}", "info", new Date());
        //记录error信息级别的信息
        log.error("This message level is : {}, time : {}", "error", new Date());
    }

}
