package com.cg;

import org.junit.runner.RunWith;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.cg.book.controller.UpdatecustomerController;
import com.cg.book.customer.CustomerInformation;
import com.cg.book.service.Updatecustomerserive;
import com.cg.book.userexception.UpdatecustomerinformationException;

@RunWith(SpringRunner.class)
@WebMvcTest(value = UpdatecustomerController.class)
public class UpdateCustomerInformationRestapi{
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private Updatecustomerserive service;
	
	
	//String t = "{\"customerId\":\"1\",\"emailAddress\":\"goldis809@gmail.com\",\"fullName\":\"Mili Jackson\",\"password\":\"YUUU@12\",\"phoneNumber\":\"8779988889\",\"city\":\"Mumbai\",\"zipCode\":\"899998\",\"country\":\"India\",\"registerDate\":\"2020-07-17\"}";
	String expectedResult = "Passed";
	CustomerInformation customer = new CustomerInformation(1, "goldis809@gmail.com","Goldi D Singh", "YUUU@12", "8779988889", "Mumbai", "iii", 899998,"India",LocalDate.now());
	
	
	@Test
	public void testgetcustomerbyId() throws Exception
	{
	Mockito.when(
			service.getcustomerdetailbycustomerId(Mockito.anyInt())).thenReturn(customer);
	RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/updateprofile/1").accept(MediaType.APPLICATION_JSON);
	MvcResult result = mockMvc.perform(requestBuilder).andReturn();
	System.out.println(result.getRequest());
	String expected="{customerId:1,emailAddress:goldis809@gmail.com,fullName:Mili Jackson,password:YUUU@12,phoneNumber:8779988889,city:Mumbai,zipCode:899998,country:India,registerDate:2020-07-17}";
	JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	
	}
}
