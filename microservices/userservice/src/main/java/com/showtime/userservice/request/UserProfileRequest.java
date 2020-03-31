package com.showtime.userservice.request;

import java.util.Date;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserProfileRequest {

	private String firstname;
	private String lastname;
	private String email;
	private String mobileNo;
	private Date dateOfBirth;
	private Boolean emailNotification;
	private String location;
	private String gender;
	private Set<String> genre;

}
