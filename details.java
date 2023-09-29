package com.pregrad.ass1;
import java.util.Scanner;

public class details {
     
	String name,fname,mname,gender,address;
	int age;
	long mobile;
	Scanner sc=new Scanner(System.in);
	public void getData()
	{
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your Father's Name");
		fname=sc.next();
		System.out.println("Enter your Mother's name");
		mname=sc.next();
		System.out.println("Enter your age");
		age=sc.nextInt();
		System.out.println("Enter your gender");
		gender=sc.next();
		System.out.println("Enter your address");
		address=sc.next();
		System.out.println("Enter your mobile no.");
		mobile=sc.nextLong();
	}
	
	public void display()
	{
		System.out.println("Name " + name);
		System.out.println("Father's Name " + fname);
		System.out.println("Mother's Name " + mname);
		System.out.println("Age " + age);
		System.out.println("Gender " + gender);
		System.out.println("Address " + address);
		System.out.println("Mobile " + mobile);
	}
}


/*
 * Java is a programming language and a platform. 
 * Java is a high level, robust, object-oriented and secure programming language.
 */

//features:simple,oject oriented,robust,secured,platform independent


