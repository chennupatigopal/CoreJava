package com.java.core;
//Question7:
public enum Direction {
	EAST("E"),
	WEST("W"),
	NORTH("N"),
	SOUTH("S");	
	private final String shortCode;
	
	Direction(String code) { //Constructor was missing
		this.shortCode=code;		
	}		
	public String getShortCode() {
		return shortCode;
	}
}
