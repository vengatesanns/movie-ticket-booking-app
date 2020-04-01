package com.showtime.userservice.dao.impl;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import org.springframework.stereotype.Repository;

import com.showtime.userservice.dao.UserProfileDao;
import com.showtime.userservice.domain.UserProfile;
import com.showtime.userservice.exception.UserProfileDaoException;
import com.showtime.userservice.repository.UserProfileRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
@Slf4j
@Repository
@RequiredArgsConstructor
public class UserProfileDaoImpl implements UserProfileDao {

	private final UserProfileRepository userProfileRepository;

	@Override
	public void createUserProfile(UserProfile userProfile) {
		try {
			userProfile.setUserId(userProfile.getUserId());
			LocalDateTime ldt = LocalDateTime.now();
			ZonedDateTime ldtZoned = ldt.atZone(ZoneId.systemDefault());
			userProfile.setCreatedAt(Date.from(ldtZoned.toInstant()));
			userProfile.setModifiedAt(Date.from(ldtZoned.toInstant()));
			userProfileRepository.save(userProfile);
		} catch (Exception ex) {
			log.debug("##### Error While saving User Profile in method -> createUserProfile()", ex);
			throw new UserProfileDaoException("Error while saving User Profile");
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
