package com.example.heroservice.repository;

import com.example.heroservice.model.Hero;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends MongoRepository<Hero, String> {
}
