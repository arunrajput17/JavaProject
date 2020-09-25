package mypackage;

// Upcasting : Upcasting is the typecasting of a child object to a parent object. Upcasting can be done implicitly. 
//	Upcasting gives us the flexibility to access the parent class members but it is not possible to access all the child 
//	class members using this feature. Instead of all the members, we can access some specified members of the child class. 
//	For instance, we can access the overridden methods.
// Downcasting : Similarly, downcasting means the typecasting of a parent object to a child object. Downcasting cannot be implicitly. 

	
	class Parent
	{
		String name;
		
		public void method()
		{
			System.out.println("Method from Parent.......");
		}
	}
	
	class Child extends Parent
	{
		int id;
		
		public void method() 
		{
			System.out.println("Method from Child........");
		}
		
		public void method2()
		{
			System.out.println("Second Method from Child........");
		}
		
	}
	
	
public class J39_UpcastingDowncasting {
	
	public static void main(String[] args) {
		
		// ------------- Upcasting------------------- 
		Parent p = new Child();
		p.name ="Rocky";
		System.out.println(p.name);
		
//		p.id = 1;	//This parameter is not accesible
//		p.method2();	// This method is not accesible
		p.method();
		System.out.println("-----------------------------------");
		
		
		// ---------------- Implicitly Downcasting------------------
		
//		Child c = new Parent();	// Compile time error
		
		//Downcasting implicitly
		Child c = (Child)p;
		
		c.id=1;
		c.name="Singh";
		System.out.println(c.id);
		System.out.println(c.name);
		c.method();
		c.method2();
		
		

		
	}
}
