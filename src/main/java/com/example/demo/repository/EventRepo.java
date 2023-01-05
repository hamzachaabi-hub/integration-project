package com.example.demo.repository;

import com.example.demo.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface EventRepo extends MongoRepository<Event, Integer> {
}
