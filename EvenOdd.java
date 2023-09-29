package com.pregrad;

public class EvenOdd {

	public void evenOrOdd(int num){
		  if(num%2==0)
		  {
			  System.out.println("Even");
		  }
		  else
			  System.out.println("Odd");
		
	}
	public static void main(String[] args) {
		EvenOdd obj = new EvenOdd();
		obj.evenOrOdd(20);

	}

}
