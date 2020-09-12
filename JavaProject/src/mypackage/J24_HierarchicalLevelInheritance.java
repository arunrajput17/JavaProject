package mypackage;


class A2		//Parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B2 extends A2		// B2 is child class, A2 is parent class
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}

class C2 extends A2		// C2 is child class, A2 is parent of C2
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}




public class J24_HierarchicalLevelInheritance {

	public static void main(String[] args) {
		
		B2 bobj = new B2();
		bobj.a=10;
		bobj.b=20;
		bobj.display();
		bobj.print();
		
		C2 cobj = new C2();
		cobj.a=30;
		cobj.c=40;
		cobj.display();
		cobj.show();
		

	}

}
