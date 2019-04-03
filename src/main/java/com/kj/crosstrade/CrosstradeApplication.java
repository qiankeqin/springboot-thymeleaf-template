package com.kj.crosstrade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kj.crosstrade.dao")
public class CrosstradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrosstradeApplication.class, args);
    }

}
