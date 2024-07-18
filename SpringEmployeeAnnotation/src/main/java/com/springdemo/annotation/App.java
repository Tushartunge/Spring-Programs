package com.springdemo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
    	Employee e=(Employee)context.getBean("sukesh");
    	//Employee e1=(Employee)context.getBean("sukesh");
    	//Employee e2=(Employee)context.getBean("Tushar2");
    	e.work();
    	//e1.work();
    	//e2.work();
    }
}
