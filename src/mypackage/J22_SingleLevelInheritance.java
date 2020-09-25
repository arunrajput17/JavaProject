package mypackage;


//Inheritance : Acquiring all properties & behavior from one class to another class is called inheritance

//Parent/base class/super class
//Child class/sub class/derived class

//5 types of Inheritance:
//1) Single
//2) Multilevel
//3) Hierarchical
//4) Multiple
//5) Hybrid


class AA		//Parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class BB extends AA		// BB is child class, AA is parent class
{
	int b;
	void print()
	{
		System.out.println(b);
	}

}



public class J22_SingleLevelInheritance {

	public static void main(String[] args) {
		
		AA aobj = new AA();
		aobj.a=100;
		aobj.display();
		
		BB bobj = new BB();
		bobj.a=10;	//A
		bobj.b=20;	//B
		bobj.display();	//A
		bobj.print();	//B
		

	}

}
