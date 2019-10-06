package com.handmadecode.amam.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserRequest {
    private String email;
    private String pw;

}
