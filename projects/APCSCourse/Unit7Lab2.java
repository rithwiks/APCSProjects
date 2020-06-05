/**
* This program creates 4 methods that change binary strings to decimal and hexes and decimals to binary strings and hexes.
* @author Rithwik Seth
*/
public class Unit7Lab2 {
        public static void main(String[] args) {
		//prints the outputs of the 4 methods
		System.out.println(binaryToDecimal("1101"));
		System.out.println(binaryToHex("1101"));
		System.out.println(decimalToBinary(13));
		System.out.println(decimalToHex(13));		
	}
	
	//This method turns a binary string to a decimal number
        //@param is a binary string
        //@return the decimal number
        //precondition binaryString is a string
        //postcondition returns the decimal number
        //@author Rithwik Seth	
	public static int binaryToDecimal( String binaryString ) {
		//uses Integer.parseInt to turn binary to decimal
		int decimal = Integer.parseInt(binaryString, 2);
		return decimal;
	}
	
	//This method turns a binary string to a hexadecimal
        //@param is a binary string
        //@return the hexadecimal
        //precondition binaryString is a string
        //postcondition returns the hexadecimal
        //@author Rithwik Seth
	public static String binaryToHex( String binaryString ) {
		//uses Long.toHexString and parseLong to turn binary to Hex
		return Long.toHexString( Long.parseLong( binaryString , 2 ) );
	}
	
	//This method turns a decimal number to a binary string
        //@param is a decimal number
        //@return the binary string
        //precondition decimal number is an int
        //postcondition returns the binary string
        //@author Rithwik Seth
	public static String decimalToBinary( int decimalNumber ) {
		//loops to find the binary from the given decimal number
		int a = 0;
		String x = "";
		while ( decimalNumber > 0 ) {
			
			a = decimalNumber % 2;
			x = x + "" + a;
			decimalNumber = decimalNumber / 2;
		}
	
		return x;
	}
	
	//This method turns a decimal number to a hexadecimal
        //@param is a decimal number
        //@return the hexadecimal
        //precondition decimal number is an int
        //postcondition returns the hexadecimal
        //@author Rithwik Seth
	public static String decimalToHex( int decimalNumber ) {
		//uses Integer.toHexString to turn a decimal number to a Hex
		String hex = Integer.toHexString( decimalNumber );
		return hex;
	}
}
