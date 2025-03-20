package com.news_miner.user.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserSignUpResponseDto {
    private Long id;
    private String email;
    private String nickname;
}
