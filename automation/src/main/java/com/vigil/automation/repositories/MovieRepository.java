package com.vigil.automation.repositories;

import com.vigil.automation.entitity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {

   Movie findMovieById(String id);
}
