package mypackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Exception Handling:
//Exception is an abnormal condition.
//In java, exception is an event that disrupts the normal flow of the program.

//Types of exceptions:
//2) Checked --> Exceptions checked/identified by the compiler
//Examples:
//-- InterruptedException
//-- IOException
//-- FileNotFoundException etc.

// Checked Exception can be handled  in 2 ways
// 1) try catch
// 2) throws keyword


public class J33_CheckedExceptionexample {

	// IOException is super class of FileNotFound Exception
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		
		// 1) Try catch block
//		try {
//			Thread.sleep(5000);		// checked exception caught by compiler when writing
//		} catch (InterruptedException e) {
//			
//		}		
//		
		
		// 2) Throws keyword added on top
		Thread.sleep(5000);
		
		
		// Multiple exception handled using throws
		
		FileReader fr =null;
		// FileNotFoundException
		fr = new FileReader("D:\\Day Shift\\Selenium Practice\\JEx\\First\\JavaProject\\Files\\Test.txt");
		
		// IOException
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(5000);
				

		System.out.println("Program is completed");
		System.out.println("Program is in exited");
		
		
	}

}
