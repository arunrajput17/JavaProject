package mypackage;

public class J11_SingleDimArray {

	public static void main(String[] args) 
	{
		int a[] = new int[5];	// Declared array with size 5, starting index is 0 and last index is 4
		
		//storing/inserting values into array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		// another way of declaring and storing value in array without specifying size
		int b[]= {100,200,300,400,500};
		
		//how to find size of array
		System.out.println("length of an array "+b.length);	//prints length/size of an array
		
		//Reading values of array
		
		System.out.println(a[2]);	// Reading single value
		
		// Reading full array using For Loop
		for (int i =0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		
		// Reading array using Advanced/Enhanced For Loop
		for(int i:a)
		{
			System.out.println(i);
		}
		
				

	}

}
