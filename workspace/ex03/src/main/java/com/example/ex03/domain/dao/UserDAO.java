package com.example.ex03.domain.dao;

import com.example.ex03.domain.vo.ProductVO;
import com.example.ex03.domain.vo.UserVO;
import com.example.ex03.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;

    public List<UserVO> findAll(){
        return userMapper.selectAll();
    }

    public UserVO findById(Long userId){
        return userMapper.select(userId);
    }
}
