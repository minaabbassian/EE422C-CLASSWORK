//modify our previous Hours program to use a PrintStream to send its output 
//to the file hours_out.txt

package lecture4;

import java.io.*; //for File
import java.util.*; //for Scanner

public class Hours2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("hours"));
		PrintStream out = new PrintStream(new File("hours_out"));
		while(input.hasNextLine()) {
			//process one person
			String line = input.nextLine();
			//process this line 
			processEmployee(out, line);
		}
	}
	
	public static void processEmployee(PrintStream out, String line) {
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
		out.println(name + " (ID#" + id +
				") worked " + sum + " hours (" + 
				average + " hours/day)");
		
	}

}
