package com.pm.wordi.domain.user.entity;

import com.pm.wordi.domain.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Nation extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nationId")
    private Long id;

    private String nationName;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;

}
