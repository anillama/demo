package com.bank;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
 
@SpringBootApplication
@EnableDiscoveryClient
public class SpringEurekaBankAdminServiceApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaBankAdminServiceApplication.class, args);
    }
}