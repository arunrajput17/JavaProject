package mypackage;

// Assignment 1:
// Write a program to demonstrate interface.
// -- interface A : int a, int b, sum()
// -- Class B : implements method from A and calculate sum of a and b.

interface Asgmnt1
{
	public int a = 10;
	int b = 20;
	
	int sum();
}

class B implements Asgmnt1
{
	public int sum()
	{
		return (a+b);
	}
}


public class J31_z1Asgmnt {

	public static void main(String[] args) 
	{
		B objB = new B();
		int result = objB.sum();
		System.out.println("Sum : "+result);
		
	}

}
