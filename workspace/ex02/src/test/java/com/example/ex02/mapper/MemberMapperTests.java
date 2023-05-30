package com.example.ex02.mapper;

import com.example.ex02.domain.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberMapperTests {
    @Autowired
    MemberMapper memberMapper;

    @Test
    public void insertTest(){
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberIdentification("asd123");
        memberVO.setMemberPassword("asd123123!!!");
        memberMapper.insert(memberVO);
    }

    @Test
    public void updateTest(){
        MemberVO memberVO = memberMapper.select(1L);
        memberVO.setMemberPassword("asd1234!@#");
        memberMapper.update(memberVO);
    }

    @Test
    public void deleteTest(){
        MemberVO memberVO = memberMapper.select(1L);
        memberMapper.delete(1L);
    }

}
