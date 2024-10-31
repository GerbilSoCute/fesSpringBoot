package com.fes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@MapperScan
@SpringBootApplication //(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.fes","com.fes.controller"})
@PropertySource(value = "classpath:application.properties")
public class FesApplication {

    public static void main(String[] args) {
        SpringApplication.run(FesApplication.class, args);
    }

}
