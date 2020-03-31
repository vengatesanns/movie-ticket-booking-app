package com.showtime.authserver.service;

import java.util.List;

import com.showtime.authserver.bean.request.UserInfoRequest;
import com.showtime.authserver.bean.request.UserSearchRequest;
import com.showtime.authserver.bean.response.UserResponse;
import com.showtime.authserver.domain.UserDetailsPrincipal;

/**
 * 
 * @author vengatesanns(HackPro)
 *
 */
public interface UserService {

	public UserDetailsPrincipal getUserByEmailOrPhoneNo(String emailOrPhoneNo);

	public void registerNewUser(UserInfoRequest userInfoRequest);

	public List<UserResponse> fetchUsers(UserSearchRequest userSearchRequest);

}