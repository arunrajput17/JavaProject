package mypackage;

import java.util.ArrayList;

// Derived Data types:
// -- ArrayList
// We can use it when we dont know the size of array list
// We can use it when we want to save different data types of elements 

//  Operations on ArrayList
// -- How to declare array list
// -- How to add element/ values to array list
// -- Find size of array list
// -- read values from ArrayList
// -- remove the elements/values from ArrayList
// -- insert a new element in the middle of array list


public class J34_ArrayList {

	public static void main(String[] args) {
		
		// How to declare array list
		
		ArrayList list = new ArrayList();	// we can store any type of elements
		
//		ArrayList <String> list = new ArrayList<String>();	// this will store only string
		
//		ArrayList <Integer> list2 = new ArrayList<Integer>(); 	// this will store only integer
		
		
		// How to add element/ values to array list
		list.add("john");	// index 0
		list.add("David");	// index 1
		list.add("Scott");	// index 2
		list.add("Smith");	// index 3
		list.add(100);
		list.add('A');
		
		
		//Find size of array list
		System.out.println("Size of ArrayList before removing is :"+list.size());
		
		
		// -- read values from ArrayList
		System.out.println("Before removing elements :"+list);
		
				
		
		// remove the elements/values from ArrayList
		list.remove("Smith");	// removing using value
		list.remove(1);			// remove using index
		System.out.println("Size of ArrayList after removing elements is :"+list.size());
		System.out.println("After removing elements :"+list);
		
		
		//insert a new element in the middle of array list
		list.add(1, "Mike");
		System.out.println("Size of ArrayList after inserting elements is :"+list.size());
		System.out.println("After inserting elements :"+list);
		
		
		// To read individual values
		
//		for (String i : list)	// Used for reading String type of list
//		{
//			System.out.println(i);
//		}

		
		for (Object i : list)	// Object variable is used to read array list having different data types
		{
			System.out.println(i);
		}
		
		
	}

}
