package com.showtime.userservice.dao;

import java.util.Optional;
import java.util.UUID;

import com.showtime.userservice.domain.UserProfile;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
public interface UserProfileDao {

	/**
	 * To create new user profile based on user id of IAM
	 * 
	 * @param userProfile
	 */
	public void createUserProfile(UserProfile userProfile);

	/**
	 * To fetch the user profile based on user id
	 * 
	 * @param userId
	 * @return fetched User Profile
	 */
	public Optional<UserProfile> readUserProfile(UUID userId);

	public void updateUserProfile();

	public void deleteUserProfile();
}
