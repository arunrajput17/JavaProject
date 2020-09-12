package mypackage;

// Constructor
//--> Constructor is special type of method
//--> Constructor used for initializing the class variable
//--> Constructor name should be same as class name
//--> Constructor will not written any value(not even void)
//--> Constructor will be invoked at the time of object creation


// Two types of constructor
// 1) Parameterized constructor
// 2) Default constructor

public class J16_Construtor {
	
	int x;
	int y;
	
	J16_Construtor() 	// Default constructor
	{
		x=10;
		y=20;		
	}
	
	J16_Construtor(int a, int b)	// Parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		
		J16_Construtor defcn = new J16_Construtor();	// Invoke default constructor
		defcn.display();
		
		J16_Construtor parcn = new J16_Construtor(100, 200); // Invoke parametrized constructor
		parcn.display();

	}

}
