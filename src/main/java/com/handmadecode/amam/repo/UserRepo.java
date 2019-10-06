package com.handmadecode.amam.repo;

import com.handmadecode.amam.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {


}
