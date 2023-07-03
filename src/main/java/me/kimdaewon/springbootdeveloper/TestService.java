package me.kimdaewon.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired // 의존성 주입으로 인한 객체 자동 생성
    MemberRepository memberRepository;

    public List<Member> getAllMembers() { //모든 멤버에 대한 데이터
        return memberRepository.findAll(); // 레포지토리와 연결하여 모든 데이터 찾기
    }
}
