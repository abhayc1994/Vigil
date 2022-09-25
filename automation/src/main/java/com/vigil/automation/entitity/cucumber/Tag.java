package com.vigil.automation.entitity.cucumber;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Tag{
    public String name;
    public String type;
    public Location location;
}