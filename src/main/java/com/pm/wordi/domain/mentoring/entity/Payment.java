package com.pm.wordi.domain.mentoring.entity;

import com.pm.wordi.domain.common.PaymentProcess;
import com.pm.wordi.domain.common.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.user.entity.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Payment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentId")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mentoringId")
    private Mentoring mentoring;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    private String orderNumber;

    private Long price;

    private String depositor;

    private String bankCode;

    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private PaymentProcess paymentStatus;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;


}
