package com.enums.mappings;

public interface HasName{
	
//	String targetValue = null;
	
//	VisibleInstructionSets generatedEnum = null;
	
	
	/**
	 * From Enum to string
	 * @return String value of enum to be sent to dadesk backend
	 */
//	String toStringValue(Object enumValue);
	
	/**
	 * From string to Enum
	 * @param value String value received from dadesk backend
	 * @return Enum value to return to user 
	 */
//	 Object toEnum(String value);
	
	String getName();
	
	Enum<?> getEnumObject();
	
}
