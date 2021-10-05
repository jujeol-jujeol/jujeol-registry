package com.jujeol.jujeolregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JujeolRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(JujeolRegistryApplication.class, args);
    }

}
