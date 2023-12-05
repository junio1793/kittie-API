package com.kittyProject.restTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"com.kittyCore.model.kittymodel"})
@EnableJpaRepositories({"com.kittyCore.model.repository"})
public class KittyRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KittyRestApplication.class, args);
	}

}
