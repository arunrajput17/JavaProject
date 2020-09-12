package accessModifier;

import mypackage.J31_AccessModifiers;

// Public data we are accessing in another package without extend


public class J31_s3AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		J31_AccessModifiers ampuobj = new J31_AccessModifiers();
		ampuobj.publicData=101;
		ampuobj.publicm1();

	}

}
