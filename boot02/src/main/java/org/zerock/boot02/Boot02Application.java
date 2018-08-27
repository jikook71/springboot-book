package org.zerock.boot02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:application-${spring.profiles.active:local}.properties"})
public class Boot02Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot02Application.class, args);
    }
}
