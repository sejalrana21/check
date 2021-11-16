package p1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(0)
public class aoparithmetic
{
    //stars-any package,any class,any method which contains the arg double,double is called

    @Before("execution(* *.*(Double,Double))")
    public void validate(JoinPoint jp) throws Exception
    {
        //takes all args from joinpoint one after the other
        for(Object x: jp.getArgs())
        {
            Double y=(Double)x;
            if(y<0)
            {
                throw new IllegalArgumentException("Negative numbers not allowed");
            }
        }
    }
}
