package com.lzp.test.jdk8.webSocketTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 客户端返回数据的实体类
 */
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerMessage implements Serializable {
    private String content;
}
