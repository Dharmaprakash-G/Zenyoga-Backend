package com.java.zenyoga.service;

import com.java.zenyoga.dto.Request.ForgotPasswordRequest;
import com.java.zenyoga.dto.Request.LoginRequest;
import com.java.zenyoga.dto.Request.RegisterRequest;
import com.java.zenyoga.dto.Response.BasicResponse;
import com.java.zenyoga.dto.Response.LoginResponse;

public interface AuthenticationService {

    BasicResponse<String> register(RegisterRequest registerRequest);

    BasicResponse<LoginResponse> login(LoginRequest loginRequest);

    BasicResponse<String> forgotPassword(ForgotPasswordRequest forgotPasswordRequest);

}
