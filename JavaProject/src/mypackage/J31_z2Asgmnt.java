package mypackage;

// Assignment 2:
// Write a program for multiple inheritance by using interface.
//-- interface A : int a, int b , add()
//-- interface B : int x, int y, mul()
//-- Class Calculation: implements methods from A and B interface.

interface Asgmnt2A
{
	int a = 2;
	int b = 5;
	
	void add();
	
}

interface Asgmnt2B
{
	int x = 10;
	int y = 11;
	
	int mul();
}

class Calculation implements Asgmnt2A,Asgmnt2B
{
	
	public void add()
	{
		System.out.println("Addition result :"+(a+b));
	}
	
	public int mul()
	{
		return (x*y);
	}
	
}


public class J31_z2Asgmnt {

	public static void main(String[] args) {
		
		Calculation cobj = new Calculation();
		cobj.add();
		System.out.println("mutiplication result of x and y is :"+ cobj.mul());

	}

}
