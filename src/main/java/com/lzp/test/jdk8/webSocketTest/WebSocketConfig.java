package com.lzp.test.jdk8.webSocketTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * 这个配置的主要作用是对外暴露访问的端点，以及定义客户端访问时，收发消息的方法url前缀。
 */
@EnableWebSocketMessageBroker
@Configuration
//@EnableWebSocket
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

/*
    @Bean
    public ServerEndpointExporter serverEndpointExporter(){
        return  new ServerEndpointExporter();
    }
*/

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        System.out.println("1234");
        registry.enableSimpleBroker("/topic/","/queue/");
        registry.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        System.out.println("5678");
        registry.addEndpoint("/myWebSockets").withSockJS();
    }
}
