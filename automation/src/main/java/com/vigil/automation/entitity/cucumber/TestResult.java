
package com.vigil.automation.entitity.cucumber;

import java.io.Serializable;
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
public class TestResult implements Serializable {

   @Id
   private String objectID;
   private Integer line;
   private ArrayList<Element> elements = null;
   private String name;
   private String description;
   private String id;
   private String keyword;
   private String uri;
   public ArrayList<Tag> tags;
   private String featureID;
   private String buildNumber;
}
