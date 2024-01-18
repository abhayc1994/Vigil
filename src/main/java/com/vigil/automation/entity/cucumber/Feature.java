package com.vigil.automation.entity.cucumber;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
   private Integer line;
   private String name;
   private String description;
   private String id;
   private String keyword;
   private String uri;
   private List<Tag> tags;
   private String featureID;
   private String buildNumber;
   private String moduleName;
   @JsonProperty("elements")
   private List<Scenario> scenarios  ;
   private Map<String,String> testStatsMap;
}
