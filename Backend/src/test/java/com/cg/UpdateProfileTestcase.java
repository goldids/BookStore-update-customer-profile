package com.cg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.book.customer.CustomerInformation;
import com.cg.book.dao.ICustomerDAO;
import com.cg.book.service.Updatecustomerserive;
import com.cg.book.userexception.UpdatecustomerinformationException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UpdateProfileTestcase{
	
	@Mock
	ICustomerDAO customerdao;
	
	@InjectMocks
	Updatecustomerserive service;
	
	@Test
	public void testcheckphonenumerlength() throws UpdatecustomerinformationException
	{
		CustomerInformation customer = new CustomerInformation();
		customer.setPhoneNumber("9229434231");
		
		assertTrue(service.checkphonenumerlength(customer.getPhoneNumber()));
	}
	
	@Test
	public void testcheckzipcodelength() throws UpdatecustomerinformationException
	{
		CustomerInformation customer = new CustomerInformation();
		customer.setZipCode(999998);
		
		assertTrue(service.checkzipcodelength(customer.getZipCode()));
	}
	
	@Test
	public void testcheckemailifchanged() throws UpdatecustomerinformationException
	{
		
		CustomerInformation customer = customerdao.findById(1).orElseThrow(()->new UpdatecustomerinformationException("No customer"));
		when(customer.getEmailAddress()).thenReturn("goldis809@gmail.com");
		assertTrue(service.checkemailifchanged("goldis809@gmail.com",1));
	}
	
	
	
}
