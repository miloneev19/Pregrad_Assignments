package com.pregrad.shape;

public class Area extends Shape {

	public int rectangleArea(int length, int breadth)
	{
		return length*breadth;
	}
	public int squareArea(int side)
	{
		return side*side;
	}
	
	public float circleArea(int radius)
	{
		return (float) (2*3.14*radius);
	}
}
