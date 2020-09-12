package mypackage;

public class J8_DoWhileLoop {

	public static void main(String[] args) 
	{
		
		// Print numbers from 1 to 10
		System.out.println("Print numbers from 1 to 10");
//		int i =1;	// this is valid value
		int i = 20; //Invalid value . It will execute once
		
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);	

	}

}
