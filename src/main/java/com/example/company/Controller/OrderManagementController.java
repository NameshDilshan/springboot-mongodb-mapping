package com.example.company.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.company.Entity.User;
import com.example.company.Repository.UserRepository;

@RestController
@RequestMapping("/order-service")
public class OrderManagementController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> getAllUsers() { 
		return userRepository.findAll();
	}
	
	@GetMapping("/getUserByUsername/{username}")
	public List<User> getUserByUsername(@PathVariable String username) { 
		return userRepository.findByName(username);
	}
	
	@GetMapping("/getUserByAddress/{city}")
	public List<User> getUserByAddress(@PathVariable String city) { 
		return userRepository.findByCity(city);
	}
	
	@PostMapping
	public String placeOrder(@RequestBody User user) { 
		userRepository.save(user);
		return "Order placed successfully..!";
	}
	 
	
}
