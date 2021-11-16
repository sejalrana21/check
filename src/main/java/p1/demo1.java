package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class demo1
{
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(javacontainer.class);
        Holiday obj=context.getBean(Holiday.class);
        System.out.println(obj);
    }
}
