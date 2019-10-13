package com.handmadecode.amam.adapter;

import com.handmadecode.amam.model.UserRequest;
import com.handmadecode.amam.model.User;
import com.handmadecode.amam.model.UserResponse;

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
