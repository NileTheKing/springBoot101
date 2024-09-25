package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);//optional쓰면 null리턴될때 처리 쉬움
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
