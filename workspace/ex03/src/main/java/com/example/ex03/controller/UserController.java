package com.example.ex03.controller;

import com.example.ex03.domain.vo.UserVO;
import com.example.ex03.mapper.UserMapper;
import com.example.ex03.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController{
    private final UserService userService;

//    회원 조회
    @GetMapping("detail/users/{userId}")
    public UserVO show(@PathVariable("userId") Long userId){
        return userService.getUser(userId);
    }

    @GetMapping("list/users")
    public List<UserVO> showList(){
        List<UserVO> users = userService.getList();
        return users;
    }
}

