package com.spring.uber;/*
 * Created By Lei Yuan on 10/23/18 10 2018
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring.uber")
public class HelloWorldConfiguration {

}
