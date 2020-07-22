package com.cg.book.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.book.userexception.UpdateCustomerErrorMessage;
import com.cg.book.userexception.UpdatecustomerinformationException;



@RestControllerAdvice
public class UpdateCustomerControllerAdvice {
	@ExceptionHandler(value= {UpdatecustomerinformationException.class})
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public UpdateCustomerErrorMessage handleServiceException(UpdatecustomerinformationException ex)
	{
		return new UpdateCustomerErrorMessage(ex.getMessage());
	}

}
