package com.app.pickcourse.service;

import com.app.pickcourse.domain.dto.RecentCourseDTO;
import com.app.pickcourse.repository.ParticipantDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class ParticipantService {

    private final ParticipantDAO participantDAO;


    public int getNormalCourseParticipationCount(Long memberId) {
        return participantDAO.getNormalCourseParticipationCount(memberId);
    }

    public int getVolunteerCourseParticipationCount(Long memberId) {
        return participantDAO.getVolunteerCourseParticipationCount(memberId);
    }

    public RecentCourseDTO getRecentCourse(Long memberId) {
        return participantDAO.getRecentCourse(memberId);
    }

    public List<RecentCourseDTO> getMyCourses(Long memberId) {
        return participantDAO.getMyCourses(memberId);
    }
}
