package com.sprata.DTO;

import com.sprata.entity.Member;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
    private String pw;

    public UserResponseDto(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.email = member.getEmail();
        this.pw = member.getPw();
    }
}
