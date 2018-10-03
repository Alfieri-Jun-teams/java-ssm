package com.jun.ssm.service;

import com.jun.ssm.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUser();
    User getUserByPhoneOrEmail(String emailOrPhone, Short state);
    User getUserById(Long userId);
}
