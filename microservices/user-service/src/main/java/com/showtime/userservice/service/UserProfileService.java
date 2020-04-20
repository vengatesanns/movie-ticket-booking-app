package com.showtime.userservice.service;

import com.showtime.userservice.bean.request.UserProfileRequest;
import com.showtime.userservice.domain.UserProfile;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
public interface UserProfileService {

	/**
	 * To Create User Profile with additional information
	 * 
	 * @param userProfileRequest
	 */
	public void createUserProfile(UserProfileRequest userProfileRequest);

	/**
	 * To Fetch the User Profile based on the user-id
	 * 
	 * @param userId
	 * @return Fetched User Profile
	 */
	public UserProfile fetchUserProfile(String userId);

	public void updateUserProfile();

	public void deleteUserProfile();

}
