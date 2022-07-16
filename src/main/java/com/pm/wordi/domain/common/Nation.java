package com.pm.wordi.domain.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Nation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nationId")
    private Long id;

    private String nationName;

    private String nationImage;

}
