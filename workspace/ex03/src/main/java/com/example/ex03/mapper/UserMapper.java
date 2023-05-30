package com.example.ex03.mapper;

import com.example.ex03.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public UserVO select(Long userId);
    public List<UserVO> selectAll();
}
