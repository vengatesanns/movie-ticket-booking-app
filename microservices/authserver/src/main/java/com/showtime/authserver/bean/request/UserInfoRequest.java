package com.showtime.authserver.bean.request;

import java.util.Set;
import java.util.UUID;

import lombok.Data;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
@Data
public class UserInfoRequest {

	private UUID userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;
	private String dateOfBirth;
	private String password;
	private String profileImage;

	// User Profile Service Request Attributes
	private Boolean emailNotification;
	private String location;
	private String gender;
	private Set<String> genre;

}
