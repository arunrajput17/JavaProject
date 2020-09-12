package mypackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Assignment 2
//Write a java program to handle IO Exception by using throws



public class J33_z2Asgmnt {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		fr = new FileReader("D:\\Day Shift\\Selenium Practice\\JEx\\First\\JavaProject\\Files\\Test.txt");
		
		BufferedReader bfr = new BufferedReader(fr);
		
		String st;
		while ((st = bfr.readLine()) != null)
		{
			System.out.println(st);
		}


	}

}
