package com.lzp.test.jdk8.webSocketTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

import javax.websocket.EncodeException;
import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * 这种 应该不是 stomp 协议的
 * STOMP即Simple (or Streaming) Text Orientated Messaging Protocol，简单(流)文本定向消息协议，它提供了一个可互操作的连接格式，允许STOMP客户端与任意STOMP消息代理（Broker）进行交互。STOMP协议由于设计简单，易于开发客户端，因此在多种语言和多种平台上得到广泛地应用。
 *
 * STOMP协议的前身是TTMP协议（一个简单的基于文本的协议），专为消息中间件设计。
 *
 * STOMP是一个非常简单和容易实现的协议，其设计灵感源自于HTTP的简单性。尽管STOMP协议在服务器端的实现可能有一定的难度，但客户端的实现却很容易。例如，可以使用Telnet登录到任何的STOMP代理，并与STOMP代理进行交互。
 * ---------------------
 * 来源：CSDN
 * 原文：https://blog.csdn.net/jhfyuf/article/details/86800382
 */


@Component
@ServerEndpoint(value = "/websocket",encoders = MyEncoder.class)
public class MyH5SpringbootWebSocketHandle {

    @OnMessage
    public void handleMessage(Session session, String message) throws IOException, EncodeException {
        //session.getBasicRemote().sendText("lizipeng: " + new StringBuilder(message).reverse());
        ServerMessage serverMessage = new ServerMessage();
        serverMessage.setContent("hello i am a object");
        session.getBasicRemote().sendObject(serverMessage);
    }


}
