package com.app.pickcourse.mapper;

import com.app.pickcourse.domain.dto.CourseDTO;
import com.app.pickcourse.domain.vo.PathVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class PathMapperTests {
    @Autowired
    private PathMapper mapper;

    @Test
    public void postAddCourse() {
        PathVO path = new PathVO();
        path.setPathName("춘향가든");
        path.setPathAddress("남원로 18");
        path.setCourseId(2l);
        mapper.postAddCourse(path);
    }

    @Test
    public void getCourseDetail() {
        List<PathVO> list = mapper.getCourseDetail(2l);
        list.forEach(System.out::println);
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setPaths(list);
        log.info(courseDTO.toString());
    }

    @Test
    public void deleteEditCourse() {
        mapper.deleteEditCourse(2l);
    }
}
