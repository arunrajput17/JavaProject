package mypackage;

// Exception Handling:
// Exception is an abnormal condition.
// In java, exception is an event that disrupts the normal flow of the program.

// Types of exceptions:

// 1) Un-checked --> Exceptions which are not checked/identified by compiler
// Examples:
// -- ArithmeticException
// -- NullPointerException
// -- NumberFormatException
// -- ArrayIndexOutOfBoundsexception


// handling Exceptions:
// 1) Try { statement } catch(Exception Type){Remedy Statements}
// 2) One try block can have multiple catch block
// 3) Try { to open file } catch(Exception Type){Remedy Statements}finally {close}
//	-- finally block always execute
//		--> 1. Exception doesn't occur
//		--> 2. Exception occurs and not handled
//		--> 3. Exception occurs and handled

//2) Checked --> Exceptions checked/identified by the compiler
//Examples:
//-- InterruptedException
//-- IOException
//-- FileNotFoundException etc.

//----------------------------------------------------------------------------------
//				| Un-Checked	| Checked	| Method Level	| Within the method		|				
//----------------------------------------------------------------------------------
// Try..Catch	|		Y		|	Y		|		N		|			Y			|
//----------------------------------------------------------------------------------
// throws		|		N		|	Y		|		Y		|			N			|
//----------------------------------------------------------------------------------


public class J32_ExceptionExamples {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
//		// ArithmeticException
//		int a=100;
//		int res=0;
////		System.out.println(a/0);	// this will give Arithmetic exception
//		try
//		{
//			System.out.println(a/0);	// this will give Arithmetic exception
////			res=a/2;			
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Entered into catch block");
//		}
////		System.out.println(res);
//		
		
		
		
//		// NullPointerException
//		String s = null;
//		try
//		{
//		System.out.println(s.length());		// this will give NullPointerException
//		}
//		catch(Exception e)	// If we don't know exception type then we can write Exception
//		{
//			System.out.println("Entered into catch block 2");
//		}
//		
		
		
		//NumberFormatException
		String s1="abc";	// 3. Exception occurs and handled

//		String s1="21";		// this will not give exception  1. Exception doesn't occur
		
//		String s1=null;		// this will give NullPointerException
							// 2. Exception occurs and not handled
		
		try
		{
			int i = Integer.parseInt(s1);		// this will give NumberFormatException
												// 1. Exception doesn't occur
												// 3. Exception occurs and handled
			
//			System.out.println(s1.length());	// this will give NullPointerException
												// 2. Exception occurs and not handled
												

			
			System.out.println(i);				//  1. Exception doesn't occur
												// 3. Exception occurs and handled
		}
		catch(NumberFormatException e)
		{
			System.out.println("Entered into catch block 3");
		}
		finally
		{
			System.out.println("Entered into finally block 3");
		}
		
		
//		//ArrayIndexOutOfBoundsexception
//		int a1[]=new int[5];
//		a1[10]=50;							// this will give ArrayIndexOutOfBoundsexception
		
		
		System.out.println("Program is completed");
		System.out.println("Program is in exited");
		

	}

}
