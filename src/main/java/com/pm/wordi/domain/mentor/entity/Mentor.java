package com.pm.wordi.domain.mentor.entity;

import com.pm.wordi.domain.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.mentoring.entity.Mentoring;
import com.pm.wordi.domain.review.entity.Review;
import com.pm.wordi.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Mentor extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MENTOR_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

//    @OneToMany(mappedBy = "mentor")
//    private List<MentorKeyword> keywordList = new ArrayList<>();
//
//    @OneToMany(mappedBy = "mentor")
//    private List<MentorSchedule> scheduleList = new ArrayList<>();
//
//    @OneToMany(mappedBy = "mentor")
//    private List<Mentoring> mentoringList = new ArrayList<>();
//
//    @OneToMany(mappedBy = "mentor")
//    private List<Review> reviewList = new ArrayList<>();

    private String nation;

    private LocalDate startDate;

    private LocalDate endDate;

    private String profileImageUrl;

    private Long price;

    private String introductionTitle;

    private String introduction;

    private String certificationName;

    private String certificationUrl;

    private String openChatUrl;

    @Enumerated(EnumType.STRING)
    private MentorRole role;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;


}
