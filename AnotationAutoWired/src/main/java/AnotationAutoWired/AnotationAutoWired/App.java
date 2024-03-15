package AnotationAutoWired.AnotationAutoWired;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Refrencess.Autowiring.AutoWiring.AutoWired;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
    	AnoationAutoWired1 at=(AnoationAutoWired1) ap.getBean("a1");
        System.out.print(at);
    }
}
