package me.kimdaewon.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // RestController이 있어서 테스트 컨트롤러 가능
public class TestController {

    @Autowired // DI를 통해서 Component → Bean → Autowired가 만들어지고 객체가 생성됨
    TestService testService;

    @GetMapping("/test")  // 매핑이 있어서 그 에대한 getallmember 메소드를 만들어서 서비스랑 연결
    public List<Member> getAllMembrs() {
        List<Member> members = testService.getAllMembers(); //서비스 계층 존재
        return members;
    }
}
