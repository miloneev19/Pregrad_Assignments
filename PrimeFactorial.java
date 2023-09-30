package com.pregrad.ass4;

public class PrimeFactorial {

	public static void factors(int num)
	{
		if(num>2 && num<=100)
		{
			for(int i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					System.out.print(i + ",");
				}
			}
		}
		else
			System.out.println("Number out of range");
	}
}
