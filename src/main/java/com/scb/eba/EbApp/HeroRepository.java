package com.scb.eba.EbApp;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeroRepository extends MongoRepository<Hero, Long> {
  Hero findByName(String name);
}
