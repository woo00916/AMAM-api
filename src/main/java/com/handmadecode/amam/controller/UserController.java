package com.handmadecode.amam.controller;

import com.handmadecode.amam.model.User;
import com.handmadecode.amam.adapter.UserAdapter;
import com.handmadecode.amam.model.UserRequest;
import com.handmadecode.amam.model.UserResponse;
import com.handmadecode.amam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody boolean get(@RequestParam(value="email") String email){
       return   userService.get(email);
    }
    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody UserResponse post( @RequestBody final UserRequest userRequest){
        User user= UserAdapter.toUser(userRequest);
       List errs = new ArrayList<String>();
       try{
            user = userService.create(user);
            //email 송신

       }catch (Exception e){
           errs.add(e.getMessage());
       }
       return UserAdapter.toUserResponse(user,errs);
    }
}
