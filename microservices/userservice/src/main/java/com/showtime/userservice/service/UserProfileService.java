package com.showtime.userservice.service;

import com.showtime.userservice.exception.UserProfileServiceException;
import com.showtime.userservice.request.UserProfileRequest;

public interface UserProfileService {

	public void createUserProfile(UserProfileRequest userProfileRequest) throws UserProfileServiceException;

	public void updateUserProfile();

	public void fetchUserProfile();

	public void deleteUserProfile();

}
