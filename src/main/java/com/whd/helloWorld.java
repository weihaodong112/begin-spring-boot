package com.whd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
    来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class helloWorld {
    public static void main(String[] args) {

        //Spring应用启动起来
        SpringApplication.run(helloWorld.class, args);
    }


}
