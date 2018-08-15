package com.lanxiang.netty.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * 应用启动类
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@PropertySource({
        "classpath:config/common.properties"
})
@ImportResource(locations = {
        "classpath:applicationContext.xml"
})
@ComponentScan(basePackages = {"com.lanxiang.netty.learning"})
public class AppBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(AppBootstrap.class, args);
    }
}