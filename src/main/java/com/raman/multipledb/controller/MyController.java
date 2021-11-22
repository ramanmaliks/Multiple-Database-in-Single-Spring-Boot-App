package com.raman.multipledb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raman.multipledb.entity.emp.Emp;
import com.raman.multipledb.entity.sales.User;
import com.raman.multipledb.repository.emp.EmpRepository;
import com.raman.multipledb.repository.sales.UserRepository;

@RestController
public class MyController {
	@Autowired
	private EmpRepository empRepository;
	@Autowired
	private UserRepository userRepository;
	@GetMapping("/emps")
	private List<Emp> getAllEmps(){
		return empRepository.findAll();
		
	}
	@GetMapping("/users")
	private List<User> getAllUsers(){
		return userRepository.findAll();
		
	}
}
