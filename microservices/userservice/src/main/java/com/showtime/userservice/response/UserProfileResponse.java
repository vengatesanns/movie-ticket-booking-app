package com.showtime.userservice.response;

import java.util.Set;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserProfileResponse {

	private UUID userId;
	private String firstname;
	private String lastname;
	private String email;
	private String mobileNo;
	private Integer age;
	private Boolean emailNotification;
	private Set<String> genre;

}
