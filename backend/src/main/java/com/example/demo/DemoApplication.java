package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
    ApplicationRunner init(UserRepository userRepository) throws Exception {
        return args -> {
			User user1 = new User();
			user1.setUserId("1234");
			user1.setFirstName("firstName1");
			user1.setLastName("lastName1");
			user1.setAge((long)18);
			user1.setAddress("address1");
			userRepository.save(user1);

			User user2 = new User();
			user2.setUserId("12345");
			user2.setFirstName("firstName2");
			user2.setLastName("lastName2");
			user2.setAge((long)19);
			user2.setAddress("address2");
			userRepository.save(user2);

			User user3 = new User();
			user3.setUserId("123456");
			user3.setFirstName("firstName3");
			user3.setLastName("lastName3");
			user3.setAge((long)20);
			user3.setAddress("address3");
			userRepository.save(user3);

			userRepository.findAll().forEach(System.out::println);
        };
    }

}
