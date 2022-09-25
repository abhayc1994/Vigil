package com.vigil.automation.entity.cucumber;

import java.util.ArrayList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Step{
    public Result result;
    public int line;
    public String name;
    public Match match;
    public String keyword;
    public ArrayList<Row> rows;
}
