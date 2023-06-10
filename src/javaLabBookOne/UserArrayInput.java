package javaLabBookOne;

import java.util.Scanner;

public class UserArrayInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0;
		System.out.print("Enter Array Limit:");
		int arrayLimit=scan.nextInt();
		int[] array = new int[arrayLimit];
		
		for(int i=0;i<arrayLimit;i++) {
			System.out.print("Enter Array Element:");
			array[i]= scan.nextInt();
			
		}
		for(int num : array) {
			sum+=num;
		}
		System.out.println("Sum of array elements: "+sum);
		
	}
}
