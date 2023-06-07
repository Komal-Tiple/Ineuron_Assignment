package com.java.assessment.question1;

public class ShapImpl implements Shape {

	@Override
	public void circle(double r) {

		double area = (22 * r * r) / 7;
		System.out.println("Area of Circle : " + area);

		double perimeter = 2 * 3.14 * r;
		System.out.println("Perimeter of Circle : " + perimeter);
	}

	@Override
	public void triangle(double b,double h, double p) {
		
		double area = (b*h)/2;  
		System.out.println("Area of Triangle :"+area);  
		
		double perimeter = b+h+p;
		System.out.println("Perimeter of Triangle :"+perimeter);
	}

}
