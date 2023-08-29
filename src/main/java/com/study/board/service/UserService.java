package com.study.board.service;

import com.study.board.dto.UserDto;

import java.util.List;

public interface UserService {
    public boolean join(UserDto user);
    public List<UserDto> getUserList();
}
