package lecture4;

import java.io.*; //for File
import java.util.*; //for Scanner

public class HoursWorked {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("hours"));
		while(input.hasNextLine()) {
			//process one person
			String line = input.nextLine();
			//process this line 
			processEmployee(line);
		}
	}
	
	public static void processEmployee(String line) {
		Scanner lineScan = new Scanner(line);
		int id = lineScan.nextInt(); //456
		String name = lineScan.next(); //Eric
		double sum = 0.0;
		int count = 0;
			
		while(lineScan.hasNextDouble()) {
			sum += lineScan.nextDouble();
			count++;
		}
			
		double average = sum / count;
		System.out.println(name + " (ID#" + id +
				") worked " + sum + " hours (" + 
				average + " hours/day)");
		
	}

}
