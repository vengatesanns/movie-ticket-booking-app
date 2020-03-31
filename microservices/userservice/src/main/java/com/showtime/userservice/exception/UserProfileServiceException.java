package com.showtime.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class UserProfileServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public UserProfileServiceException(String message) {
		super(message);
	}

}