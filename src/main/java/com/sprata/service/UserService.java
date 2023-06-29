package com.sprata.service;

import com.sprata.DTO.UserResponseDto;
import com.sprata.repositroy.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDto findUser(Long id) {
        return new UserResponseDto(userRepository.findById(id).orElseThrow(()->new IllegalArgumentException("회원 상세 조회 실패.")));
    }

    public List<UserResponseDto> findAllUser() {
        return userRepository.findAllBy().stream().map(UserResponseDto::new).toList();
    }
}