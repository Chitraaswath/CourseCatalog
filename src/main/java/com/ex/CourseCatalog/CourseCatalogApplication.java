package com.ex.CourseCatalog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication   //@Configuration+@ComponentScan+@EnableAutoConfiguration

public class CourseCatalogApplication {
	public static void main(String[] args) {
		SpringApplication.run(CourseCatalogApplication.class, args);
	}
//	@Bean
//	public RestTemplate restTemplate() {
//	    return new RestTemplate();
//	}

}