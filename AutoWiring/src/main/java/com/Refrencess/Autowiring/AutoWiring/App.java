package com.Refrencess.Autowiring.AutoWiring;

/**
 * Hello world!
 * 
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
       AutoWired at=(AutoWired) ap.getBean("a1");
       AutoWired at2=(AutoWired) ap.getBean("a2");
//       System.out.print(at);
       System.out.print(at2);
       
    }
}
