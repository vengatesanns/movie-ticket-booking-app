package com.showtime.userservice.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.showtime.userservice.bean.request.UserProfileRequest;
import com.showtime.userservice.dao.UserProfileDao;
import com.showtime.userservice.domain.UserProfile;
import com.showtime.userservice.exception.UserProfileDaoException;
import com.showtime.userservice.exception.UserProfileServiceException;
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
		} catch (UserProfileDaoException ex) {
			log.debug("##### Error While saving User Profile in method -> createUserProfile()", ex);
			throw new UserProfileServiceException(ex.getMessage());
		}
	}

	@Override
	public void updateUserProfile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fetchUserProfile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserProfile() {
		// TODO Auto-generated method stub

	}

}
