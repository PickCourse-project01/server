package com.app.pickcourse.repository;

import com.app.pickcourse.domain.dto.PlanDTO;
import com.app.pickcourse.domain.vo.PlanVO;
import com.app.pickcourse.mapper.PlanMapper;
import com.app.pickcourse.mapper.ScheduleMapper;
import com.app.pickcourse.util.Pagination;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PlanDAO {
    private final PlanMapper planMapper;
//  추가
    public void save(PlanVO planVO) {
        planMapper.insert(planVO);
    }
//    전체조회
    public List<PlanVO> findAll() {
        return planMapper.selectAll();
    }
//    ID로 조회
    public Optional<PlanDTO> findById(Long id) {
        return planMapper.selectById(id);
    }
//    수정
    public void setPlan(PlanDTO planDTO) {
        planMapper.update(planDTO);
    }
//    삭제
    public void delete(Long id) {
        planMapper.deleteById(id);
    }

}
