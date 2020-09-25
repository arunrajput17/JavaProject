package mypackage;

// Access Modifiers: Define the scope of variables and methods

// 1) Public : We can access everything from everywhere
// 2) Protected : The protected access modifier is accessible within package and outside the
//					package but through inheritance only.
// 3) Default : If you don't use any modifier, it is treated as default by default.
//				The default modifier is accessible only within package.
// 4) Private : The private access modifier is accessible only within class.

//-------------------------------------------------------------------------------------------
// Access Modifier	| within class| Within Package| Outside Package		| Outside package	|
//					|			  |				  |  by subclass only	|					|
//-------------------------------------------------------------------------------------------
// Private			| Yes		  |	No			  | No					| No				|
//-------------------------------------------------------------------------------------------
// Default			| Yes		  | Yes			  | No					| No				|
//-------------------------------------------------------------------------------------------
// Protected		| Yes		  | Yes			  | Yes					| No				|
//-------------------------------------------------------------------------------------------
// Public			| Yes		  | Yes			  | Yes					| Yes				|
//-------------------------------------------------------------------------------------------




class AM1
{
	private int data=10;	// Private only accessible within class
	private void m1() {}	// Private only accessible within class
	
	// Default access modifier
	int defaultData =11;
	void defaultm1()
	{
		System.out.println("This is default access method and variable value :"+ defaultData);
	}
	

	
	

}

public class J31_AccessModifiers {
	
	// Protected access modifier
	protected int protectedData =12;
	protected void protectedm1()
	{
		System.out.println("This is protected access method and variable value :"+ protectedData);
	}
	
	// Public access modifier
	public int publicData =100;
	public void publicm1()
	{
		System.out.println("This is public access method and variable value :"+ publicData);
	}

	public static void main(String[] args) {
		
		AM1 am1obj = new AM1();
		
		// Private access modifier
//		am1obj.data=20;		// Compile time error for private variable
//		am1obj.m1();		// Compile time error for private method
		
		//Default access modifier
		am1obj.defaultData=21;
		am1obj.defaultm1();
		
		
		

	}

}
