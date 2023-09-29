package com.pregrad.ass1;

public class city {

	
	public void cityAttribute(String cityName)
	{
		switch(cityName)
		{
		case "Mumbai":
			System.out.println("Financial City");
			break;
		case "Kolkata":
			System.out.println("City Of Joy");
			break;
		case "Delhi":
			System.out.println("Capital Of Country");
			break;
		case "Bangalore":
            System.out.println("Cyber City");
        	break;
		default :
			System.out.println("Maybe Other city In Country");
			
		
		}
	}

}

