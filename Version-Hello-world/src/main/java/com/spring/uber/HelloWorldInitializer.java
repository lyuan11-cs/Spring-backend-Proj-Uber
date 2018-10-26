package com.spring.uber;/*
 * Created By Lei Yuan on 10/23/18 10 2018
 */
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HelloWorldInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[] getRootConfigClasses(){
        return new Class<?>[]{HelloWorldConfiguration.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
