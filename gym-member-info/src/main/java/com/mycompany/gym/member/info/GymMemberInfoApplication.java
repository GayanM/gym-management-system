package com.mycompany.gym.member.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class GymMemberInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymMemberInfoApplication.class, args);
	}

}
