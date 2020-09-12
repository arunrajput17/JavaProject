package accessModifier;

import mypackage.J31_AccessModifiers;

// Protected data we are accessing in another package, with extend only we can do the same


public class J31_s2AccessModifier extends J31_AccessModifiers
{

	public static void main(String[] args) {
		
		J31_s2AccessModifier amobj = new J31_s2AccessModifier();
		amobj.protectedData=22;
		amobj.protectedm1();

	}

}
