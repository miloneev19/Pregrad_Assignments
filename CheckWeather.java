package com.pregrad.ass1;

public class CheckWeather {
	
	double temperature;
	boolean isSnowing,isRaining;
	
	CheckWeather()
	{
		temperature=60.0;
		isSnowing=false;
		isRaining=true;
	}
	
	CheckWeather(boolean isSnowing ,boolean isRaining,double temperature)
	{
		this.isSnowing=isSnowing;
		this.isRaining=isRaining;
		this.temperature=temperature;
	}
	
	public String condition()
	{
	
	if(isSnowing==true || isRaining==true || temperature<50 )
     {
   	       return "Let's Stay At Home";
     }
	else
		return "Let's Go Out";
	}
	
}
