package com.ticketbox.userservice.domain;

import lombok.Data;

@Data
public class UserProfile {

	private String customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNo;
	private Integer age;
	private Boolean emailNotification;
	private String genre;

}
