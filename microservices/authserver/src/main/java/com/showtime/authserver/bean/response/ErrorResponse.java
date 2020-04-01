package com.showtime.authserver.bean.response;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
@Data
@Builder
public class ErrorResponse {

	private LocalDateTime timeStamp;
	private String error;
	private String message;
	private String owner;
	private String path;
}