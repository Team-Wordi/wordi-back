package com.pm.wordi.domain.mentor.entity;

import com.pm.wordi.commons.utils.constants.entity.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MentorSchedule extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentorScheduleId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mentorId")
    private Mentor mentor;

    private String week;

    private String schedule;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;

}
