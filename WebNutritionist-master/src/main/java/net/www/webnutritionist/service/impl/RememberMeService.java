package net.www.webnutritionist.service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.rememberme.PersistentTokenBasedRememberMeServices;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Service;

@Service
public class RememberMeService extends PersistentTokenBasedRememberMeServices {

	@Autowired
	public RememberMeService(UserDetailsService userDetailsService, PersistentTokenRepository tokenRepository) {
		super("webnutritionist-online", userDetailsService, tokenRepository);
	}

	public void createAutoLoginToken(HttpServletRequest request, HttpServletResponse response, Authentication successfulAuthentication) {
		super.onLoginSuccess(request, response, successfulAuthentication);
	}
}
