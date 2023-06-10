package javaLabBookOne;

import java.util.Scanner;

public class MultipleNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number1:");
		int num1=scan.nextInt();
		
		System.out.println("Enter Number2:");
		int num2=scan.nextInt();
		
		int mul=num1*num2;
		System.out.println("Product of Two Numbers is:"+mul);
;	}
}
