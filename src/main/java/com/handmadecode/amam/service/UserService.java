package com.handmadecode.amam.service;

import com.handmadecode.amam.model.User;
import com.handmadecode.amam.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    //user를 받아서 리포지토리?에 전달하는 메소드
    //지금은 받은 값을 그대로 보내줌
    public User create(final User user){
        //user.auth setting
        user.setAuth(false);
        if(user==null){
            throw new NullPointerException("user cannot be null");
        }
        return userRepo.insert(user);
    }

    public boolean get(final String email){
        return userRepo.existsById(email);
    }


}
