package com.pm.wordi.domain.mentoring.entity;

import com.pm.wordi.domain.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.mentor.entity.Mentor;
import com.pm.wordi.domain.review.entity.Review;
import com.pm.wordi.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Mentoring extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MENTORING_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MENTOR_ID")
    private Mentor mentor;

//    @OneToOne(mappedBy = "mentoring")
//    private Payment payment;
//
//    @OneToOne(mappedBy = "mentoring")
//    private Review review;

    private Long price;

    private String questions;

    private LocalDateTime requestSchedule1;

    private LocalDateTime requestSchedule2;

    private LocalDateTime selectedSchedule;

    private String refusalMessage;

    private boolean isReviewed;

    @Enumerated(EnumType.STRING)
    private MentoringProcess processed;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;


}
