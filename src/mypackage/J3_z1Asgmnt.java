package mypackage;

/*
 * 1) Write a Java program to print 'Hello' on screen and then print your name on a separate line.
 * expected output : Hello Your name
 * 2) Write a Java program to print the sum of two numbers.
 * Test Data : 74 + 36 Expected Output : 110
 * 3) Write a Java program to swap two numbers.
 * before swap 
 * a=10		b=20
 * after swap
 * a=20		b=10
 */

public class J3_z1Asgmnt 
{
	public static void main(String[] args)
	{
		
		//1) Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		System.out.println("Hello");
		System.out.println("Arun");
		
		
		//2) Write a Java program to print the sum of two numbers. Test Data : 74 + 36 
		int x = 74;
		int y = 36;
		System.out.println("Sum of x and y is: " + (x + y));
		
		
		//3) Write a Java program to swap two numbers.
		int a = 10;
		int b = 20;
		int c;
		
		System.out.println("Value of a before swapping is :" + a);
		System.out.println("Value of b before swapping is :" + b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Value of a after swapping is :" + a);
		System.out.println("Value of b after swapping is :" + b);
		
		
	}
}
