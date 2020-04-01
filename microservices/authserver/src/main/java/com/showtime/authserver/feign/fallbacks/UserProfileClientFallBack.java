package com.showtime.authserver.feign.fallbacks;

import org.springframework.stereotype.Component;

import com.showtime.authserver.bean.request.UserInfoRequest;
import com.showtime.authserver.dao.UserDao;
import com.showtime.authserver.feign.api.UserProfileClient;

import lombok.RequiredArgsConstructor;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
@Component
@RequiredArgsConstructor
public class UserProfileClientFallBack implements UserProfileClient {

	private final UserDao userDao;

	/**
	 * To Revoke the already saved User Identity Details
	 */
	@Override
	public void createUserProfileDetails(UserInfoRequest userInfoRequest) {
		userDao.removeUserIdentityDetails(userInfoRequest.getUserId());
	}

}
