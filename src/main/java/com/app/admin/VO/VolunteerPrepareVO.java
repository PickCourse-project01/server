package com.app.admin.VO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VolunteerPrepareVO {
    private int id;
    private String prepareContent;
    private int volunteerId;
}
