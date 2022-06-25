package com.pm.wordi.domain.mentor.entity;

import com.pm.wordi.domain.constants.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.constants.MentorRole;
import com.pm.wordi.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Mentor extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentorId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
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


    private LocalDate startDate;

    private LocalDate endDate;

    private String profileImageUrl;

    private Long price;

    private String introductionTitle;

    private String introduction;

    private String entryCertificationName;

    private String entryCertificationUrl;

    private String visaCertificationName;

    private String visaCertificationUrl;

    private String openChatUrl;

    @Enumerated(EnumType.STRING)
    private MentorRole role;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;


}
