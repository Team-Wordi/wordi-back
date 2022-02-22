package com.pm.wordi.domain.user.entity;

import com.pm.wordi.domain.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<UserKeyword> userKeywordList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<UserKeyword> userNationList = new ArrayList<>();

    private String email;

    private String password;

    private String phoneNumber;

    private String userName;

    private String nickname;

    private String fcmToken;

    private boolean isOAuth2;

    private boolean isLogined;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;


}
