package com.auto.generated.component;

import java.util.Map;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

import com.auto.generated.enums.VisibleInstructionSets;
import com.enums.mappings.VisibleInstructionSetsMapping;

public class CustomComponent implements Callable{

	@SuppressWarnings("unchecked")
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		Map<String,Object> map = (Map<String, Object>)eventContext.getMessage().getProperty("http.query.params", PropertyScope.INBOUND);
		String param = (String)map.get("myvalue");
		
//		//To Enum for the UI
//		VisibleInstructionSets enum1 = VisibleInstructionSetsMapping.toEnum(param);
//		return enum1.toString();
		
		//To Enum for the UI
//		String enum1 = VisibleInstructionSetsMapping.toStringValue(VisibleInstructionSets.MY_ALL_INSTRUCTIONS);
//		return enum1;
		return null;
	}

}
