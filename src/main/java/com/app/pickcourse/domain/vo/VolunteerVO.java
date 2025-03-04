package com.app.pickcourse.domain.vo;

import lombok.*;

@NoArgsConstructor
@Getter @Setter @ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class VolunteerVO {
    @EqualsAndHashCode.Include
    private Long   id;

    private String volunteerStartDate;
    private String volunteerEndDate;
    private String volunteerDeadline;
    private Long   courseId;
    private String createdDate;
    private String updatedDate;
}