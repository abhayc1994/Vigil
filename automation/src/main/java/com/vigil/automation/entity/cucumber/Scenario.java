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
    private Integer line;
    private String name;
    private String description;
    private String type;
    private String keyword;
    private List<Step> steps = null;
    private Long startTimestamp;
    private String id;
    private List<Tag> tags = null;
}
