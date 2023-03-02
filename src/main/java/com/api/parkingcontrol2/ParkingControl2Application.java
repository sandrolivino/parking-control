package com.api.parkingcontrol2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingControl2Application {

	@GetMapping("/")
	public String index(){
		return "Olá mundo!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ParkingControl2Application.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("senha123"));
	}

}
