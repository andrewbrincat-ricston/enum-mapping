package com.auto.generated.enums;

import java.util.HashMap;
import java.util.Map;


public enum VisibleInstructionSets {

    MY_ALL_INSTRUCTIONS("My All Instructions"),
    MY_CREATED_BY_ME("My Created by me");
	
    private final String value;
    private static Map<String, VisibleInstructionSets> constants = new HashMap<String, VisibleInstructionSets>();

    static {
        for (VisibleInstructionSets c: values()) {
            constants.put(c.value, c);
        }
    }

    private VisibleInstructionSets(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return this.value;
    }


    public static VisibleInstructionSets fromValue(String value) {
        VisibleInstructionSets constant = constants.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}