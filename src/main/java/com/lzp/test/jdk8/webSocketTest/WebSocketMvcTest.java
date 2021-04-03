package com.lzp.test.jdk8.webSocketTest;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 这跟常规的spring mvc中的Controller一样，定义收发消息的具体url映射以及处理逻辑。
 */

@Controller
//@RequestMapping("/app")
public class WebSocketMvcTest {

    //@RequestMapping("/hello")
    final String endpoint = GlobConsts.ENDPOINT.name();

    /**
     * 注解里只能是 常量 非要用什么枚举 作死
     */
    @SendTo("/topic/greetings")
    @MessageMapping("/hello")
    public void greeing(@Payload String str)  {
        //return str;
    }

}
