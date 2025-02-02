package com.ulipese.solid.repositories;

import com.ulipese.solid.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
    User findByName(String name);
}
