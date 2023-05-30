package com.example.ex02.mapper;

import com.example.ex02.domain.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
//    회원 가입
    public void insert(MemberVO memberVO);
//    회원 조회
    public MemberVO select(Long memberId);
//    회원 수정
    public void update(MemberVO memberVO);
//    회원 삭제
    public void delete(Long memberId);
}
