package mypackage;


// 1) Arithmetic operators --> + - */ %
// 2) Relational operators (Comparison operators) --> == < > <= >= !=
// 3) Logical operators --> && || !
// 4) increment/decrement operators --> ++ --
// 5) Assignment operators -->  =


public class J3_Operators {

	public static void main(String[] args) 
	{
		int a = 21;
		int b = 10;
		
		//Arithmetic operators --> + - */ %		
		System.out.println("------------------Arithmetic operators--------------------");
		System.out.println("Sum of a and b is :"+ a+b);		// if we don't use bracket then it will concatenate
		System.out.println("Sum of a and b is :"+ (a+b));
		System.out.println("Diff of a and b is :"+ (a-b));
		System.out.println("Mul of a and b is :"+ (a*b));
		System.out.println("Div of a and b is :"+ (a/b));
		System.out.println("Mod Div of a and b is :"+ (a%b));
		
		//Relational operators (Comparison operators) --> == < > <= >= !=
		// Always return boolean values
		System.out.println("------------------Relational operators--------------------");
		System.out.println(a==b);	//false
		System.out.println(a<b);	//false
		System.out.println(a>b);	//true
		System.out.println(a<=b);	//false
		System.out.println(a>=b);	//true
		System.out.println(a!=b);	//true
		
		
		//Logical operators --> && || !
		// this logical operator works between two boolean values
		boolean x = true;
		boolean y = false;
		
		System.out.println("------------------Logical operators--------------------");
		System.out.println(x && y);		//false
		System.out.println(x || y);		//true
		System.out.println(!x);			//false
		System.out.println(!y);			//true
		
		
		//increment/decrement operators --> ++ --
		System.out.println("------------------Increment/Decrement operators--------------------");
		int d = 10;
		d++;		//d=d+1
		System.out.println("Incrementing value of d by 1 : "+(d));
		
		int e = 20;
		e--;		//e=e-1
		System.out.println("Decrementing value of e by 1 : "+(e));
		

	}

}


