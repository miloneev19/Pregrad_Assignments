package com.pregrad;
import java.util.Scanner;
//printing name,phone,address using try catch block 


public class Hello {

	public static void main(String[] args) {
	
		System.out.println("First Java Program,Pregrad!");
		String name= "default_name",address="default_address";
		int phone=0000;
		
        Scanner sc= new Scanner(System.in);
        try {
        	 System.out.println("Enter Your Name ");
        	 name = sc.next();
        	 System.out.println("Enter Your Address");
        	 address = sc.next();
        	 System.out.println("Enter your Phone Number");
        	 phone=sc.nextInt();
        	  }
        catch(Exception e)  //will catch anytype of exception 
        {
        	System.out.println(e);
        }
        finally {
        	System.out.println("Name " + name);
        	System.out.println("Address " + address);
        	System.out.println("Phone " + phone);
        }
        System.out.println("Program is over");
	}

}
