package com.Refrencess.Constructor_Injection.Constructor_Injection;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext cn=new ClassPathXmlApplicationContext("config.xml");
        Emp e=(Emp) cn.getBean("e1");
        System.out.println(e);
        
    }
}
