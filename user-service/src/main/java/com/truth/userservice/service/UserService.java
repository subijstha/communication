package com.truth.userservice.service;

import com.truth.userservice.model.User;
import com.truth.userservice.service.DTO.ResponseDto;

public interface UserService {
    User saveUser(User user);
    ResponseDto getUser(Long userId);
}
