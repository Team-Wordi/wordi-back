package com.pm.wordi.domain.mentor.entity;

import com.pm.wordi.domain.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.user.entity.User;

import javax.persistence.*;

public class MentorLike extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentorLikeId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "mentorId")
    private Mentor mentor;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;

}
