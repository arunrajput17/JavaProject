package mypackage;


public class J38_TypeCasting {

	public static void main(String[] args) {
		
		// Implicit casting : (large to small)
		int i = 65;
		
		System.out.println(i);
		
		char ch = (char) i;		// Type casting int variable to char variable
		
		System.out.println(ch);
		
		char ch2= 'R';
		System.out.println(ch2);
		int j = (int) ch2;		// Type casting char to int variable
		System.out.println(j);
		
		
		
		// Implicit casting : (small to large)
		// -- Implicit casting is done by compiler automatically
		// Byte(8 bit) -> Short(16 bit) -> int(32 bit) -> long(64 bit) -> float(32 bit) -> double(64 bit) 
		
		
		int b = 10;
		long L = b;			// Long is 64 bit and int is 32 bit
		System.out.println(L);
		
		

	}

}
