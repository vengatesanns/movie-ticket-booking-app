package com.showtime.authserver.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;

import lombok.RequiredArgsConstructor;

/**
 * 
 * @author Vengatesan Nagarajan
 *
 */
@RequiredArgsConstructor
public class CustomAuthenticationManager implements AuthenticationManager {

	private final CustomAuthenticationProvider customAuthenticationProvider;

	@Override
	public Authentication authenticate(Authentication authentication) {
		return customAuthenticationProvider.authenticate(authentication);
	}
}
