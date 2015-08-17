package com.chf.design.pattern.action.interpreter.v2;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable v, int value) {
        map.put(v, value);
    }

    public Integer getValue(Variable v) {
        return map.get(v);
    }
}
