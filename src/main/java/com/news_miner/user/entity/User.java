package com.news_miner.user.entity;

import com.news_miner.global.entity.BaseTimeEntity;
import com.news_miner.user.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    @Comment(value = "이름")
    private String name;

    @Column(name = "nickname", nullable = false)
    @Comment(value = "닉네임")
    private String nickname;

    @Column(name = "email", nullable = false)
    @Comment(value = "이메일")
    private String email;

    @Column(name = "password", nullable = false)
    @Comment(value = "비밀번호")
    private String password;

    @Column(name="delete_reason", columnDefinition = "TEXT")
    private String deleteReason;

    @Column(name = "deleted_at", columnDefinition = "DATETIME(0) DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime deletedAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    @Comment(value = "역할")
    private Role role;

    // 회원 탈퇴 로직
    public void deleteUser(String deleteReason) {
        this.deletedAt = LocalDateTime.now();
        this.deleteReason = deleteReason;
    }

}
