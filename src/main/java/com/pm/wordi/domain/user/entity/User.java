package com.pm.wordi.domain.user.entity;

import com.pm.wordi.domain.common.UserRole;
import com.pm.wordi.domain.common.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long id;

    private String email;

    private String password;

    private String phoneNumber;

    private String userName;

    private String nickname;

    private String refreshToken;

    private String fcmToken;

    private boolean isOAuth2;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    private String likeNations;

    private String keywords;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;


}
