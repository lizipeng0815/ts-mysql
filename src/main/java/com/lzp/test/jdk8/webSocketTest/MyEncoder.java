package com.lzp.test.jdk8.webSocketTest;

import com.alibaba.fastjson.JSON;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class MyEncoder implements Encoder.Text<ServerMessage> {
    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }

    @Override
    public String encode(ServerMessage object) throws EncodeException {

        return JSON.toJSONString(object);
    }
}
