package com.vigil.automation.entity.cucumber;

import java.util.ArrayList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "results")
public class TestResult {

   @Id
   private String objectID;
   public int line;
   public ArrayList<Element> elements;
   public String name;
   public String description;
   public String id;
   public String keyword;
   public String uri;
   public ArrayList<Tag> tags;
   private String featureID;
   private String buildNumber;
   private String moduleName;
}
