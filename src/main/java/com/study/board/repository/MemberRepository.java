package com.study.board.repository;

import com.study.board.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface MemberRepository{

    // 회원생성
    Member save(Member member);

    // id로 회원검색
    Optional<Member> findById(Long id);

    // name으로 회원검색
    Optional<Member> findByName(String name);

    // 회원 모두 출력
    List<Member> finaAll();
}
