package com.example.granblueutil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.granblueutil.**")
@EnableConfigurationProperties
@EnableScheduling
//@EnableJpaRepositories
//@ComponentScan(basePackages = { "com.nari.**"})
public class GranBlueUtilApplication {

	public static void main(String[] args) {
		SpringApplication.run(GranBlueUtilApplication.class, args);
	}

}
