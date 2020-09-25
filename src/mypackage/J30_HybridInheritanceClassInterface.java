package mypackage;

// One parent -- two child - one child

class AH1
{
	void m1()
	{
		System.out.println("This is m1 method from AH1 Class");
	}
}

interface BH1
{
	void m2();
}

interface BH2
{
	void m3();
}





public class J30_HybridInheritanceClassInterface extends AH1 implements BH1,BH2
{
	public void m2()
	{
		System.out.println("This is m2 method from BH1 interface");
	}
	
	public void m3()
	{
		System.out.println("This is m3 method from BH2 interface");
	}

	public static void main(String[] args) {
		
		J30_HybridInheritanceClassInterface mi = new J30_HybridInheritanceClassInterface();
		mi.m1();
		mi.m2();
		mi.m3();
		

	}

}
