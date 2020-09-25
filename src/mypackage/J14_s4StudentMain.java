package mypackage;

//Class variables:
//We can assign value to variables in 3 ways:
//1) By using reference variable
//2) By using method
//3) By using constructor
//--> Constructor is special type of method
//--> Constructor used for initializing the class variable
//--> Constructor name should be same as class name
//--> Constructor will not written any value(not even void)
//--> Constructor will be invoked at the time of object creation

public class J14_s4StudentMain {

	public static void main(String[] args) {
		
//		// 1) assign values using reference variable
//		J14_s3Student stu1 = new J14_s3Student();
//		stu1.sid=1010;
//		stu1.sname="Johnson";
//		stu1.grade='A';
//		
//		stu1.display();
//		
//		// 2) Assigning values by using method
//		J14_s3Student stu2 = new J14_s3Student();
//		stu2.getValues(1011, "Mike", 'A');
//		stu2.display();
//		
		// 3) assigning values by using constructor
		J14_s3Student stu3 = new J14_s3Student(1012, "Mark", 'B');
		stu3.display();
		

	}

}
