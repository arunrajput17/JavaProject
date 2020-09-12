package mypackage;

// Assignment 1
// Write a java program for the following and handle exceptions by using try..catch and finally block.
// -- Any number divided by zero
// -- int a[]=null;
// -- a.length
// -- String s = "abc";
// -- int i = integer.parseInt(s);



public class J33_z1Asgmnt {

	public static void main(String[] args) {
		
		// -- Any Number divided by ZERO
		int x = 100;
		try
		{
			System.out.println(x/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Number cannot be divided by Zero exception handled");
		}
		
		
		// NullPointerException 
		int a[]=null;
		
		try
		{
			System.out.println(a.length);
		}
		catch(NullPointerException e)
		{
			System.out.println("Excption of finding length of Null array is handled");
		}
		
		// NumberFormatException
		String s ="abc";
		
		try
		{
			int i = Integer.parseInt(s);
		}
		catch(Exception e)
		{
			System.out.println("Conversion of string value to integer exception handled.");
		}



	}

}
