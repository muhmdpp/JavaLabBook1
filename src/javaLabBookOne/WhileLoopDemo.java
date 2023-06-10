package javaLabBookOne;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number below 10:");
		number=sc.nextInt();
		
		while(number<=10) {
			
			sum+=number;
			//System.out.println(sum);
			number++;
		}
		System.out.format("Sum of Numbers of while:%d",sum);
	}
}
