package com.ulipese.solid.repositories;

import com.ulipese.solid.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
    @Query("{'_id':  ?0}")
    User findById(String _id);

    @Query("{'_id':  ?0}")
    @Update("{'$set':  {'name':  ?1, 'age':  ?2}}")
    void updateById(String _id, String name, Integer age);
}
