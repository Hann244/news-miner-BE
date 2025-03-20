package com.news_miner.user.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSignUpRequestDto {

    @NotBlank(message = "이메일을 입력하세요.")
    @Email(message = "유효하지 않은 이메일 형식입니다.")
    private String email;

    @NotBlank(message = "비밀번호를 입력하세요.")
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\\\W)(?=\\\\S+$).{8,20}",
            message = "비밀번호는 8자 이상 20자 이하, 대소문자, 숫자, 특수문자를 포함하세요.")
    private String password;

    @NotBlank(message = "이름을 입력하세요.")
    private String name;

    @NotBlank(message = "닉네임을 입력하세요.")
    @Pattern(regexp = "^[a-zA-Z0-9가-힣]{1,10}$",
            message = "닉네임은 1글자 이상 10글자 이하로 특수문자를 제외하고 설정해주세요.")
    private String nickname;
}
