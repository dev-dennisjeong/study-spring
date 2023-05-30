package com.example.ex02.controller;

import com.example.ex02.domain.vo.MemberVO;
import com.example.ex02.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member/*")
public class MemberController {
    private final MemberMapper memberMapper;

//    가입
    @GetMapping("join")
    public void join(Model model){
        model.addAttribute(new MemberVO());
    }

//    가입 완료
    @PostMapping("join")
    public RedirectView join(MemberVO memberVO, RedirectAttributes redirectAttributes){
        memberMapper.insert(memberVO);
        return new RedirectView("/member/main");
    }
}
