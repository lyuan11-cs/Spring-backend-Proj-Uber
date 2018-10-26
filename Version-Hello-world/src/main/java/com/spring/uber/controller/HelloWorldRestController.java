package com.spring.uber.controller;/*
 * Created By Lei Yuan on 10/23/18 10 2018
 */

import com.spring.uber.domain.Message;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldRestController {


    @RequestMapping("/")
    public String welcome(){
        return "Hello world";
    }

    @RequestMapping(value = "/hello/{yourName}", method = RequestMethod.GET)
    public Message showMessage(@PathVariable String yourName){
        Message msg = new Message(yourName,"Hello" + yourName);
        return msg;
    }

}
