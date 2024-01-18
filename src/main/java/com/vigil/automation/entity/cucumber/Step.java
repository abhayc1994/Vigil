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
    private Result result;
    private Integer line;
    private String name;
    private Match match;
    private String keyword;
    private List<Row> rows;
}
