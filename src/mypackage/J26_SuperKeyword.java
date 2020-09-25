package mypackage;

// Super Keyword
// 1) super can be used to refer immediate parent class instance variable.
// 2) super can be used to invoke immediate parent class method.
// 3) super() can be used to invoke immediate parent class constructor

class Animal
{
	String color ="white";	
	
	void eating()
	{
		System.out.println("Eating........");
	}
	
	Animal()		// Constructor
	{
		System.out.println("Animal is created");
	}
}

class Dog extends Animal
{
	String color = "Black";
	
	void displayColor()
	{
		System.out.println(color);
		
		// 1) super can be used to refer immediate parent class instance variable.
		System.out.println(super.color);
	}
	
	void eating()
	{
		System.out.println("Eating Bread........");
		
		// 2) super can be used to invoke immediate parent class method.
		super.eating();
	}
	
	Dog()		// Constructor
	{
		// 3) super() can be used to invoke immediate parent class constructor
		super();
		System.out.println("Dog is created");
	}
	
}

public class J26_SuperKeyword {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.displayColor();	//Black and white using super (1)
		
		d.eating();			// Eating bread
		
		
		

	}

}
