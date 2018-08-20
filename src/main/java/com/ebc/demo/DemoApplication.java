package com.ebc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@RestController
@MapperScan(basePackages = "com.ebc.demo.dao")
public class DemoApplication {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String hello(){
        return "Hello, World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
