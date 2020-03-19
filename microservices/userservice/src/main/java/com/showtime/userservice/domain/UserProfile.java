package com.showtime.userservice.domain;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;

@Data
@Table("user_profiles")
public class UserProfile {

	@PrimaryKey
	@Column("user_id")
	private UUID userId;

	private String firstname;

	private String lastname;

	private String email;

	@Column("mobile_no")
	private String mobileNo;

	private Integer age;

	@Column("email_notification")
	private Boolean emailNotification;

	private String genre;

}
