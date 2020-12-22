package com.derek.mall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WareServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WareServerApplication.class, args);
	}

}
