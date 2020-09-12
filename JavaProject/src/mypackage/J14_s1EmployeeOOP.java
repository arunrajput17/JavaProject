package mypackage;

//OOP - Object oriented programming
//class --> collection of variables and methods
//object --> object is an instance of a class
//method --> block of code which contains a logic

//1) main() method can be present in a same class. This class cannot be shared with others
//2) main() method can be present in a separate class. This class can be shared.




public class J14_s1EmployeeOOP {


	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
		
	}
	
	
//	// First method having main() within class
//	public static void main(String[] args) 
//	{
//		J14_s1EmployeeOOP emp1 = new J14_s1EmployeeOOP();	// Created an object for class
//		emp1.eid =101;
//		emp1.ename = "David";
//		emp1.sal=25000.00;
//		emp1.deptno=10;
//		emp1.job="Manager";
//		
//		emp1.display();
//		
//		J14_s1EmployeeOOP emp2 = new J14_s1EmployeeOOP();	// Created an object for class
//		emp2.eid =102;
//		emp2.ename = "John";
//		emp2.sal=55000.00;
//		emp2.deptno=20;
//		emp2.job="CEO";
//		
//		emp2.display();
//		
//
//	}

	
}
