package com.pm.wordi.domain.user.entity;

import com.pm.wordi.domain.common.BaseStatus;
import com.pm.wordi.domain.common.NoticeClassfication;
import com.pm.wordi.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserNotification extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userNotificationId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @Enumerated(EnumType.STRING)
    private NoticeClassfication classfication;

    private String content;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;
}
