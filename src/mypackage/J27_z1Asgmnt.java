package mypackage;

// Assignment 1:
// Create a class 'Teacher' which contains following variables and methods
//--> designation= "Teacher";
//--> collegeName = "Beginnersbook";
//--> does() --> Teaching
//
// Create another class 'ComputerTeacher' which extends 'Teacher' class then create objects 
// than call methods.

class Teacher
{
	String designation= "Teacher";
	final String collegeName= "Beginnersbook";
	
	void does()
	{
		System.out.println("Teaching");
	}
}

class ComputerTeacher extends Teacher
{
	String designation = "Computer Teacher";
	
	void does()
	{
		System.out.println(super.designation);
		System.out.println(designation);
		super.does();
		System.out.println("Computer Teaching");
	}
}



public class J27_z1Asgmnt {

	public static void main(String[] args) {
		
		ComputerTeacher ct = new ComputerTeacher();
		
//		ct.collegeName="XYZ";	// Final variable cannot be assigned	
		System.out.println(ct.collegeName);
		ct.does();
		

	}

}
