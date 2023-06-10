package javaLabBookOne;

public class TypeCasting {
	public static void main(String[] args) {
		byte b=127;
		int i=b; // autoType Promotion
		
		//byte c=i; // Will not Accept
		
		byte d=(byte)i; //TypeCasting
		
		byte x=10;
		byte y=20;
		//byte product=x*y; // Product Will be an Integer
		int product1=x*y;
		
		System.out.println("Int Product "+product1);
		
		
		
	}
}
