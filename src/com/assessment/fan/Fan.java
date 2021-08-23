package com.assessment.fan;

public class Fan {
	
	private char operator;
	private int currentSetting;
	
	
	public Fan(char operator, int currentSetting) {
		super();
		this.operator = operator;
		this.currentSetting = currentSetting;
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	public int getCurrentSetting() {
		return currentSetting;
	}
	public void setCurrentSetting(int currentSetting) {
		this.currentSetting = currentSetting;
	}
	
	

}
