package com.pregrad;

public class hello {

	public static void getNoise(Animal animal)
	{
		animal.makeNoise();
	}
	
	public static void main(String[] args) {
		
		getNoise(new Dog());
		getNoise(new Cat());

	}

}
