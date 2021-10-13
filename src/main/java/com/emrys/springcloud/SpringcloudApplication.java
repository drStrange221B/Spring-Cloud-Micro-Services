package com.emrys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);

		System.out.println("Hello fro Spring boot!");
		System.out.println(System.getProperty("user.dir"));
	}

}
