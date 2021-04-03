package com.lzp.test.jdk8.webSocketTest;

/**
 * websocket 定义的一些全局变量
 */

public enum GlobConsts {
    TOPIC("/topic/greetings"),ENDPOINT("/gs-guide-websocket"),APP_PREFIX("/app"),HELLO_WORLD("/hello");

    private String instance;

    GlobConsts(String instance) {
        this.instance = instance;
    }
}
