package week05CodingAssignment;
/*
 * 3.     Create two classes that implement the Logger interface
 * 3b.  SpacedLogger
 */

public class SpacedLogger implements Logger{

	/*
	 * 5. Implement the SpacedLogger methods:
	 */
	
	//5a. If the log method received “Hello” as an argument, it should print H e l l o
	
	@Override
	public void log(String z) {
		StringBuilder split = new StringBuilder();
		for(int i = 0; i < z.length(); i++) {
			split.append(z.charAt(i) + " ");
		}
		System.out.println(split.deleteCharAt(split.length() - 1));
	}	

	//5b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	@Override
	public void error(String z) {
		StringBuilder split = new StringBuilder();
		for(int i = 0; i < z.length(); i++) {
			split.append(z.charAt(i) + " ");
		}
		System.out.println("ERROR: " + split.deleteCharAt(split.length() - 1));
		
	}
	

	
	
}
