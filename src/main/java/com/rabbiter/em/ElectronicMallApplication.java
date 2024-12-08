package com.rabbiter.em;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.rabbiter.em.mapper")
@SpringBootApplication
public class ElectronicMallApplication {

    public static void main(String[] args) {

        SpringApplication.run(ElectronicMallApplication.class, args);
    }

}
