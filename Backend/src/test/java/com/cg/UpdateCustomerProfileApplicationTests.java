package com.cg;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cg.book.customer.CustomerInformation;

import com.fasterxml.jackson.databind.ObjectMapper;
@RunWith(SpringRunner.class)
@SpringBootTest
class UpdateCustomerProfileApplicationTests {

//private MockMvc mockmvc;
//	
//	@Autowired
//	private WebApplicationContext context;
//	
//	
//	@BeforeEach
//	public void setup()
//	{
//		mockmvc = MockMvcBuilders.webAppContextSetup(context).build();
//	}
//	ObjectMapper om = new ObjectMapper();
//	@Test
//	public void createcustomerdetailtest() throws Exception
//	{
//		CustomerInformation customer = new CustomerInformation();
//		
//		 String jshonReQuest = om.writeValueAsString(customer);
//		 MvcResult result = mockmvc.perform(post("/updateprofile/createcustomerdetails").content(jshonReQuest).content(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk()).andReturn();
//		 String resultContent = result.getResponse().getContentAsString();
//		 Response response = om.readValue(resultContent, Response.class);
//		Assert.assertTrue(response.isStatus()==Boolean.TRUE);
//	}
//	
//	@Test
//	public void testcustomerdetail() throws Exception
//	{
//		mockmvc.perform(get("/updateprofile/goldis809@gmail.com"))
//			.andExpect(status().isOk()).andExpect(content().contentType("application/json"))
//			.andExpect(jsonPath("$.fullname").value("Hina"))
//			.andExpect(jsonPath("$.email").value("hinaw12@gmail.com"))
//			.andExpect(jsonPath("$.password").value("HiNa@00"))
//			.andExpect(jsonPath("$.phoneNumber").value("8999333333"))
//			.andExpect(jsonPath("$.city").value("Pune")).andExpect(jsonPath("$.country").value("India"))
//			.andExpect(jsonPath("$.zipCode").value("427333"));                           
//	}
//	
	
}
