package assistedPractice1;

public class TypeCasting {

	public static void main(String[] args) {
		
		// implicit
		System.out.println("--- Implicit---");
		char character='A';
		int numeric=character;
		System.out.println("The character data type  "+character+  " is converted to "+numeric +" integer data type");
		
		int integer=234;
		float float_Val=integer;
		System.out.println("The integer is "+integer+" converted to "+float_Val +" float data type "); 
		
		// explicit
		
		System.out.println("---Explicit---");
		
		double Double_Val=56.89;
		int Integer_Val=(int) Double_Val;
		System.out.println("The Doubled data type "+Double_Val+  " is converted to "+Integer_Val +" integer data type");
		character='6';
		byte byte_Val=(byte) character;
		System.out.println("The character data type  "+character+  " is converted to "+byte_Val+" byte data type");
	}

}
