package mypackage;

// Two parents and One child

interface AI1
{
	int x =100;
	void m1();
}

interface AI2
{
	int y = 200;
	void m2();
}



public class J29_MultipleInheritanceClassInterface implements AI1, AI2
{
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		
		J29_MultipleInheritanceClassInterface test = new J29_MultipleInheritanceClassInterface();
		
		test.m1();
		test.m2();
		

	}

}
