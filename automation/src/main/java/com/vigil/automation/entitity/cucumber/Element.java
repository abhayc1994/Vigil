
package com.vigil.automation.entitity.cucumber;

import java.io.Serializable;
import java.util.List;

public class Element implements Serializable {

   public String start_timestamp;
   public Integer line;
   public String name;
   public String description;
   public String id;
   public String type;
   public String keyword;
   public List<Step> steps = null;

}
