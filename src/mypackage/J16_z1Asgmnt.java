package mypackage;

// 1) Create a Student class contains the following variables and methods.
// - Class Name: Student
// - Variables: SID, Sname, Sub1, Sub2, Sub3
// - Methods:
// --> getStuData() Takes student details SID and Sname as parameters and assign them to variables
// --> getStuMarks() Takes student marks as parameters and assign them to Sub1, Sub2, Sub3.
// --> totalMarks() Calculate total marks and print the student details with total marks.
// - Now, create objects from Student class stu1,stu2 etc. Then call Student class methods.


public class J16_z1Asgmnt 
{
	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	
	void getStuData(int id, String name)
	{
		SID=id;
		Sname=name;
	}
	
	void getStuMarks(int Sub1Marks, int Sub2Marks, int Sub3Marks)
	{
		Sub1 = Sub1Marks;
		Sub2 = Sub2Marks;
		Sub3 = Sub3Marks;
	}
	
	void totalMarks()
	{
		int total = Sub1+Sub2+Sub3;
		System.out.println("Student ID : "+SID);
		System.out.println("Student Name : "+ Sname);
		System.out.println("Total Marks : "+total);
	}

	public static void main(String[] args) {
		
		J16_z1Asgmnt stu1 = new J16_z1Asgmnt();
		stu1.getStuData(100, "Jack");
		stu1.getStuMarks(70, 80, 90);
		stu1.totalMarks();
		
		J16_z1Asgmnt stu2 = new J16_z1Asgmnt();
		stu2.getStuData(101, "Jill");
		stu2.getStuMarks(50, 50, 50);
		stu2.totalMarks();

	}

}
