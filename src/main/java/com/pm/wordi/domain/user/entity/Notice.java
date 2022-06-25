package com.pm.wordi.domain.user.entity;

import com.pm.wordi.commons.utils.constants.entity.BaseStatus;
import com.pm.wordi.commons.utils.constants.entity.NoticeClassfication;
import com.pm.wordi.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Notice extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noticeId")
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
