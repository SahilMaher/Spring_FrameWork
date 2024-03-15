package com.AnotationAutoWiredExmpl;

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
    	ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
    	AutoAnotation1 at=(AutoAnotation1) ap.getBean("a2");
        System.out.println(at);
    }
}
