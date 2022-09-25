package com.vigil.automation.entitity.cucumber;

import java.util.ArrayList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Match{
    public String location;
    public ArrayList<Argument> arguments;
}
