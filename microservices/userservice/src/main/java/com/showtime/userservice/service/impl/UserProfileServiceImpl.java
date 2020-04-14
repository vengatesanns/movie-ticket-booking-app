package com.showtime.userservice.service.impl;

import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.showtime.exception.UserProfilePersistentException;
import com.showtime.exception.UserProfileServiceException;
import com.showtime.userservice.bean.request.UserProfileRequest;
import com.showtime.userservice.dao.UserProfileDao;
import com.showtime.userservice.domain.UserProfile;
import com.showtime.userservice.service.UserProfileService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UserProfileServiceImpl implements UserProfileService {

	private final UserProfileDao userProfileDao;

	private final ModelMapper modelMapper;

	@Override
	public void createUserProfile(UserProfileRequest userProfileRequest) {
		try {
			UserProfile userProfile = modelMapper.map(userProfileRequest, UserProfile.class);
			userProfileDao.createUserProfile(userProfile);
		} catch (UserProfilePersistentException ex) {
			log.debug("##### Error While saving User Profile in method -> createUserProfile()", ex);
			throw new UserProfileServiceException(ex.getMessage());
		}
	}

	@Override
	public UserProfile fetchUserProfile(String userId) {
		try {
			Optional<UserProfile> userProfile = userProfileDao.readUserProfile(UUID.fromString(userId));
			return userProfile.isPresent() ? userProfile.get() : null;
		} catch (NumberFormatException ex) {
			log.debug("##### Given User ID is not valid UUID in method -> fetchUserProfile()", ex);
			throw new UserProfileServiceException("Invalid User ID!!!");
		} catch (Exception ex) {
			log.debug("##### Error While fetching User Profile in method -> fetchUserProfile()", ex);
			throw new UserProfileServiceException(ex.getMessage());
		}
	}

	@Override
	public void updateUserProfile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserProfile() {
		// TODO Auto-generated method stub

	}

}
