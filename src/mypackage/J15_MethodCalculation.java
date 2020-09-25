package mypackage;

// Method --> block of code
// 1) Case 1- not taking parameters and also not returned any value
// 2) Case 2- not taking parameters but returning value
// 3) Case 3- taking parameters but not returning any value
// 4) Case 4 - method taking parameters and also returning a value

public class J15_MethodCalculation {
	
	int x=10;
	int y=20;
	
	// Case 1- not taking parameters and also not returned any value
	void sum()
	{
		System.out.println(x+y);
	}
	
	// Case 2- not taking parameters but returning value
	int diff()
	{
		return (x-y);
	}
	
	// Case 3- taking parameters but not returning any value
	void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	
	// Case 4 - method taking parameters and also returning a value
	int div(int a, int b)
	{
		return(a/b);
	}
	
	

	

	public static void main(String[] args) {
		
		J15_MethodCalculation cal = new J15_MethodCalculation();
		cal.sum();		// Case 1
		
		//This method is returning value so we require additional variable to store value
		int res=cal.diff();		// Case 2
		System.out.println(res);
		System.out.println(cal.diff());
		
		cal.mul(100, 200);		// Case 3
		
		//This method is returning value so we require additional variable to store value
		int res1 = cal.div(10, 5);		// Case 4
		System.out.println(res1);
		

	}

}
