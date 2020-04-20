package com.showtime.userservice.domain;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.driver.core.DataType.Name;

import lombok.Data;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
@Data
@Table("user_profile")
public class UserProfile {

	@PrimaryKey("user_id")
	private UUID userId;

	@Column("firstname")
	private String firstName;

	@Column("lastname")
	private String lastName;

	@Column("date_of_birth")
	private Date dateOfBirth;

	@Column("phone_no")
	private String phoneNo;

	@Column("email")
	private String email;

	@Column("email_notification")
	private Boolean emailNotification;

	@Column("location")
	private String location;

	@Column("gender")
	private String gender;

	@Column("genre")
	@CassandraType(type = Name.SET, typeArguments = Name.TEXT)
	private Set<String> genre;

	@Column("created_at")
	@CassandraType(type = Name.TIMESTAMP)
	private Date createdAt;

	@Column("modified_at")
	@CassandraType(type = Name.TIMESTAMP)
	private Date modifiedAt;

}
