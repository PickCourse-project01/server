package com.app.pickcourse.domain.dto;

import com.app.pickcourse.domain.vo.PlanVO;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RankingDTO {
    @EqualsAndHashCode.Include
    private Long   id;
    private String planName;
    private String planStartDate;
    private String planEndDate;
    private LocalDate planDeadline;   // html에서 날짜 비교를 하기 위해서
    private int    planMaxPersonnel;
    private int    planMinPersonnel;
    private int    planPrice;
    private String planStartAddress;
    private String planContent;
    private String planFilePath;
    private String planFileSize;
    private String planFileName;
    private Long   courseId;
    private Long   memberId;
    private String memberNickname;
    private String memberFilePath;
    private String memberFileName;
    private int    participants;      // 참여자 수
    private double participationRate; // 참여율
    private int    realFeeds;         // 리얼후기 갯수
    private String isWish;           // Y 이면 찜
    private String CreatedDate;
    private String UpdatedDate;

}
