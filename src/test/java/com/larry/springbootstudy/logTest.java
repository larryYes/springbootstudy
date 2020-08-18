package com.larry.springbootstudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author larry
 * @date 20/8/18 16:17
 * @description 日志测试类
 */
public class logTest {

    /**
     * getLogger 参数为当前类的类对象
     */
    private static Logger logger = LoggerFactory.getLogger(logTest.class);

    public static void main(String[] args) {
        /**
         * 通过Logger的api打印信息
         * 日志级别：trace<debug<info<warn<error
         */
        logger.debug("debug日志");
        logger.info("info日志");
        logger.warn("warn日志");
        logger.error("error日志");
    }
}
