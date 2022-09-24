
package com.vigil.automation.entitity.cucumber;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
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
public class TestResult implements Serializable {
   @Id
   private String objectID;
   private Integer line;
   private List<Element> elements = null;
   private String name;
   private String description;
   private String id;
   private String keyword;
   private String uri;
   private List<Object> tags = null;
   private String buildId;
   private String buildNumber;
}
