package com.showtime.userservice.domain;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.driver.core.DataType.Name;

import lombok.Data;

@Data
@Table("user_profile")
public class UserProfile {

	@Column("user_id")
	private UUID userId;

	private String firstname;

	private String lastname;

	@Column("date_of_birth")
	private Date dateOfBirth;

	private String mobileNo;

	private String email;

	@Column("email_notification")
	private Boolean emailNotification;

	private String location;

	private String gender;

	@CassandraType(type = Name.SET, typeArguments = Name.TEXT)
	private Set<String> genre;

	@CassandraType(type = Name.TIMESTAMP)
	private Date createdAt;

	@Column("modified_at")
	@CassandraType(type = Name.TIMESTAMP)
	private Date modifiedAt;

}
