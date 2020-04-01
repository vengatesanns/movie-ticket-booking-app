package com.showtime.userservice.bean.request;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import lombok.Data;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
@Data
public class UserProfileRequest {

	private UUID userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;
	private Date dateOfBirth;
	private Boolean emailNotification;
	private String location;
	private String gender;
	private Set<String> genre;

}
