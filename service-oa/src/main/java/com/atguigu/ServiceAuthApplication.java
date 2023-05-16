/**
 * @author BOOM
 * @create 2023-05-13 19:03
 */
package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 @author boom
 @create 2023-05-13 19:03
 */
@SpringBootApplication
@MapperScan("com.atguigu.*.mapper")
public class ServiceAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAuthApplication.class, args);
    }

}