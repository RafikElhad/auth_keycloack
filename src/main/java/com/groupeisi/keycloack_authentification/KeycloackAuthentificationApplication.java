package com.groupeisi.keycloack_authentification;

import com.groupeisi.keycloack_authentification.entities.Customer;
import com.groupeisi.keycloack_authentification.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeycloackAuthentificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloackAuthentificationApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(Customer.builder()
							.name("Mohamed")
							.email("mohamed@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("Yassine")
					.email("yassine@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("Rafik")
					.email("rafik@gmail.com")
					.build());
		};
	}
}
