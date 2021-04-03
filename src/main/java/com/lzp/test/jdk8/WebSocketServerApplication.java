package com.lzp.test.jdk8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类 启动wensocket
 */
@SpringBootApplication
public class WebSocketServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebSocketServerApplication.class,args);
    }
}
