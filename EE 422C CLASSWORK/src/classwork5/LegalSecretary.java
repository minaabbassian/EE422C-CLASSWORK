//A class to represent legal secretaries
package classwork5;

public class LegalSecretary extends Secretary {

	public void fileLegalBriefs() {
		System.out.println("I could file all day!");
	}
	
	@Override 
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + 5000.0;
	}
	
}
