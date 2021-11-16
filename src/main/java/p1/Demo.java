package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo
{
    public static void main(String[] args) {
        //this is not IOC
        //Holiday obj=new Holiday();

        //opens the container and from this container object is taken
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Holiday obj=(Holiday) context.getBean("holidayobj");
        obj.display();

        Holiday obj1=(Holiday) context.getBean("h1");
        System.out.println(obj1);

        obj1=(Holiday) context.getBean("h2");
        System.out.println(obj1);

    }
}
