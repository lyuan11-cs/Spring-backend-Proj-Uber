package demo.web;/*
 * Created By Lei Yuan on 10/25/18 10 2018
 */

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 *
 */
@RestController
public class WebSocketApi {

    @MessageMapping("/sendMessage")
    @SendTo("/queue/vehicles")
    public String sendMessage(String message) throws Exception {
        return message;
    }
}