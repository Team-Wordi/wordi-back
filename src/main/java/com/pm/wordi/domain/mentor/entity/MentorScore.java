package com.pm.wordi.domain.mentor.entity;

import com.pm.wordi.domain.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.user.entity.User;

import javax.persistence.*;

public class MentorScore extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MENTOR_SCORE_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "USER_ID")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "MENTOR_ID")
    private Mentor mentor;

    private Long score;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;

}
