package com.derek.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.derek.mall.member.feign")
@EnableDiscoveryClient
public class MemberServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberServerApplication.class, args);
	}

}
