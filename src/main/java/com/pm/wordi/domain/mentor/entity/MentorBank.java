package com.pm.wordi.domain.mentor.entity;

import com.pm.wordi.commons.utils.constants.entity.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MentorBank extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentorBankId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mentorId")
    private Mentor mentor;

    private String bankName;

    private String bankAccount;

    private String depositor;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;
}
