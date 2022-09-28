package com.vigil.automation.entity.cucumber;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "results")
public class Feature {

   @Id
   private String objectID;
   public Integer line;
   public String name;
   public String description;
   public String id;
   public String keyword;
   public String uri;
   public List<Tag> tags;
   public String featureID;
   public String buildNumber;
   public String moduleName;
   @JsonProperty("elements")
   public List<Scenario> scenarios  ;
}
