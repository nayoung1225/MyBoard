package com.study.board.repository;

import com.study.board.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) { // 회원을 생성해주는 메소드
        member.setId(++sequence);           // id 자동증가
        store.put(member.getId(), member);  // store에 저장
        return member;
    }

    @Override
    public Optional<Member> findById(Long id){
        return Optional.ofNullable(store.get(id));  // store 에서 id 가져옴
    }

    @Override
    public Optional<Member> findByName(String name){
        return store.values().stream()
                .filter(member -> member.getName().equals(name))    // 같은 경우에만 필터링
                .findAny();         // 하나 찾아지면 반환, 없으면 null
    }

    @Override
    public List<Member> finaAll() {
        return new ArrayList<>(store.values());     // store 에 담긴 모든 값들을 arrayList 로 가져옴
    }

}
