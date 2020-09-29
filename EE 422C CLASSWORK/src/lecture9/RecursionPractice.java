package lecture9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecursionPractice {
	
	public static void main(String[] args) throws FileNotFoundException {
		printStars(3);
		System.out.println(pow(3, 4));
		printBinary(42);
		System.out.println();
		String s = "madam";
		System.out.println(isPalindrome(s));
		
		File text = new File("reverse.txt");
		Scanner scan = new Scanner(text);
		reverseLines(scan);
		
		//permute("MARTY");
	}
	
	
	//prints a line containing the given number of starts
	//Precondition: n >= 0
	public static void printStars(int n) {
		//base case: just end the line of output
		if(n == 0) {
			System.out.println();
		} else {
			//recursive case: print one more star
			System.out.print("*");
			printStars(n-1);
		}
	}

	
	//pow
	//Returns base ^ exponent
	//Precondition: exponent >= 0
	public static int pow(int base, int exponent) {
		//base case: any number to 0th power is 1
		if(exponent == 0) {
			return 1;
		} else {
			//recursive case: x^y = x*x^(y-1)
			return base * pow(base, exponent-1);
		}
	}
	
	
	//printBinary
	//Prints the given integer's binary representation
	//Precondition: n >= 0
	public static void printBinary(int n) {
		if(n < 0) {
			//recursive case for negative numbers
			System.out.print("-");
			printBinary(-n);
		} else if(n < 2) {
			//base case: same as base 10
			System.out.print(n);
		} else {
			printBinary(n/2); //this stuff will go before
			printBinary(n%2); //last digit will go in the end
		}
	}
	
	
	//isPalindrome
	//Returns true if the given string reads the same 
	//forwards as backwards.
	//Trivially true for empty or 1-letter strings.
	public static boolean isPalindrome(String s) {
		if(s.length() < 2)
			return true; //base case
		else {
			char first = s.charAt(0);
			char last = s.charAt(s.length() - 1);
			if(first != last)
				return false;
			//recursive case
			String middle = s.substring(1, s.length()-1);
			return isPalindrome(middle);
				
		}
	}
	
	
	//reverseLines
	//psuedocode:
	//	reads a line L from the file
	//	print the rest of the lines in reverse order
	//	print the line L 
	public static void reverseLines(Scanner input) {
		if(input.hasNextLine()) {
			//recursive case
			String line = input.nextLine();
			reverseLines(input);
			System.out.println(line);
		}
	}
	
	
	//permute
	//Outputs all permutations of the given string
	public static void permute(String s) {
		permute(s, "");
	}
	
	private static void permute(String s, String chosen) {
		if(s.length() == 0) {
			//base case: no more choices left to be made
			System.out.println(chosen);
		} else {
			//recursive case: choose each possible next letter 
			for(int i = 0; i < s.length(); i++) {
				String ch = s.substring(i, i+1); //choose 
				String rest = s.substring(0, i) + s.substring(i+1); //remove 
				permute(rest, chosen+ch); //explore
			}
		}
	}
				
	
	
	
}




