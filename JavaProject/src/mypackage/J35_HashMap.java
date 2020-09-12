package mypackage;

import java.util.HashMap;
import java.util.Map;

// HashMap : Data will be saved in Key, value pairs

// Operations:
// -- declare HashMap
// -- add elements to HashMap
// -- remove elements from HashMap
// -- read pairs from HashMap


public class J35_HashMap {

	public static void main(String[] args) {
		
		//HashMap can be created in two different ways:
//		HashMap hm = new HashMap();		// Type 1
		
		HashMap <Integer, String> hm = new HashMap<Integer, String>();	// Type 2
		
		
		// add elements to HashMap
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "David");
		hm.put(104, "Smith");
		hm.put(105, "Kim");
		
		System.out.println("After adding the pair :"+hm);
		
		
		// remove a pair from hashmap
		hm.remove(103);
		
		System.out.println("After removing the pair :"+hm);
		
		
		// read pairs from HashMap using for loop
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m);
			System.out.println("Key is :"+ m.getKey());
			System.out.println("Value is :"+ m.getValue());
		}
		
		

	}

}
