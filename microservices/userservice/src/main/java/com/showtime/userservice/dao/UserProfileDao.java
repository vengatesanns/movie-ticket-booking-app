package com.showtime.userservice.dao;

import com.showtime.userservice.exception.UserProfileDaoException;
import com.showtime.userservice.request.UserProfileRequest;

public interface UserProfileDao {

	public void createUserProfile(UserProfileRequest userProfileRequest) throws UserProfileDaoException;

	public void updateUserProfile();

	public void fetchUserProfile();

	public void deleteUserProfile();
}
