package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.vo.UserResponseVO;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<UserResponseVO> getUsers();
}
