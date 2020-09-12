package mypackage;

// 1) Create a class Calculation with the following methods:
//	Class Name: Calculation
//--> int sum(int x, int y) : should accept two integer parameters and returns sum of two numbers.
//--> int sum(int x, int y, int z) : should accept three integer parameters and returns sum of three numbers.
//--> double sum(double x, double y): should accept two double parameters and returns sum of two numbers.
//--> double sum(double x, double y, double z) : should accept three double parameters and returns sum of three numbers.
//
//	Now create object for Calculation class 'cal' then call different methods by passing different inputs.


// instead of Calculation class we are using J21_z1Asgmnt
public class J21_z1Asgmnt {
	
	int sum(int x, int y)	//1
	{
		return (x+y);
	}
	
	int sum(int x, int y, int z)	//2
	{
		return (x+y+z);
	}
	
	double sum(double x, double y)	//3
	{
		return (x+y);
	}
	
	double sum(double x, double y, double z)	//4
	{
		return (x+y+z);
	}
	
	

	public static void main(String[] args) {
		
		J21_z1Asgmnt cal = new J21_z1Asgmnt();
		
		System.out.println(cal.sum(10, 20));	// 1
		System.out.println(cal.sum(11, 22, 33));	//2
		System.out.println(cal.sum(10.01, 20.02));	//3
		System.out.println(cal.sum(11.11, 22.22, 33.33));	//4

	}

}
