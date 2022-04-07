package yylab.findMy.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Member {

    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String memberId;

    @Column
    private String password;

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
