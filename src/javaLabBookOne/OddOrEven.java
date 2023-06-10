package javaLabBookOne;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		
		System.out.println("Enter a Number:");
		Scanner input= new Scanner(System.in);
		int num=input.nextInt();
		
		if(num%2==0)
			System.out.println(num+" is even");
		else
			System.out.println(num+" is odd");
	}
}
