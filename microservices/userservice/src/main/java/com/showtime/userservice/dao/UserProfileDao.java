package com.showtime.userservice.dao;

import com.showtime.userservice.domain.UserProfile;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
public interface UserProfileDao {

	public void createUserProfile(UserProfile userProfile);

	public void updateUserProfile();

	public void fetchUserProfile();

	public void deleteUserProfile();
}
