package com.example.demo.controller;


import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import com.example.demo.vo.UserResponseVO;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/v1/users")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    public ResponseEntity<UserResponseVO> getUsers(){
        return  userService.getUsers();
    }
}
