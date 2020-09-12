package mypackage;

/*
 * 1) Write a Java program to find a number is positive or negative.
 * 2) Write a java program to find the greatest of 3 numbers.
 * 3) Write a program in Java to display the multiplication table of 5.
 * Expected Output:
 * 5 X 0 = 0
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ......
 * .......
 * 5 X 10 = 50
 * 
 * 4) Write a java program to count the number of digits of the number. 
 * 
 */




public class J10_z1Asgmnt 
{
	public static void main(String[] args)
	{
		
		//1) Write a Java program to find a number is positive or negative.
		int a = -1;
		
		if(a>=0)
		{
			System.out.println((a) + " is positive number");
		}
		else 
		{
			System.out.println((a) + " is negative number");
		}
		
		// 2) Write a java program to find the greatest of 3 numbers.
		int x = 10;
		int y = 20;
		int z = 30;
		
		if (x>y && x>z)
		{
			System.out.println("x is greater than y and z");
		}
		else if (y>x && y>z)
		{
			System.out.println("y is greater than x and z");
		}
		else if (z>x && z>y)
		{
			System.out.println("z is greater than x and y");
		}
		else
		{
			System.out.println("Values of x, y and z are equal");
		}
		
		//3) Write a program in Java to display the multiplication table of 5.
		int b = 5;
		int m;
		
		for (int i =0; i<=10;i++)
		{
			m = b*i;
			System.out.println((b)+(" X ")+(i)+(" = ")+(m));
		}
		
		
		//4) Write a java program to count the number of digits of the number. 
		
		// First approach using while loop
		int num = 19000;
		int count =0;
		
		while(num !=0)
		{
			num = num/10;
			count++;
		}
		System.out.println("Number of digits " + count);
		
		// Second approach using for loop
		int num1 =4233454;
		int count1 =0;
		
		for (; num1!=0; num1/=10, ++count1)
		{
		}
		System.out.println("Number of digits are "+ count1);
				
	}
	

}
