package mypackage;

public class J12_MultiDimArray {

	public static void main(String[] args) 
	{
		// Declaring Multi dim array
		int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		// another way of declaring and storing value in array without specifying size
		int b[][]= {{100,200},{300,400},{500,600}};
		
		//How to find number of rows
		System.out.println("Number of rows " + a.length);
		
		//How to find number of columns
		System.out.println("Number of columns " + a[0].length);
		
		// Reading single value
		System.out.println(a[0][0]);
		
		// Reading full array using For Loop
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		// Reading array using Advanced/Enhanced For Loop
		
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.println(i);
			}
		}
		

	}

}
