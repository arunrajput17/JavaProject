package mypackage;

// Assignment (Strings)
// 1) Write a Java program to compare two strings, ignoring case differences.
// 2) Write a Java program to concatenate a given string to the end of another string
// 3) Write a Java program to get the length of a given string
// 4) Write a Java program to get a substring of a given string between two specified positions
// 5) Write a Java program to convert all the characters in a string to uppercase
// 6) Write a Java program to convert all the characters in a string to lowercase


public class J13_z2Asgmnt {

	public static void main(String[] args) {
		
		String st1 = "WELCOME";
		String st2 = "welcome";
		String st3 = "to JAVA";
		
		// 1) Write a Java program to compare two strings, ignoring case differences.
		System.out.println("Data in st1 and st2 is similar :"+ st1.equalsIgnoreCase(st2));
		
		// 2) Write a Java program to concatenate a given string to the end of another string
		System.out.println(st1.concat(" "+st3));
		
		// 3) Write a Java program to get the length of a given string
		System.out.println("Length of st3 is "+st3.length());
		
		// 4) Write a Java program to get a substring of a given string between two specified positions
		System.out.println("substring of st3 is : "+ st3.substring(3, 5));
		
		// 5) Write a Java program to convert all the characters in a string to uppercase
		System.out.println("Upper case of st2 is : "+ st2.toUpperCase());
		
		// 6) Write a Java program to convert all the characters in a string to lowercase
		System.out.println("Lower case of st1 is : "+ st1.toLowerCase());
		

	}

}
