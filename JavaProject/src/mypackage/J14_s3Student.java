package mypackage;

public class J14_s3Student {
	
	int sid;
	String sname;
	char grade;
	
	
	// Creating Constructor
	J14_s3Student(int id, String name, char g) {
		sid=id;
		sname=name;
		grade=g;
	}
	
	
	
	// This method is used by second method of assigning values to variables
	void getValues(int id, String name, char g)
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	
	void display()
	{
		System.out.println(sid +"  "+sname+"  "+grade);
	}

}
