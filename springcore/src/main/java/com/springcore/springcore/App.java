package com.springcore.springcore;

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
      ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        student std=(student) con.getBean("student1");
        System.out.println(std);
        student std2=(student) con.getBean("student2");
        System.out.println(std2);
         
    }
}
