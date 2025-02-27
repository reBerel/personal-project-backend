package com.example.demo.user.dto;

import com.example.demo.user.entity.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private Long userId;
    private String email;
    private String nickName;
    private String Name;
    private String uid;

    public UserDto(User user) {
        this.userId = user.getUserId();
        this.nickName = user.getNickName();
        this.Name = user.getName();
        this.email = user.getEmail();
        this.uid = user.getUid();
    }
}
