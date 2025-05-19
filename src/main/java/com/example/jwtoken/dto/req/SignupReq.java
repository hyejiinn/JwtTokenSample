package com.example.jwtoken.dto.req;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupReq {
    private String email;
    private String password;
    private String name;

    public SignupReq() {
    }

    @Builder
    public SignupReq(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }
}
