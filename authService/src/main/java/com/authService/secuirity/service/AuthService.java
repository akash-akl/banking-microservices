package com.authService.secuirity.service;

import com.authService.secuirity.dto.LoginRequest;
import com.authService.secuirity.dto.LoginResponse;
import com.authService.secuirity.dto.RegisterRequest;

public interface AuthService {
    void register(RegisterRequest request);
    LoginResponse login(LoginRequest request);
}