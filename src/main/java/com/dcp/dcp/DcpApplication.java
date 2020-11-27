package com.dcp.dcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.dcp.dcp"})
public class DcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcpApplication.class, args);
	}

}
