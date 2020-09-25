package mypackage;

//2) Write a program to demonstrate constructor.
//- Create a class 'Calculation' with 3 integer variable.
//- Create a constructor for assign the values into variables.
//- Then create another method 'sum' to calculate sum of 3 numbers.
//- Now, create object and call constructor by passing 3 integer values then call sum method.


public class J16_z2Asgmnt {
	
	int x;
	int y;
	int z;
	
	J16_z2Asgmnt() 	//Default constructor
	{
		x=10;
		y=20;
		z=30;
	}
	
	J16_z2Asgmnt(int a, int b, int c) 	//Parameterized  constructor
	{
		x=a;
		y=b;
		z=c;
	}
	
	int sum()
	{
		return (x+y+z);
	}
	

	public static void main(String[] args) 
	{
		J16_z2Asgmnt defConst = new J16_z2Asgmnt();
		int res = defConst.sum();
		System.out.println(res);
		
		J16_z2Asgmnt paraConst = new J16_z2Asgmnt(2, 4, 6);
		int res1 = paraConst.sum();
		System.out.println(res1);
		

	}

}
