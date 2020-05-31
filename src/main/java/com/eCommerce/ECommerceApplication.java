package com.eCommerce;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eCommerce.domain.User;
import com.eCommerce.domain.security.Role;
import com.eCommerce.domain.security.UserRole;
import com.eCommerce.service.UserService;
import com.eCommerce.utility.SecurityUtility;


@SpringBootApplication
public class ECommerceApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}
	

}
