package com.rsone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rsone.repository")
public class SpringBatchMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchMonitorApplication.class, args);
	}
}
