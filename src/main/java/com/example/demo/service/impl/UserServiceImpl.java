package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import com.example.demo.vo.UserResponseVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public ResponseEntity<UserResponseVO> getUsers() {
        List<User> list = userRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK.value()).body(new UserResponseVO(HttpStatus.OK.value(), "success", list, list.size()));
    }
}
