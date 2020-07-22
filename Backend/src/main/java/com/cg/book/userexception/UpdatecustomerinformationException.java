package com.cg.book.userexception;

public class UpdatecustomerinformationException extends Exception{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UpdatecustomerinformationException(String message) {
		super();
		this.message = message;
	}

	public UpdatecustomerinformationException() {
		super();
	}


}
