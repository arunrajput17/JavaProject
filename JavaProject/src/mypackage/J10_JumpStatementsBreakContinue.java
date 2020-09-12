package mypackage;

public class J10_JumpStatementsBreakContinue {

	public static void main(String[] args) 
	{
		// Jumping statement break example
		System.out.println("Jumping statement break example");
		for (int i=1; i<=10;i++)
		{
			if(i==5)
			{
				break;	// It will stop the loop at 5
			}
			System.out.println(i);	// output 1 2 3 4 then break
			
		}
		
		// Jumping statement continue example
		System.out.println("Jumping statement continue example");
		for (int i=1; i<=10;i++)
		{
			if(i==5)
			{
				continue;	// it will jump to next number 6 and skip 5
			}
			System.out.println(i);	// output 1 2 3 4 6 7 8 9 10 
			
		}
		
		// Jumping statement continue example with multiple skips
		System.out.println("Jumping statement continue example with multiple skips");
		for (int i=1; i<=10;i++)
		{
			if(i==3 || i==5 || i == 7)
			{
				continue;	// it will jump to next number and skip 3, 5 ,7
			}
			System.out.println(i);	// output 1 2 4 6 8 9 10 
			
		}		
		
		
	}

}
