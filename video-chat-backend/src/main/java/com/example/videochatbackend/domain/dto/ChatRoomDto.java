package com.example.videochatbackend.domain.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class ChatRoomDto {

    private long roomId;

    @NotEmpty
    private String roomName;

    private String password;
}
