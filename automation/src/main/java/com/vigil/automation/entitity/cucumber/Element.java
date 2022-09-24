
package com.vigil.automation.entitity.cucumber;

import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


public class Element implements Serializable {
   public String startTimestamp;
   public Integer line;
   public String name;
   public String description;
   public String id;
   public String type;
   public String keyword;
   public List<Step> steps = null;

}
