package lecture11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTester_2 {
	static final boolean DEBUG = true;
	public static void main(String [] args) throws FileNotFoundException   {
		
		Scanner sc = new Scanner(System.in);
		File f = new File("infilename");
		
		Scanner scf = null;
		
		// PART A
		// Closing resources in finally block
		try {
			scf = new Scanner(f);
			 int i = scf.nextInt();
		} catch (FileNotFoundException e) { // illustrating the case where infilename is not present
			System.out.println("Wrong file name! Using default -- /tmp/default.txt");
			scf = new Scanner(new File("/tmp/default.txt"));
		} finally {
			System.out.println("In finally 1");
			if (scf != null) {
				scf.close();
			}
		}
		
		// PART B
		// Catching Exception thrown in a user method
		try {
			readUntil0(sc); // catch NumberFormatException here and remove the offending number in sc
		} catch (InputMismatchException e) {
			System.out.println("Discarding bad token.");
			sc.next(); // discard bad token
		} catch (Exception e) {
			System.out.println("back in main after RunTimeException");
			// e.printStackTrace();
		}
		
		// PART C
		// Using Exceptions to keep going until satisfied
		int num = 1;
		while (num != 0) {
			try {
				System.out.print("In main: enter another int: ");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("try again");
				sc.next();
			}
		}
		
		// PART D
		// A method that throws an exception, and its method header
		thrower();
	}
	
	static void thrower () throws ArithmeticException { // optional throws, since ArithmeticException not CheckedException
		// throw new FileNotFoundException();
		throw new ArithmeticException();
	}
			
	static void readUntil0 (Scanner sc) {
		int num = 1;
		while (num != 0) {
			System.out.print("In readUntil0: Enter int: ");
			num = sc.nextInt();
			if (num == 1000) {
				throw new RuntimeException(); 
			}
		}
		System.out.println("Done");
	}
}
