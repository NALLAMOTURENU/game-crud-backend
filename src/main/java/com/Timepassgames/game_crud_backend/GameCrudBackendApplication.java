package com.Timepassgames.game_crud_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class GameCrudBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameCrudBackendApplication.class, args);
	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**") // Apply to all endpoints
//						.allowedOrigins("http://localhost:3000") // ✅ Allow frontend (React)
//						.allowedMethods("GET", "POST", "PUT", "DELETE") // ✅ Allowed HTTP methods
//						.allowedHeaders("*"); // ✅ Allow all headers
//			}
//		};
//	}
}
