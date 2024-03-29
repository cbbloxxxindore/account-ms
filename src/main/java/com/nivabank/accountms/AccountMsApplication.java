package com.nivabank.accountms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AccountMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMsApplication.class, args);
	}

}
