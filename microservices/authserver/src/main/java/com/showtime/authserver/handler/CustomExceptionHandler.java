package com.showtime.authserver.handler;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.showtime.authserver.bean.response.ErrorResponse;
import com.showtime.authserver.exception.AuthenticationException;
import com.showtime.authserver.exception.UserAlreadyExistsException;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	private static final String OWNER = "com.hackpro";
	private static final String SERVER_ERROR = "Internal Server ";
	private static final String CONFLICT_ERROR = "Conflict";

	@ExceptionHandler({ AuthenticationException.class, UsernameNotFoundException.class,
			UserAlreadyExistsException.class })
	public ResponseEntity<ErrorResponse> handleAuthenticationException(Exception ex, HttpServletRequest httpRequest) {
		return new ResponseEntity<>(ErrorResponse.builder()
				.timeStamp(LocalDateTime.now())
				.message(ex.getMessage())
				.error(CONFLICT_ERROR)
				.owner(OWNER)
				.path(httpRequest.getRequestURI())
				.build(), HttpStatus.CONFLICT);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleAllException(Exception ex, HttpServletRequest httpRequest) {
		return new ResponseEntity<>(ErrorResponse.builder()
				.timeStamp(LocalDateTime.now())
				.message(ex.getMessage())
				.error(SERVER_ERROR)
				.owner(OWNER)
				.path(httpRequest.getRequestURI())
				.build(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}