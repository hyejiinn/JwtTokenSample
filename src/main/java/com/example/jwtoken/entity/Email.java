package com.example.jwtoken.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emailNo;

    private String email;
    private String content;
    private LocalDateTime createdAt;

    public Email() {
    }

    @Builder
    public Email(Long emailNo, String email, String content, LocalDateTime createdAt) {
        this.emailNo = emailNo;
        this.email = email;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }

    public static Email of(String email, String content) {
        return Email.builder()
                .email(email)
                .content(content)
                .build();
    }
}
