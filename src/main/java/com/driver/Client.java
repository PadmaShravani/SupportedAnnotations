package com.driver;

import com.bean.Employee;
import com.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);
        Employee bean=ac.getBean("employee", Employee.class);
        System.out.println(bean.toString());

    }
}
