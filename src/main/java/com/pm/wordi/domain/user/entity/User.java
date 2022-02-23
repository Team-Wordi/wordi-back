package com.pm.wordi.domain.user.entity;

import com.pm.wordi.domain.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.mentoring.entity.Mentoring;
import com.pm.wordi.domain.mentoring.entity.Payment;
import com.pm.wordi.domain.review.entity.Review;
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
    @Column(name = "USER_ID")
    private Long id;

//    @OneToMany(mappedBy = "user")
//    private List<UserKeyword> keywordList = new ArrayList<>();
//
//    @OneToMany(mappedBy = "user")
//    private List<UserNation> nationList = new ArrayList<>();
//
//    @OneToMany(mappedBy = "user")
//    private List<Mentoring> mentoringList = new ArrayList<>();
//
//    @OneToMany(mappedBy = "user")
//    private List<Review> reviewList = new ArrayList<>();
//
//    @OneToMany(mappedBy = "user")
//    private List<Payment> paymentList = new ArrayList<>();
//
//    @OneToMany(mappedBy = "user")
//    private List<Notice> noticeList = new ArrayList<>();

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
