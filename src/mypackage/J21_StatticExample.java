package mypackage;

// Static variables

// Static methods
//1) Static method can only access static stuff directly(i.e. without making object)
//2) Static methods can also access non static stuff but through object
//3) Non static methods can access both static & non static stuff directly


public class J21_StatticExample {
	
	static int a = 10;		// static variable
	int b = 20;				// Non static variable
	
	
	static void m1()		// static method
	{
		System.out.println("This is m1 - static method");
	}
	
	void m2()				// Non static
	{
		System.out.println("This is m2 - Non static method");
	}
	
	
	//3) Non static methods can access both static & non static stuff directly
	void m3()
	{
		System.out.println("This is  m3 method ---- Non Static---");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}
	
	

	public static void main(String[] args) {
		
		//1) Static method can only access static stuff directly(i.e. without making object)
		
		// Directly accessing the static variable & method without creating object
		System.out.println(a);
		m1();
		
		// if main is present in another class then we can call this static variable and method as
		System.out.println(J21_StatticExample.a);
		J21_StatticExample.m1();
		
		//Below statement give error becoz they are non static variable & method
//		System.out.println(b);
//		m2();
		
		
		
		//2) Static methods can also access non static stuff but through object
		J21_StatticExample se = new J21_StatticExample();
		System.out.println(se.b);
		se.m2();
		
		
		se.m3();
		

	}

}
