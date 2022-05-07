package ru.geekbrains.networkhome.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import ru.geekbrains.networkhome.mapping_util.ConnectionManager;
import ru.geekbrains.networkhome.mapping_util.ConnectionPool;

@Configuration
@ComponentScan(basePackages = "ru.geekbrains.networkhome")
public class AppConfig {

    @Lazy
    @Bean
    public ConnectionPool connectionPool(){
        return new ConnectionPool();
    }

    @Lazy
    @Bean
    public ConnectionManager connectionManager(){
        ConnectionPool pool = connectionPool();
        return  new ConnectionManager(pool);
    }

}
