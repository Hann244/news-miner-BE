package com.news_miner.user.enums;

public enum Role {
    ROLE_USER("회원"),
    ROLE_ADMIN("관리자");

    private final String role;

    Role(String roleName) {
        this.role = roleName;
    }
}
