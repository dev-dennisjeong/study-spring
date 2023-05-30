package com.example.ex02.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@Slf4j
public class MemberControllerTests {
    @Autowired
    WebApplicationContext webApplicationContext;

    MockMvc mockMvc;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void joinTest() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/member/join")).andReturn().getModelAndView().getModelMap().toString());
        mockMvc.perform(MockMvcRequestBuilders.post("/member/join")
                .param("memberIdentification", "hds123")
                .param("memberPassword", "hds123!!")
        ).andExpect(MockMvcResultMatchers.status().is3xxRedirection());
    }
}
