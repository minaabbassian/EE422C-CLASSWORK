package lecture4;

import java.util.*;   // so that I can use Scanner
import java.io.*;     // for File


public class PrintStreamTests {

	public static void main(String[] args) throws FileNotFoundException {

		PrintStream out;

		out = System.out;
		out.println(" printing to console ");

		String filename = "output.txt";
		out = new PrintStream(new File(filename));
		out.println(" printing to " + filename);
	}
}


