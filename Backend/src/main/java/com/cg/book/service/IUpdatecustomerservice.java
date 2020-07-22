package com.cg.book.service;

import org.springframework.stereotype.Service;

import com.cg.book.customer.CustomerInformation;
import com.cg.book.userexception.UpdatecustomerinformationException;


@Service
public interface IUpdatecustomerservice {

	public CustomerInformation getcustomerdetailbycustomerId(Integer customerid) throws UpdatecustomerinformationException;
	
	public void updatecustomerinformation(CustomerInformation customer,Integer id) throws UpdatecustomerinformationException;
	
	public boolean checkediteduserinformationifnull(CustomerInformation customer) throws UpdatecustomerinformationException;
	public boolean checkphonenumerlength(String phonenumber) throws UpdatecustomerinformationException;
	public boolean checkzipcodelength(int zipcode) throws UpdatecustomerinformationException;
	boolean checkemailifchanged(String changedemail, Integer id) throws UpdatecustomerinformationException;
	
}
