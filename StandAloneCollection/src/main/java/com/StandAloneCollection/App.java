package com.StandAloneCollection;

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
    	 ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
         Test std=(Test) con.getBean("n");
         System.out.print(std);
         
    }
}
