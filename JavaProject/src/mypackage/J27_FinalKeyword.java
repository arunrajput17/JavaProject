package mypackage;

// Final Keyword : can be used in three ways
// 1) Variable: you cannot change the value of the variable
// 2) Method: method cannot be override in the child class
// 3) Class: class cannot be extend into another class


class Bike
{
	final void run()	// 2) Final method, so we cannot override this method in child class
	{
		System.out.println("Running..............");
	}
}

//class Honda extends Bike
//{
//	void run()		// Compile time error when method in parent class is defined as Final
//	{
//		System.out.println("Started.........");
//	}
//}

final class Car		//3) Final Class, so we cannot extend this class 
{
	void color()
	{
		System.out.println("White..........");
	}
}

//class BMW extends Car		//Compile time error when parent class is defined as Final
//{
//	void color()
//	{
//		System.out.println("Silver.......");
//	}
//}

public class J27_FinalKeyword {
	
	final int speed = 40;	// 1) Final variable, so we cannot change this value 

	public static void main(String[] args) {
		
		J27_FinalKeyword fm = new J27_FinalKeyword();
//		fm.speed=100;	// Compile time error if variable is defined as Final
		System.out.println(fm.speed);

	}

}
