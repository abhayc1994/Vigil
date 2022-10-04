package com.vigil.automation.entity.cucumber;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Result{
    private long duration;
    private String status;
}
