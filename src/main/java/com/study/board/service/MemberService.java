package com.study.board.service;

import com.study.board.domain.Member;
import com.study.board.repository.MemberRepository;
import com.study.board.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService { // controller 로 넘어온 것들을 repository 에 저장, 호출

    // MemberService & MemoryMemberRepository 다른 인스턴스 쓰고있음
    // private final MemberRepository memberRepository = new MemoryMemberRepository();
    // 같은 인스턴스 사용하도록 바꿈
    private final MemberRepository memberRepository;


    @Autowired
    public MemberService(MemberRepository memberRepository) {   // new에서 생성하는게 아니라 외부에서 넣어주도록 함 > DI
        this.memberRepository = memberRepository;
    }

    // 회원 가입
    public Long join(Member member) {
        validateDuplicateMember(member);    // 중복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    // 회원 검증
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    // 회원 검색
    public List<Member> findMembers(){
        return memberRepository.finaAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
