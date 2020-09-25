package mypackage;

import java.util.HashMap;
import java.util.Map;

// Map and HashMap
// Map : Map is interface in Java.
// -- Map contains Key value pair
// -- Each key and value called as Entry
// -- Map contains only unique keys
// -- Map is easy to use if you have to search, update or delete elements on the basis of key

// HashMap
// -- Java HashMap a class implements the map interface
// -- A HashMap also contains values based on the key and only unique elements
// -- It may have one null key and multiple null values
// -- Main point : it does not store value in order

public class J35_s2_HashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> obj1 = new HashMap<String, String>();
		
		// Adding values
		obj1.put("400", "Java");
		obj1.put("601", "Sa");
		obj1.put("602", "Katlon");
		obj1.put("500", "Selenium");
		obj1.put("600", "QTP");
		obj1.put("700", "Appium");
		obj1.put("700", "Appium");
		
		
		System.out.println(obj1);
		
		// Getting values
		String value =obj1.get("700");
		System.out.println("Value from HashMap is "+value);
		
		// Fetching all the enteries
		
		for(Map.Entry<String, String> data : obj1.entrySet())
		{
			System.out.println("Key from Map is : "+ data.getKey()+" and Value is : "+data.getValue());
		}
		
		

	}

}
