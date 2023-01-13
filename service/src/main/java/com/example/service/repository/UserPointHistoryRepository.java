package com.example.service.repository;

import com.example.service.document.UserPointHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPointHistoryRepository extends MongoRepository<UserPointHistory,String> {
}
