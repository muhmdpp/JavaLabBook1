package javaLabBookOne;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		float first=2.5f, second=4.50f;
		
		System.out.println("--before Swap--");
		System.out.println("First number="+first);
		System.out.println("Second number="+second);
		
		//Swapping using a Temp Variable
		
		float temp=first;
		first=second;
		second=temp;
		
		System.out.println("--After Swap--");
		System.out.println("First number="+first);
		System.out.println("Second number="+second);
		
	}
}
