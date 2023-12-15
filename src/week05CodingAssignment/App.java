package week05CodingAssignment;
/*
 * 6.     Create a class named App that has a main method.
 */
public class App {

	public static void main(String[] args) {

		//6a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.
		
		AsteriskLogger atest = new AsteriskLogger();
		SpacedLogger stest = new SpacedLogger();
		
		//6b. Test both methods on both instances, passing in Strings of your choice.
		
		atest.log("Jersey");
		atest.error("Sweater");
		stest.log("Gorilla");
		stest.error("Orangutan");
	}//end of main

}//end of class
