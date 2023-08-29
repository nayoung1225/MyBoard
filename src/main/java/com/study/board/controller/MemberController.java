package com.study.board.controller;


import com.study.board.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
//    private final MemberService memberService = new MemberService();

    @Autowired
    private final MemberService memberService; // 객체 불변성 보장

    // 생성자로 연결
    @Autowired      // 스프링 컨테이너에 있는 memberservice 가져와 주입
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // 회원가입
    @GetMapping("/members/join")
    public String createForm(){
        return "members/joinForm";
    }


}
