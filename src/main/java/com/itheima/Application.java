package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

// 工程入口类
@SpringBootApplication
//扫描mybatis所有的业务mapper接口
//@MapperScan("com.itheima.mapper")
@MapperScan("com.itheima.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
