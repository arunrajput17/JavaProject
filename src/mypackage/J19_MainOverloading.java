package mypackage;

// can we overload Main method---- the answer is yes

public class J19_MainOverloading {
	
	public void main(int x)		//1
	{
		System.out.println(x);
	}
	
	public void main(int x, int y)		//2
	{
		System.out.println(x+y);
	}

	public static void main(String[] args)
	{
		J19_MainOverloading om = new J19_MainOverloading();
		om.main(10);		// 1
		om.main(10, 20);		//2

	}	

}
