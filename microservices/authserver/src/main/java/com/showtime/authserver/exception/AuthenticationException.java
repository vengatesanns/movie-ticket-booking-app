package com.showtime.authserver.exception;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
public class AuthenticationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AuthenticationException(String message) {
		super(message);
	}

}
