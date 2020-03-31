package com.showtime.userservice.service.impl;

import org.springframework.stereotype.Service;

import com.showtime.userservice.dao.UserProfileDao;
import com.showtime.userservice.exception.UserProfileDaoException;
import com.showtime.userservice.exception.UserProfileServiceException;
import com.showtime.userservice.request.UserProfileRequest;
import com.showtime.userservice.service.UserProfileService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserProfileServiceImpl implements UserProfileService {

	private final UserProfileDao userProfileDao;

	@Override
	public void createUserProfile(UserProfileRequest userProfileRequest) throws UserProfileServiceException {
		try {
			userProfileDao.createUserProfile(userProfileRequest);
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
