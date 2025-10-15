package com.mapalad.ecommerce.services.auth;

import com.mapalad.ecommerce.dto.SignupRequest;
import com.mapalad.ecommerce.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);

    Boolean hasUserWithEmail(String email);
}
