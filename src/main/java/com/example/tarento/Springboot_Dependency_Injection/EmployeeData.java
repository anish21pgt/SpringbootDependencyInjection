package com.example.tarento.Springboot_Dependency_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeData {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Employee employee = applicationContext.getBean("employee", Employee.class);
        employee.displayEmployeeInfo();

        System.out.println();

        Employee employee2 = applicationContext.getBean("employee2", Employee.class);
        employee2.displayEmployeeInfo();
    }
}
