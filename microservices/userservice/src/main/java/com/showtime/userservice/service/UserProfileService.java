package com.showtime.userservice.service;

import com.showtime.userservice.bean.request.UserProfileRequest;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
public interface UserProfileService {

	public void createUserProfile(UserProfileRequest userProfileRequest);

	public void updateUserProfile();

	public void fetchUserProfile();

	public void deleteUserProfile();

}
