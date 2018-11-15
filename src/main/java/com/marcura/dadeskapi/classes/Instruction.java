package com.marcura.dadeskapi.classes;

import com.auto.generated.enums.VisibleInstructionSets;

public class Instruction {

	private String name;
	
	private VisibleInstructionSets visible;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VisibleInstructionSets getVisible() {
		return visible;
	}

	public void setVisible(VisibleInstructionSets visible) {
		this.visible = visible;
	}
}
