//Displays changes in temperature from data in an input file
package lecture4;

import java.io.*; //for File
import java.util.*; //for Scanner

public class Temperatures {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("weather"));
		double prev = input.nextDouble(); //fencepost
		while(input.hasNext()) {
			if(input.hasNextDouble()) {
				double next = input.nextDouble();
				System.out.println(prev + " to " + next + ", change = " + (next - prev));
				prev = next;
			} else {
				input.next(); //throw away unwanted token
			}
		}
	}

}
