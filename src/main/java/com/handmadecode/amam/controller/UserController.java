package com.handmadecode.amam.controller;

import com.handmadecode.amam.model.User;
import com.handmadecode.amam.model.UserAdapter;
import com.handmadecode.amam.request.UserRequest;
import com.handmadecode.amam.response.UserResponse;
import com.handmadecode.amam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody UserResponse post( @RequestBody final UserRequest userRequest){
        User user= UserAdapter.toUser(userRequest);
       List errs = new ArrayList<String>();
       try{
            user = userService.create(user);

       }catch (Exception e){
           errs.add(e.getMessage());
       }

       return UserAdapter.toUserResponse(user,errs);
    }
}
