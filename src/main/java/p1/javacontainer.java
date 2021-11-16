package p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//this is your container:told by annotation
@Configuration
public class javacontainer
{
    //creates a bean
    @Bean
    public Holiday getHoliday()
    {
        return new Holiday("gandhi jayanti","02/10");
    }
    @Bean
    public Demo getDemo()
    {
        return new Demo();
    }
}

