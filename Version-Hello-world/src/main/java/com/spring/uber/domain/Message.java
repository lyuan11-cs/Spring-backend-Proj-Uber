package com.spring.uber.domain;/*
 * Created By Lei Yuan on 10/23/18 10 2018
 */

public class Message {

    private String name;
    private String text;

    public Message(String name, String text){
        this.name = name;
        this.text = text;
    }

    public String getName(){
        return this.name;
    }

    public String getText(){
        return this.text;
    }
}
