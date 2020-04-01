package com.showtime.userservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.showtime.userservice.bean.request.UserProfileRequest;
import com.showtime.userservice.service.UserProfileService;

import lombok.RequiredArgsConstructor;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
@RestController
@RequiredArgsConstructor
public class UserProfileController {

	private final UserProfileService userProfileService;

	@PostMapping("/create-profile")
	public void createUserProfileDetails(@RequestBody UserProfileRequest userProfileRequest) {
		if(true) {
			throw new RuntimeException("error");
		}
		userProfileService.createUserProfile(userProfileRequest);
	}

}
