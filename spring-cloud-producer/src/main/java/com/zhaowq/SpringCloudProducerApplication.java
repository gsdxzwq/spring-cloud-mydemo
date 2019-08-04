package com.zhaowq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhaowq
 * @date 2019/7/19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProducerApplication.class, args);
    }
}
