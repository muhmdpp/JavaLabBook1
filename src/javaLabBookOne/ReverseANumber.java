package javaLabBookOne;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Input your number and press enter:");
		
		num = scan.nextInt();
		
		while(num!=0) {
			reversenum = reversenum*10;
			reversenum = reversenum+num%10;
			num/=10;
		}
		System.out.println("Reverse of input number is: "+reversenum);
	}
}
