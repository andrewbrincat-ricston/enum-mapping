package com.test.cases;

import org.junit.Test;

import com.auto.generated.enums.VisibleInstructionSets;
import com.enums.mappings.VisibleInstructionSetsMapping;

public class InterfaceTestCase {

	@Test
	public void test1(){
		VisibleInstructionSets enum1 = VisibleInstructionSetsMapping.toEnum("ALL_INSTRUCTIONS");
		System.out.println(enum1);
		
//		Object enum1 = VisibleInstructionSetsMapping.toStringValue(VisibleInstructionSets.MY_ALL_INSTRUCTIONS);
//		System.out.println(enum1);
	}
}
