package lecture2;

import java.util.*;
import java.io.*;

public class ScannerTests {
	
	//the way we read from a keyboard is through the Scanner class 
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner kb = new Scanner (System.in); //System.in is the standard input from keyboard
		
		System.out.println("Enter 2 strings: ");
		String s1 = kb.next(); //if you want to read something 
		String s2 = kb.next();
		System.out.println(s1 + " " + s2 + s2);
		
		System.out.println("Enter a line: ");
		kb.nextLine(); //goes to the beginning of the next; this will eat the new line 
		System.out.println(kb.nextLine()); //will read a whole line until the next line
		
		
//      File f = new File("422cstuff");
//      Scanner infilesc = new Scanner (f);
//      System.out.println(infilesc.nextLine());}}
	}
	

}
