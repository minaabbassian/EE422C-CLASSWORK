package lecture4;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileInputTester {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File infile = new File("myinput");
		
		//the Scanner object, is going to read a file object 
		Scanner filereader = new Scanner(infile);
		
		while(filereader.hasNextLine()) { //print out line by line
			System.out.println(filereader.nextLine());
		}
	}

}
