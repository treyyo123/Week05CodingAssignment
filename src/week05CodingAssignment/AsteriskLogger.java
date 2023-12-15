package week05CodingAssignment;
/*
 * 3.     Create two classes that implement the Logger interface
 * 3a.  AsteriskLogger
 */
public class AsteriskLogger implements Logger{

	/*
	 * 4.  Implement the AsteriskLogger methods:  
	 */

	//4a.  The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).
	 
	@Override
	public void log(String z) {
		System.out.println("***" + z + "***");
	}
	
	//4b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”.
	
	@Override
	public void error(String z) {
		String message = "***ERROR: " + z + "***";
		String asterisk = "*";
		System.out.println(asterisk.repeat(message.length()));
		System.out.println(message);
		System.out.println(asterisk.repeat(message.length()));
	}

}
