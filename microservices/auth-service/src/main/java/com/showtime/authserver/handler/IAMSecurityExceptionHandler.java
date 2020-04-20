package com.showtime.authserver.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;

import com.showtime.exception.handler.GlobalExceptionHandler;

@ControllerAdvice
public class IAMSecurityExceptionHandler extends GlobalExceptionHandler {

}
