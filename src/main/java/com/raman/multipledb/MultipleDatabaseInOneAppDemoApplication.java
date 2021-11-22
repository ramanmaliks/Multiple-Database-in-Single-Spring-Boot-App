package com.raman.multipledb;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.raman.multipledb.entity.emp.Emp;
import com.raman.multipledb.entity.sales.User;
import com.raman.multipledb.repository.emp.EmpRepository;
import com.raman.multipledb.repository.sales.UserRepository;

@SpringBootApplication
public class MultipleDatabaseInOneAppDemoApplication
		implements
			CommandLineRunner {

	@Autowired
	private EmpRepository empRepository;
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MultipleDatabaseInOneAppDemoApplication.class,
				args);
	}

	@Override
	public void run(String... args) throws Exception {

		empRepository.saveAll(Arrays.asList(
				new Emp(1 ,"Raman", "Bhopal"),
				new Emp( 2,"Malik", "MP"),
				new Emp( 3,"Raman Malik", "Bhopal Madhya Prades"))

		);

		userRepository.saveAll(Arrays.asList(
				new User(11, "VIVAAN", "USA"),
				new User(12, "MANSI", "UK"), 
				new User(13, "MYSELF", "WORLD"))

		);

	}

}
