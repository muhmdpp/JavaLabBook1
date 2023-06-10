package javaLabBookOne;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		while(true) {
		try {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the width of the triangle: ");
		
		double base=scanner.nextDouble();
		if(base==453)
			break;
		
		System.out.println("Enter the Height of Triangle: ");
		double height = scanner.nextDouble();
		
		//Area (width*height)/2
		double area=(height*base)/2;
		
		System.out.println("Area of Triangle : "+area);
		}catch(Exception e) {
			System.out.println("Exception:"+e);
		}
	}
		
	}
}
