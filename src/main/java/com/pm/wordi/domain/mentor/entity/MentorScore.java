package com.pm.wordi.domain.mentor.entity;

import com.pm.wordi.commons.utils.constants.entity.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.user.entity.User;

import javax.persistence.*;

public class MentorScore extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentorScoreId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "mentorId")
    private Mentor mentor;

    private Integer score;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;

}
