package mypackage;

// Polymorphism: is achieved by the overloading approach in java.
//Overloading : creating a methods/constructors with the same name with different parameters.

// Advantage:
// 1. Saves memory
// 2. saves time

// Differentiated on the basis of:
// 1. Number of parameters
// 2. data type of parameters


public class J17_MethodOverloading {
	
	void add(int a, int b)		//1
	{
		System.out.println(a+b);
	}
	
	void add(int a, double b)		//2
	{
		System.out.println(a+b);
	}
	
	void add(double a, double b)		//3
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c)		//4
	{
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) 
	{
		J17_MethodOverloading mo = new J17_MethodOverloading();
		mo.add(10, 20);		// this will call method number 1
		mo.add(10, 20, 30);		// this will call method number 4
		mo.add(10, 20.98);		// this will call method number 2
		mo.add(10.11, 20.44);		// this will call method number 3
		


	}

}
