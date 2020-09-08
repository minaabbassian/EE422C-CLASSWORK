package lecture4;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileInputTester {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File infile = new File("myinput");
		
		//the Scanner object, is going to read a file object 
		Scanner filereader = new Scanner(infile);
		
		//constructing a Scanner object to read console input 
		Scanner console = new Scanner(System.in);
		System.out.print("How old are you? "); //prompt
		if(console.hasNextInt()) { //will not crash!!!!!!
			int age = console.nextInt(); //user input
			System.out.println("You typed " + age);
		} else {
			System.out.println("You didn't type an integer.");
		}
		
		while(filereader.hasNextLine()) { //print out line by line
			System.out.println(filereader.nextLine());
		}
	}

}
