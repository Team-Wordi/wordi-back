package com.pm.wordi.domain.review.entity;


import com.pm.wordi.domain.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.mentor.entity.Mentor;
import com.pm.wordi.domain.mentoring.entity.Mentoring;
import com.pm.wordi.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REVIEW_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MENTOR_ID")
    private Mentor mentor;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MENTORING_ID")
    private Mentoring mentoring;

    private String content;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;


}
