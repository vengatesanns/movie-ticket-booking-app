package com.showtime.userservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.showtime.userservice.exception.UserProfileServiceException;
import com.showtime.userservice.request.UserProfileRequest;
import com.showtime.userservice.service.UserProfileService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserProfileController {

	private final UserProfileService userProfileService;

	@PostMapping("/create-profile")
	public void createUserProfileDetails(@RequestBody UserProfileRequest userProfileRequest)
			throws UserProfileServiceException {
		userProfileService.createUserProfile(userProfileRequest);
	}

}
