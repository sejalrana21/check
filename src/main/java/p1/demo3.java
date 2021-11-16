package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo3
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");

        try
        {
            arithmetic obj=(arithmetic) context.getBean("h1");
            //exception is thrown here only, so the next three statements wont be executed. so
            //put the method calls in diff try blocks
            System.out.println(obj.sub(10.4,-10.0));

            System.out.println(obj.add(10.2,6.5));
            System.out.println(obj.mul(5.0,5.0));
            System.out.println(obj.mul(10.0,-5.0));

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
