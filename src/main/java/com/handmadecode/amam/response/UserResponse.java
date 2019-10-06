package com.handmadecode.amam.response;

import com.handmadecode.amam.model.User;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class UserResponse extends ApiResponse<User>{

    @Builder
    public UserResponse(final User user, final List<String > errs){
        super(user);
        this.setErrs(errs);
    }
}
