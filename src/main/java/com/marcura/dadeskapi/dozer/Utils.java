package com.marcura.dadeskapi.dozer;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

@Component("dozerUtils")
public class Utils<T, K> {

	@Inject
	private DozerBeanMapper dozer;

	public K transform(T input, Class<K> clazz, String mapId) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		K output = (mapId == null ? dozer.map(input, clazz) : dozer.map(input, clazz, mapId));
		//AdditionalPropertiesNormaliser.cleanupAdditionalProperties(output);
		return output;
	}
	
	public Collection<K> transformList(Collection<T> input, Class<K> clazz, String mapId) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		Collection<K> output = new ArrayList<K>();
		
		for(T t : input){
			output.add(transform(t, clazz, mapId));
		}
		
		return output;
	}

}
