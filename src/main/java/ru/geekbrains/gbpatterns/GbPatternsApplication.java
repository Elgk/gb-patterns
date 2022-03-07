package ru.geekbrains.gbpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GbPatternsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(GbPatternsApplication.class, args);
        System.out.println(run.getBean(String.class));
    }

}
