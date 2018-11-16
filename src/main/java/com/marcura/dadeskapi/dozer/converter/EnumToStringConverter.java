package com.marcura.dadeskapi.dozer.converter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;
import org.dozer.DozerConverter;
import org.dozer.MappingException;



public class EnumToStringConverter extends DozerConverter<Enum, String> {

	
	public EnumToStringConverter() {
		super(Enum.class, String.class);
	}

	
	@Override
	public Enum convertFrom(String input, Enum output) {
		Class<?> clazz = getClassFromParameter();
		try {
			Method method = clazz.getMethod("toEnum", String.class);
			output = (Enum) method.invoke(clazz, input);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException 
				| IllegalArgumentException | InvocationTargetException e) {
			throw new MappingException(e.getMessage(), e.getCause());
		}
		
		return output;
	}

	
	@Override
	public String convertTo(Enum input, String output) {
		Class<?> clazz = getClassFromParameter();
		try {
			Method method = clazz.getMethod("toStringValue", Enum.class);
			output = (String) method.invoke(clazz, input);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException 
				| IllegalArgumentException | InvocationTargetException e) {
			throw new MappingException(e.getMessage(), e.getCause());
		}
		
		return output;
	}

	
	@SuppressWarnings("unused")
	private Class<?> getClassFromParameter(){
		Class<?> destinationClass = null;
		
		try {
			String parameter = getParameter();
		
			if (StringUtils.isBlank(parameter)){
				throw new RuntimeException("Parameter cannot be empty. Enum mapping class is required");
			}		

			destinationClass = (Class<?>) Class.forName(parameter);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		
		return destinationClass;
	}
	
}