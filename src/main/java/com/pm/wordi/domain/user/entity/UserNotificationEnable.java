package com.pm.wordi.domain.user.entity;

import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.common.BaseStatus;
import com.pm.wordi.domain.common.NoticeClassfication;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserNotificationEnable extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userNotificationEnable")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
    private boolean push;

    private boolean event;
    @Enumerated(EnumType.STRING)
    private BaseStatus status;
}
