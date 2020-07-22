package com.cg.book.customer;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

@Component
@Entity
//@DynamicInsert
//@DynamicUpdate
@Table(name = "bookstore_customer")
public class CustomerInformation {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_sequence")
    @SequenceGenerator(sequenceName = "transaction_sequence", allocationSize = 1, name = "transaction_sequence")
   
	@Column(name="customer_id")
	private Integer customerId;
	
	@Column(name = "email")
	private String emailAddress;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Column(name = "address")
	private String address;

	@Column(name = "password")
	private String password;

	@Column(name = "phone_no")
	private String phoneNumber;
	
	@Column(name = "full_name")
	private String fullName;

	@Column(name = "city")
	private String city;

	@Column(name = "zip_code")
	private Integer zipCode;

	@Column(name = "country")
	private String country;
	
	@Column(name="register_date")
	private LocalDate registerDate;
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(LocalDate registerDate) {
		this.registerDate = registerDate;
	}

	public CustomerInformation() {
		super();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public CustomerInformation(Integer customerId, String emailAddress, String address, String password,
			String phoneNumber, String fullName, String city, Integer zipCode, String country, LocalDate registerDate) {
		super();
		this.customerId = customerId;
		this.emailAddress = emailAddress;
		this.address = address;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.fullName = fullName;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
		this.registerDate = registerDate;
	}

}

