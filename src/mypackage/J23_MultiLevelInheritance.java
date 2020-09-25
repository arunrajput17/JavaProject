package mypackage;


class A1		//Parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B1 extends A1		// B1 is child class, A1 is parent class
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}

class C1 extends B1		// C1 is child class, B1 is parent of C1
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}




public class J23_MultiLevelInheritance {

	public static void main(String[] args) {
		
		C1 cobj = new C1();
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		
		cobj.display();
		cobj.print();
		cobj.show();

	}

}
