package com.derek.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * nacos 配置中心 统一管理配置
 * 1. 引入依赖 nacos-config
 * 2. 创建 bootstrap.propertirs 配置
 * 	   a. spring.application.name=server
 * 	   b. spring.cloud.nacos.config.server-addr
 * nacos 配置中心添加数据集（Data Id） 应用名.properties
 * 动态获取配置
 *  @RefreshScope 动态获取并刷新配置
 *  @Value(${"配置项的名"})：获取到配置
 *  如果配置中心和当前应用的配置文件都配置了相同的项，优先使用配置中心的配置
 * 2. 命名空间 配置隔离：
 * 	默认 public(保留空间):默认新增的所有配置都在 public 空间
 * 		a. 利用命名空间做环境隔离 需在 bootstrap.properties 文件中配置 namespace
 * 		b. 每一个微服务之间互相隔离配置，每一个微服务创建自己的命名空间，只加载自己命名空间配置
 * 3. 配置集：所有配置的集合
 * 4. 配置集ID：Data Id。
 * 5. 配置分组：默认所有的配置集都属于：DEFAULT_GROUP 需在 bootstrap.properties 文件中配置 group
 * 6. 同时加载多给配置集 需在 bootstrap.properties 文件中配置 ext-config[].data-id, ext-config[0].group, ext-refresh=true
 * 	  a. 微服务配置信息放到配置中心中
 * 	  b. bootstarp.properties 标注加载配置中心配置文件
 * 	  c. @Value, @ConfigurationProperties
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CouponServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponServerApplication.class, args);
	}

}
