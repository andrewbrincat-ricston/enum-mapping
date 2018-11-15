package com.enums.mappings;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.DualHashBidiMap;


@SuppressWarnings("unchecked")
public class EnumEnhancer<E extends Enum<E> & HasName>{

	private BidiMap lookupMap;
	
	public EnumEnhancer(E... values) {
		lookupMap = new DualHashBidiMap();		
		for(final E enumValue : values) {
			//put( EnumValue , String name)
			lookupMap.put((E) enumValue.getEnumObject(), enumValue.getName());
		}
	}
	
	//Get key from map
	public Enum toEnum(String name) {
		return (Enum) lookupMap.getKey(name);
	}
	
	//Get value from map
	public String toStringValue(Enum<?> enumvalue) {
		return (String) lookupMap.get(enumvalue);
	}


}
