package com.enums.mappings;

import java.util.HashMap;
import java.util.Map;


@SuppressWarnings("unchecked")
public class EnumEnhancer<E extends Enum<E> & HasName>{

	private Map<String, E> lookupMap;
	
	
	public EnumEnhancer(E... values) {
		lookupMap = new HashMap<String, E>();
		
		for(final E enumValue : values) {
			lookupMap.put(enumValue.getName(), (E) enumValue.getEnumObject());
		}
	}
	
	//Get key from map
	public Enum toEnum(String name) {
		return lookupMap.get(name);
	}
	
	//Get value from map
	public String toStringValue(E enumValue) {
		return enumValue.getName();
	}


}
