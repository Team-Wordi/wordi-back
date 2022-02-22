package com.pm.wordi.domain.user.entity;

import com.pm.wordi.domain.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import com.pm.wordi.domain.Keyword;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserNation extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userNationId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nationId")
    private Nation nation;

    private BaseStatus status;
}
