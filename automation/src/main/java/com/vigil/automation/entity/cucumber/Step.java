package com.vigil.automation.entity.cucumber;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Step{
    public Result result;
    public Integer line;
    public String name;
    public Match match;
    public String keyword;
    public List<Row> rows;
}
