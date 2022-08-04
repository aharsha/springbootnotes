package com.harsha.basicweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class BasicwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicwebApplication.class, args);
		System.out.println();
	}

}
