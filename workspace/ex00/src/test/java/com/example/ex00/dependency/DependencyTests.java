package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class DependencyTests {

    @Autowired // 단위 테스트에서는 필드 주입만 사용 가능하다.
    Coding coding;
    @Autowired
    Chef chef;
    @Autowired
    School school;
    @Autowired
    Student student;
    @Autowired
    Teacher teacher;

    @Test
    public void testCoding(){
        log.info(String.valueOf(coding));
        //NPE(NULL POINTER EXCEPTION) 방어 하기 위해 .toString()이 아니라 String.valueOf()로

        log.info(String.valueOf(chef));
        log.info(String.valueOf(school));
        log.info(String.valueOf(teacher));
        log.info(String.valueOf(student));
    }

}
