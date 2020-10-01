package lecture11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTester_1 {
	static final boolean DEBUG = true;
	public static void main(String [] args) throws FileNotFoundException   {
		try {
			ExceptionExample(); // Illustrates multiple exceptions
		} catch (Exception e) {}
		System.out.println("World.");
		System.exit(0);  // Do not use in assignments
		System.out.println("Hello World.");
	}
	
	static void ExceptionExample() {
		int a = 0, b = 0, c = 0, n = 3; // change n to non-zero to go through other exceptions
		Scanner in = new Scanner(System.in);
		
		try {
			// code that performs function in try block
			String s;
			a = 356 / n;
			System.out.print("Enter an int: "); 
			s = in.next(); // read next token
			b = Integer.parseInt(s); // put in a non-integer to throw NumberFormatException
			System.out.print("Enter another int: ");
			int d = in.nextInt(); // put in a non-integer to catch a 'generic' exception
		} catch (ArithmeticException e1) {  
			System.out.println("Div by 0 attempted");
			a = 0;
		} catch (NumberFormatException e2) { // catch Exception
			System.out.println("Invalid number in String");
			e2.printStackTrace();
			b = 0;
			throw new ArithmeticException("Junk ignore"); // rethrow Exception
		} catch (Exception e) {
			System.out.println("generic exception caught");
			e.printStackTrace();
		} finally {
			c = a + b;
			System.out.println("Finally block: c = " + c);
		}
	}
}
