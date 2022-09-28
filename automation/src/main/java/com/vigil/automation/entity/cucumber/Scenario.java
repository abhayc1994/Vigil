package com.vigil.automation.entity.cucumber;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Scenario {
    public Integer line;
    public String name;
    public String description;
    public String type;
    public String keyword;
    public List<Step> steps = null;
    public Long startTimestamp;
    public String id;
    public List<Tag> tags = null;
}
