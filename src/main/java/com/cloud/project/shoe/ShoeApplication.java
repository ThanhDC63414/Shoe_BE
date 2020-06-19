package com.cloud.project.shoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableConfigurationProperties
@EntityScan("com.cloud.project.shoe.entity")
public class ShoeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoeApplication.class, args);
	}

}
