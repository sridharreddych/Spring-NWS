package com.adap;

public class School {

	public static void main(String[] args) {
		
		//PilotPen p = new PilotPen();
		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("I am writing the assignment dont disturb");
		
	}

}
