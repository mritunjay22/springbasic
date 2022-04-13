package springwithmaven.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
// using it as a Main class to pull objects
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("springwithmaven/spring/Config.xml");// Path of xml config file if in another package then full path
         Student obj =(Student)context.getBean("student1");// bean id from xml file
         System.out.println(obj); // here Direct passed object because of override toString Method
         System.out.println("__________Second Object_________");
          Student ob2 = (Student)context.getBean("student2");
         System.out.print(ob2);
    }
}
