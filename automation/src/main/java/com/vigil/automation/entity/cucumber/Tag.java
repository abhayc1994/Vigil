package com.vigil.automation.entity.cucumber;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Tag{
    private String name;
    private String type;
    private Location location;
}
