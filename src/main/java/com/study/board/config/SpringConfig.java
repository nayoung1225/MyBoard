package com.study.board.config;

import com.study.board.repository.MemberRepository;
import com.study.board.repository.MemoryMemberRepository;
import com.study.board.service.MemberService;
import org.springframework.context.annotation.Bean;

public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
