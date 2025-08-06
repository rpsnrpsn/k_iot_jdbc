package org.example.db.entity;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
// : JDBC 또는 ORM(DB와 Java를 객체화하여 연동하는 체계)에서는
//      , 빈 객체를 먼저 만들고 setter로 값을 넣는 방식을 사용
// >> AllArgsConstructor도 NoArgsConstructor가 전제되어야 함
@Getter
@Setter
@ToString
public class Member {
    private int id;
    private String name;
    private String email;
}
