package javaLabBookOne;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double side;
		System.out.println("Enter side Length: ");
		side=sc.nextDouble();
		
		double area=side*side;
		System.out.println("Area is: "+area);
	}
}
