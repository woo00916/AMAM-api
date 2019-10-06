package com.handmadecode.amam.model;

import com.handmadecode.amam.request.UserRequest;
import com.handmadecode.amam.response.UserResponse;

import java.util.List;

public class UserAdapter {
    public static User toUser(final UserRequest userRequest){
        if(userRequest==null) return null;
        return User.builder().email(userRequest.getEmail()).pw(userRequest.getPw()).build();
    }

    public static UserResponse toUserResponse(final User user,final List<String> errs){
        return UserResponse.builder().user(user).errs(errs).build();
    }
}
