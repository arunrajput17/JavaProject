package mypackage;

public class J20_ThisKeyword {
	
	int a, b;	// instance variable or class variables
	
//	void getValues(int x, int y)	// x,y are method variables / external variables
//	{
//		a=x;
//		b=y;		
//	}
	
	
	// to replace above code and use the same class variables in method variables we use 'This'
	void getValues(int a, int b)	
	{
		this.a=a;
		this.b=b;		
	}
		
	
	void printValue()
	{
		System.out.println(a);
		System.out.println(b);
	}

	
	public static void main(String[] args) 
	{
		J20_ThisKeyword th=new J20_ThisKeyword();
		th.getValues(10, 20);
		th.printValue();

	}

}
