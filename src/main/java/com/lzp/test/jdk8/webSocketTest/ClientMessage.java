package com.lzp.test.jdk8.webSocketTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 定义消息实体类  收发的消息类，必须存在"无参的默认构造函数"，否则topic订阅会出问题，而且代码不报错！
 *
 * 客户端发送过来的数据
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientMessage {
    private String name;
}
