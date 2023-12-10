package com.example.guestbook.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // 방명록 항목의 고유 ID
    private String name;  // 작성자 이름
    private String content;  // 방명록 내용
    private String team;  // 팀 이름

    public Entry() {
        // 기본 생성자
    }

    public Entry(String name, String content, String team) {
        this.name = name;
        this.content = content;
        this.team = team;
    } // 수정된 사용자 정의 생성자

    // id에 대한 게터와 세터
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // name에 대한 게터와 세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // content에 대한 게터와 세터
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // team에 대한 게터와 세터
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
