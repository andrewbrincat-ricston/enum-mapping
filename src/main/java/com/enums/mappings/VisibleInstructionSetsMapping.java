package com.enums.mappings;

import com.auto.generated.enums.VisibleInstructionSets;

public enum VisibleInstructionSetsMapping implements HasName{

	ALL_INSTRUCTIONS(VisibleInstructionSets.MY_ALL_INSTRUCTIONS, "ALL_INSTRUCTIONS"),
	CREATED_BY_ME(VisibleInstructionSets.MY_CREATED_BY_ME, "CREATED_BY_ME");
	
	
	private static final EnumEnhancer<VisibleInstructionSetsMapping> enhancer =
			new EnumEnhancer<VisibleInstructionSetsMapping>(values());
	
	
	//Generated Enum Values
	private VisibleInstructionSets enumValue;
	//Target (to dadesk backend)
	private String name;
	
	
	private VisibleInstructionSetsMapping(VisibleInstructionSets enumValue, String name){
		this.enumValue = enumValue;
		this.name = name;
	}
	
	
	//From Interface
	public String getName(){
		return name;
	}
	
	//From Interface
	public Enum<?> getEnumObject() {
		return enumValue;
	}	
	
	// This is delegation.
	public static String toStringValue(Enum enumvalue) {
	    return (String)enhancer.toStringValue(enumvalue);
	}

	// This too is delegation.     
	public static VisibleInstructionSets toEnum(String name) {
	    return (VisibleInstructionSets) enhancer.toEnum(name);
	}

}

