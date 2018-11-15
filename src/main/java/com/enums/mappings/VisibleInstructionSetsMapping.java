package com.enums.mappings;

import com.auto.generated.enums.VisibleInstructionSets;

public enum VisibleInstructionSetsMapping implements HasName{

	ALL_INSTRUCTIONS(VisibleInstructionSets.MY_ALL_INSTRUCTIONS, "ALL_INSTRUCTIONS"),
	CREATED_BY_ME(VisibleInstructionSets.MY_CREATED_BY_ME, "CREATED_BY_ME");
	
	
	public static final EnumEnhancer<VisibleInstructionSetsMapping> enhancer =
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
	public static String toStringValue(VisibleInstructionSets enumvalue) {
	    return (String)enhancer.toStringValue(enumvalue);
	}

	// This too is delegation.     
	public static VisibleInstructionSets toEnum(String name) {
	    return (VisibleInstructionSets) enhancer.toEnum(name);
	}



	
	
	//ALL_INSTRUCTIONS(VisibleInstructionSets.MY_ALL_INSTRUCTIONS, "ALL_INSTRUCTIONS"),
	//CREATED_BY_ME(VisibleInstructionSets.MY_CREATED_BY_ME, "CREATED_BY_ME");
	
	
	//private static final EnumMapLookup<VisibleInstructionSetsMapping> impl 
	//	= new EnumMapLookup<VisibleInstructionSetsMapping>(values());
	

	//protected final String targetValue;
	//protected final VisibleInstructionSets generatedEnum;

	
	//private VisibleInstructionSetsMapping(VisibleInstructionSets enumValue, String stringValue){
	//	this.generatedEnum = enumValue;
	//	this.targetValue = stringValue;		
	//}

	
	///public static String toStringValue(VisibleInstructionSets enumValue) {
	//	return impl.toStringValue(enumValue);
	//}

	
	///public static Object toEnum(String value) {
	//	return impl.toEnum(value);
	//}


}

/*
 * 
 * 	RED("Red"), 
	GREEN("Green"), 
	BLUE("Blue");
	
	
	public static final EnumEnhancer<VisibleInstructionSetsMapping> enhancer =
			new EnumEnhancer<VisibleInstructionSetsMapping>(values());
	
	
	private String name;
	
	private VisibleInstructionSetsMapping(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	  // This is delegation.
	  public String toString() {
	    return enhancer.toStringValue(this);
	  }

	  // This too is delegation.     
	  public static VisibleInstructionSetsMapping toEnum(String name) {
	    return enhancer.toEnum(name);
	  }
	  
	 */
