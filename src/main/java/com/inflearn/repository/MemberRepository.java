package com.inflearn.repository;

import com.inflearn.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Memberber save(Member member);

    Optional<Member> findById(Long id);

    Optional<Member> findByName(String name);

    List<Member> findAll();
}
