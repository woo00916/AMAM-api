package com.handmadecode.amam.model;

import lombok.Builder;

import java.util.List;

public class UserResponse extends ApiResponse<User>{

    @Builder
    public UserResponse(final User user, final List<String > errs){
        super(user);
        this.setErrs(errs);
    }
}
