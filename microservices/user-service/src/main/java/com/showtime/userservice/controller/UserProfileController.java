package com.showtime.userservice.controller;

import com.showtime.userservice.bean.request.UserProfileRequest;
import com.showtime.userservice.domain.UserProfile;
import com.showtime.userservice.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Vengatesan Nagarajan
 */
@RestController
@RequiredArgsConstructor
public class UserProfileController {

    private final UserProfileService userProfileService;

    /**
     * To Create User Profile Based on User Id of IAM
     *
     * @param userProfileRequest
     */
    @PostMapping(path = "/create-profile", consumes = "application/json", produces = "application/json")
    public void createUserProfileDetails(@RequestBody UserProfileRequest userProfileRequest) {
        userProfileService.createUserProfile(userProfileRequest);
    }

    @GetMapping(path = "/get-profile/{user-id}", consumes = "text/plain", produces = "application/json")
    public ResponseEntity<UserProfile> getUserProfile(@PathVariable String userId) {
        return ResponseEntity.ok(userProfileService.fetchUserProfile(userId));
    }

}
