package com.showtime.userservice.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.showtime.userservice.domain.UserProfile;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
@Repository
public interface UserProfileRepository extends CassandraRepository<UserProfile, UUID> {

	Optional<UserProfile> findByUserId(UUID userId);

}
