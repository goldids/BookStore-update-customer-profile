package com.cg;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.book.customer.CustomerInformation;
import com.cg.book.dao.ICustomerDAO;

@SpringBootApplication
public class UpdateCustomerProfileApplication{
	@Autowired
	ICustomerDAO customerdao;
	public static void main(String[] args) {
		SpringApplication.run(UpdateCustomerProfileApplication.class, args);
	}
}
