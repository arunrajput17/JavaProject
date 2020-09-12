package mypackage;

public class J14_s2EmployeeMain {
	
	public static void main(String[] args) 
	{
		// Second method having main in different class
		
		J14_s1EmployeeOOP emp1 = new J14_s1EmployeeOOP();	// Created an object for class
		// 1) By using reference variable :Assigning values to variable
		emp1.eid =101;
		emp1.ename = "David";
		emp1.sal=25000.00;
		emp1.deptno=10;
		emp1.job="Manager";
		
		emp1.display();
		
		J14_s1EmployeeOOP emp2 = new J14_s1EmployeeOOP();	// Created an object for class
		emp2.eid =102;
		emp2.ename = "John";
		emp2.sal=55000.00;
		emp2.deptno=20;
		emp2.job="CEO";
		
		emp2.display();
	}	


}
