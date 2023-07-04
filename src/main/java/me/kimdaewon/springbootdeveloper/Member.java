package me.kimdaewon.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@NoArgsConstructor // TODO 해석 필요 여기에 필드에 쓴 모든생성자만 만들어줌
@AllArgsConstructor // TODO 해석 필요 기본 생성자를 만들어줌
@Getter // 게터 함수를 만들어준다.
@Entity // 객체클래스를 orm(jpa)를 통해서 db table를 생성
public class Member { // 여기가 엔티티의 틀 -> 디비 테이블과 객체가 맵핑된다.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false) // 컬럼의 특성도 설정해준다. 그게 nullable을 허용하지 않는다 위 내용도 같다.
    private String name;


}
