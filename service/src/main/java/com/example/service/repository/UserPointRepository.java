package com.example.service.repository;

import com.example.service.document.UserPoint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserPointRepository extends MongoRepository<UserPoint, String> {
    @Query("{'username' :  ?0}")
    @Update("{'$inc' : {'points': ?1} }")
    Long increasePoint(String username, int amount);

    Optional<UserPoint> findByUsername(String username);
}
