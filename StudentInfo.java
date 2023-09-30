package com.pregrad.ass4;

public class StudentInfo {

	int roll,marks;
	String name;
	
	
	
	public StudentInfo() {
	}



	public StudentInfo(int roll, int marks, String name) {
		this.roll = roll;
		this.marks = marks;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Roll " +roll);
		System.out.println("Name " +name);
		System.out.println("Marks " +marks);
	}
	
	
	
	
	
	
	
}
