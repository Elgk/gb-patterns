package ru.geekbrains.gbpatterns;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean
    @Scope("singleton")
    public String string(){
        return "Hello!";
    }

    @Bean(name="hello")
    @Scope("prototype") // каждый раз получаем новый объект
    public String string2(){
        return "Hello!";
    }

}
