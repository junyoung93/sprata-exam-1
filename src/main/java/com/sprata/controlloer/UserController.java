package com.test2.controlloer;

import com.test2.DTO.UserResponseDto;
import com.test2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;



    @GetMapping("/user/{id}")
    public UserResponseDto findUser(@PathVariable Long id) {
        return userService.findUser(id);
    }

    /**
     * 회원의 전체 목록을 조회하는 API
     */
    @GetMapping("/user")
    public List<UserResponseDto> findAllUser(){
            return userService.findAllUser();
        }
    }
