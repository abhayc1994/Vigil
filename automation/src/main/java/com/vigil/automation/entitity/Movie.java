package com.vigil.automation.entitity;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "movies")
public class Movie {

   @Id
   private String id;
   public String title;
   public String year;
   public String rated;
   public String released;
   public String runtime;
   public String genre;
   public String director;
   public String writer;
   public String actors;
   public String plot;
   public String language;
   public String country;
   public String awards;
   public String poster;
   public String metascore;
   public String imdbRating;
   public String imdbVotes;
   public String imdbID;
   public String type;
   public String response;
   public List<String> images = null;
}
