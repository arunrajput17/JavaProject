package mypackage;

public class J18_ConstructorOverloading {
	
	public J18_ConstructorOverloading(int a, int b) 		//1
	{
		System.out.println(a+b);
	}
	
	public J18_ConstructorOverloading(int a, double b) 		//2
	{
		System.out.println(a+b);
	}
	
	public J18_ConstructorOverloading(double a, double b) 	//3
	{
		System.out.println(a+b);
	}
	
	public J18_ConstructorOverloading(int a, int b, int c) 	//4
	{
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) 
	{
		J18_ConstructorOverloading co1 = new J18_ConstructorOverloading(10,20);	//1
		
		J18_ConstructorOverloading co4 = new J18_ConstructorOverloading(10,20, 30);	//4
		
		J18_ConstructorOverloading co2 = new J18_ConstructorOverloading(10,20.45);	//2
		
		J18_ConstructorOverloading co3 = new J18_ConstructorOverloading(10.78,20.44);	//3

	}

}
