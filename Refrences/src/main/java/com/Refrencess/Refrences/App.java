package com.Refrencess.Refrences;

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
        ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
//        A tem=(A) ac.getBean("a1");
        A tem2=(A) ac.getBean("a1");
        System.out.println(tem2.getStd());
        System.out.println(tem2.getEmp());
        
        
        
    }
}
 