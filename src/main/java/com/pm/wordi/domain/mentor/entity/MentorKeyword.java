package com.pm.wordi.domain.mentor.entity;

import com.pm.wordi.commons.utils.constants.entity.Keyword;
import com.pm.wordi.commons.utils.constants.entity.BaseStatus;
import com.pm.wordi.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MentorKeyword extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentorKeywordId")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mentorId")
    private Mentor mentor;

    @Enumerated(EnumType.STRING)
    private Keyword keyword;

    @Enumerated(EnumType.STRING)
    private BaseStatus status;

}
