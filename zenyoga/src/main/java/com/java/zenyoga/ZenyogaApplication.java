package com.java.zenyoga;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.java.zenyoga.enumerate.Role;
import com.java.zenyoga.model.User;
import com.java.zenyoga.repository.UserRepository;

import lombok.RequiredArgsConstructor;




@SpringBootApplication
@RequiredArgsConstructor
public class ZenyogaApplication {

	private final PasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(ZenyogaApplication.class, args);
	}
	
	@SuppressWarnings("null")
	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository){
		return args -> {
			if(userRepository.count() > 0) return;
			var admin = User.builder()
						.name("Admin")
						.email("admin@gmail.com")
						.password(passwordEncoder.encode("Admin@123"))
						.role(Role.ADMIN)
						.build();
			userRepository.save(admin);
		};
	}
}
