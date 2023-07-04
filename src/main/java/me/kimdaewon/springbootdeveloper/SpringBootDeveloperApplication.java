package me.kimdaewon.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링부트어플리케이션으로만 볼 때는 큰 기능이 없지만 어노테이션으로 본다면 다양한 기능있다.
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}
