package mypackage;

public class J13_StringMethods {

	public static void main(String[] args) {
		
		String s = "Welcome";
		String s1 = " to java";
		
		//Find the length of string
		System.out.println(s.length());
		
		// Concatenation joining of two strings
		System.out.println(s.concat(s1));
		
		// Trim method to remove right and left spaces
		String s2 = "      Welcome      ";
		System.out.println("Before trimming string is "+s2);
		System.out.println("After trimming string is "+s2.trim());
		
		// charAt() : Returns a char value at the given index number. The index number starts from 0
		System.out.println(s.charAt(3));
		
		// contains() : Searches the sequence of characters in this string. It returns true if sequence of char values are
		// found in this string otherwise returns false.
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel"));	// Case sensitive
		
				
		// equals() : Compares the two given strings on the content of the string. If any character is not matched, it returns
		// false. If all characters are matched, it returns true.
		System.out.println(s.equals("Welcome"));
		System.out.println(s.equals("welcome"));
		System.out.println(s.equals(s2));
		
		
		// equalsIgnoreCase() : Compares two strings on the basis of content but it does not check the case like equals() method
		//In this method, if the characters match, it returns true else false.
		System.out.println(s.equalsIgnoreCase("Welcome"));
		System.out.println(s.equalsIgnoreCase("welcome"));
		
		
		// replace() : Returns a string, replacing all the old characters or CharSequence to new characters. There are 2 ways to 
		//replace methods.
		String s3 ="Welcome";
		System.out.println(s3.replace('e', 'a'));
		
		String s4 = "Welcome to Java";
		System.out.println(s4.replace("Java", "Selenium"));
		
		
		//Substring() : Returns substring of a string based on starting index and ending index
		System.out.println(s3.substring(1,3));
		
		//toLowerCase() : Returns the string in lower case letter
		System.out.println(s4.toLowerCase());
		
		// toUpperCase() : Returns the string in Upper case letters
		System.out.println(s4.toUpperCase());
				

	}

}
