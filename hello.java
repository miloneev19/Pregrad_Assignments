package com.pregrad;

import com.pregrad.bird.Parrot;
import com.pregrad.bird.bird;
import com.pregrad.shape.Area;
import com.pregrad.shape.Shape;

public class hello {

	public static void main(String[] args) {
		bird b1 = new Parrot();
		b1.fly();
		Parrot b2 = new Parrot();
		b2.sing();
		System.out.println("--------------------------------------");
		Shape s1 = new Area();
		System.out.println("Area of circle is " + s1.circleArea(2));
		System.out.println("Area of rectangle is " + s1.rectangleArea(2,4));
		System.out.println("Area of square is " + s1.squareArea(2));

	}

}
