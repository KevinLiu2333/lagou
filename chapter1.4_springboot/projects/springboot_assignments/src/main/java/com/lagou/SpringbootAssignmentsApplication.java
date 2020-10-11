package com.lagou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author liuku
 */
@EnableCaching
@SpringBootApplication
public class SpringbootAssignmentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAssignmentsApplication.class, args);
	}

}
