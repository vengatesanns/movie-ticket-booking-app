package com.showtime.authserver.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.cassandra.CassandraConnectionFailureException;

import com.showtime.authserver.domain.User;
import com.showtime.authserver.exception.PersistentException;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
public interface UserDao {

	/**
	 * To fetch user based on Email Or Phone No
	 * 
	 * @param emailOrPhoneNo
	 * @return
	 */
	public Optional<User> findByEmailOrPhoneNo(String emailOrPhoneNo);

	/**
	 * To Save New User Details or Register New User
	 * 
	 * @param user
	 * @throws CassandraConnectionFailureException
	 * @throws PersistentException
	 */
	public void saveUserDetails(User user);

	/**
	 * To fetch All Users Information Based on Pagination criteria
	 * 
	 * @param reqRecordCount
	 * @param reqPageNo
	 * @return
	 */
	public List<User> getAllUsers(int reqRecordCount, int reqPageNo);

	/**
	 * To Remove the existing User based on USER ID
	 * 
	 * @param userId
	 */
	public void removeUserIdentityDetails(UUID userId);

}