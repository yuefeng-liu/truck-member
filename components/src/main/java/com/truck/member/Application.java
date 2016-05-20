package com.truck.member;

import com.truck.utils.config.annotation.EnableDataSourceConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Administrator on 2016-04-25.
 */
@SpringBootApplication
@ComponentScan("com.truck")
@EnableDataSourceConfiguration
@ImportResource(locations = "dubbo-provider.xml")
public class Application implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.in.read();
    }
}
