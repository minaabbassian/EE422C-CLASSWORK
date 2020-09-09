//A class to represent secretaries. 
package classwork5;

public class Secretary extends Employee {

	//secretaries' years of employment are not tracked
	//they do not earn extra vacation for years worked
	public Secretary() {
		super(0);
	}
	
	public void takeDictation(String text) {
		System.out.println("Taking dictation of text: " + text);
	}
}
