package javaLabBookOne;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Enter Radius:");
	double radius=sc.nextDouble();
	//Area = radius*radius*PI
	double area= Math.PI*(radius*radius);
	System.out.println("Area of Circle is: "+area);
	
	//Circumference = 2*PI*radius
	double circumference = 2*Math.PI*radius;
	
	
	}
}
