package com.pm.wordi.domain.mentor.entity;

import com.pm.wordi.domain.common.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.common.MentorRole;
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

    private String schedules;

    private String keywords;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;


}
