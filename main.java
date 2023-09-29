package com.pregrad.ass1;


public class main {

	
	public static void main(String[] args) {
		
       city c = new city();
       c.cityAttribute("Delhi");
       
       CheckWeather cw = new CheckWeather();
       System.out.println(cw.condition());
       
       CheckWeather cw2 = new CheckWeather(false,false,80);
       System.out.println(cw2.condition());
       
     	System.out.println("---------------------------");
	    alpha a = new alpha();
        a.check('A');
        a.check('B');
        a.check('1');
}

}
