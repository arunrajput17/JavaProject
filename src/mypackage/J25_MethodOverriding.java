package mypackage;

// Method Overriding : If subclass (child class) has the same method as declared in the parent class,
// it is known as method overriding in java

//--Rules for Java Method Overriding:
// 1) method must have same name as in the parent class
// 2) method must have same parameter as in the parent class

class Bank
{
	double rateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	double rateOfInterest()
	{
		return 10.5;
	}
}


class ICICI extends Bank
{
	double rateOfInterest()
	{
		return 9.7;
	}
}

class AXIS extends Bank
{
	double rateOfInterest()
	{
		return 8.5;
	}
}



public class J25_MethodOverriding {

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());
		
		ICICI icici = new ICICI();
		System.out.println(icici.rateOfInterest());
		
		AXIS axis = new AXIS();
		System.out.println(axis.rateOfInterest());

	}

}
