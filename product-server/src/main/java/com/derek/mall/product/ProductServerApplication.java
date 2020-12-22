package com.derek.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 整合 MyBatis-Plus
 * 1. 导入依赖
 * 2. 配置
 *     a. 配置数据源 => 导入数据库的驱动, 在 application.yml 中配置数据源相关信息
 *     b. 配置 MyBatis-Plus;
 *         使用 @MapperScan
 */

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.derek.mall.product.dao")
public class ProductServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServerApplication.class, args);
	}

}
