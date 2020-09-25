package mypackage;

// Assignment (Arrays)
// 1) Write a Java Program to calculate sum values of an array.
// 2) Write a java program to search specific number in array.
// 3) Define as array with some string values, write a java program to search specific string in an array.
// 4) Write a java program to print even and odd numbers in an array
// 5) Write a program to find greatest and smallest element in an array
// 6) Write a program to add two matrices

public class J13_z1Asgmnt {

	public static void main(String[] args) {
		
		// 1) Write a Java Program to calculate sum values of an array.
		
		System.out.println("----------Java Program to calculate sum values of an array--------");
		int d1[]= {12,34,56,67,84,334,78,86,65,63,44,534};
		int sum=0;
		
		for(int i:d1)
		{
			sum=sum+i;
		}
		System.out.println("Total sum of all the values present in array is :"+sum);
		
		
		// 2) Write a java program to search specific number in array.
		System.out.println("-----------java program to search specific number in array---------");
		
		int b[] = {10,20,30,40,50,60};
		
		int searchNum = 20;
		int searchCount = 0;
		
		
		for (int i:b)
		{
			if(searchNum==i)
			{
				searchCount++;	//Increasing a count if searched number is found in the array
			}
			
		}
		if (searchCount >= 1)
		{
			System.out.println("Number of times the "+searchNum+" found in the array is "+searchCount);				
		}
		else
		{
			System.out.println("Number "+searchNum+" is not found in the array");
		}
		
		
		//3) Define as array with some string values, write a java program to search specific string in an array.
		System.out.println("--------Define as array with some string values, write a java program to search specific string in an array----------");
		
		String s[][]= {{"hi","Welcome"},{"to","the"},{"Selenium","with Java"}};
		String searchWord = "welcome";
		int searchWordCount=0;
	
		for (int i=0; i<s.length; i++)
		{
			for (int j=0; j<s[i].length; j++)
			{
				if (s[i][j].equalsIgnoreCase(searchWord))
				{
					searchWordCount++;
				}
			}
		}
		if (searchWordCount>=1)
		{
			System.out.println("Number of times the '"+searchWord+"' word found in the array is "+searchWordCount);
		}
		else
		{
			System.out.println("Word '"+searchWord+"' is not found in the array");
		}
		
		
		//4) Write a java program to print even and odd numbers in an array
		System.out.println("-------java program to print even and odd numbers in an array--------");
		
		int numArray[]= {1,2,3,4,5,6,7,8,9,10,15,18,20};
		
		System.out.println("Even numbers in array are : ");
		for (int i:numArray)
		{
			if (i%2 == 0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("Odd numbers in array are :");
		for(int j:numArray)
		{
			if(j%2 !=0)
			{
				System.out.println(j);
			}
		}
		
		//5) Write a program to find greatest and smallest element in an array
		System.out.println("-------------program to find greatest and smallest element in an array-----------");
		
		int numArray1[]= {51,14,41,1,2,3,4,5,6,7,8,99,10,15,18,20,12};
		int greatestNum=numArray1[0];
		int smallestNum=numArray1[0];
		System.out.println(numArray1.length);
		
		for (int i=0; i<numArray1.length; i++)
		{
			//To find greatest number
			if (greatestNum<numArray1[i])
			{
				greatestNum=numArray1[i];
			}
			//to find smallest number
			else if (smallestNum>numArray1[i])
			{
				smallestNum=numArray1[i];
			}
			
		}
		System.out.println(greatestNum);
		System.out.println(smallestNum);
		
		
		//6) Write a program to add two matrices
		System.out.println("-----------program to add two matrices---------");
		
		int a1[][]= {{2,3},{4,5}};
		int a2[][]= {{6,7},{8,9}};
		int asum[][]= new int[2][2];
		
		for (int i=0; i<a1.length; i++)
		{
			for (int j=0; j<a1[i].length; j++)
			{				
				asum[i][j]=a1[i][j]+a2[i][j];		// Adding the sum of array a1 and a2 in asum array				
			}
		}
		
		for (int k[]:asum)
		{
			for (int m:k)
			{
				System.out.println(m);				// reading the asum array
			}
		}
		
		
		
	}

}
