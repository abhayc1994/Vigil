package com.vigil.automation.entity.cucumber;

import java.util.ArrayList;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Element{
    public int line;
    public String name;
    public String description;
    public String type;
    public String keyword;
    public ArrayList<Step> steps;
    public Date start_timestamp;
    public String id;
    public ArrayList<Tag> tags;
}
