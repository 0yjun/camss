package com.hellojpa.jpa.repository;

import com.hellojpa.jpa.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {
    Optional<Member> findById(String id);
    Member save(Member member);
}
