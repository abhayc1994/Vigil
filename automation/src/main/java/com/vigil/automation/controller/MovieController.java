package com.vigil.automation.controller;

import com.vigil.automation.entitity.Movie;
import com.vigil.automation.repositories.MovieRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

   private Logger logger =
	   LoggerFactory.getLogger(MovieController.class);
   @Autowired
   private MovieRepository movieRepository;

   @GetMapping(value = "/")
   public List<Movie> getAllMovies() {
	  logger.info("Getting all movies.");
	  return movieRepository.findAll();
   }

   @GetMapping(value = "/{movieId}")
   public Movie getMovieById(@PathVariable String movieId) {
	  logger.info("Getting movie with ID: {}", movieId);
	  return movieRepository.findMovieById(movieId);
   }

   @PostMapping(value = "/create")
   public Movie addMovie(@RequestBody Movie movie) {
	  logger.info("Saving movie.");
	  return movieRepository.save(movie);
   }

   @PutMapping(value = "/update/{movieId}")
   public Movie updateMovie(@PathVariable String movieId, @RequestBody Movie movie) {
	  logger.info("Updating movie with ID: {}", movieId);
	  return movieRepository.save(movie);
   }

   @DeleteMapping(value = "/delete/{movieId}")
   public void deleteMovie(@PathVariable String movieId) {
	  logger.info("Deleting movie with ID: {}", movieId);
	  movieRepository.deleteById(movieId);
   }
}
