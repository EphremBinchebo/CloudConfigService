package com.trilogyed.config2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigService2Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigService2Application.class, args);
	}

}
