package com.groupofcollection.group_of_collection;

import java.util.Properties;

/**
 * Hello world!
 *
 */import org.springframework.context.ApplicationContext;
 import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
       Emp emp=(Emp) con.getBean("emp1");
       System.out.println("Name Is"+emp.getName());
       System.out.println("Course is"+emp.getCours());     
       System.out.println("Address is"+emp.getAddress());     
       System.out.println("Phone number is"+emp.getPhone());
  
       
    }
}
