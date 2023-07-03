package me.kimdaewon.springbootdeveloper;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // 데이터 테이블에서 저장되있던 것을 가져온다.
public interface MemberRepository extends JpaRepository <Member, Long> { // 멤버하고 id를 가져오겠다.
}
