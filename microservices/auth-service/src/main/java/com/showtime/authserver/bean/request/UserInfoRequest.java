package com.showtime.authserver.bean.request;

import lombok.Data;

import java.util.UUID;

/**
 * @author Vengatesan Nagarajan
 */
@Data
public class UserInfoRequest {

    private UUID userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;
    private String password;

}
