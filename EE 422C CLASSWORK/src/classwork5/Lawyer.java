//A class to represent lawyers.
package classwork5;

public class Lawyer extends Employee {
	
	public Lawyer(int years) {
		super(years); //calls Employee constructor
	}
	
	//overrides getVacationFrom method in Employee class
	@Override 
	public String getVacationForm() {
		return "pink";
	}
	
	//overrides getVacationDays from Employee class
	@Override
	public int getVacationDays() {
		return super.getVacationDays() + 5; //3 weeks vacation
	}
	
	public void sue() {
		System.out.println("I'll see you in court!");
	}
	
	//try to give lawyers $5000 for each year at the company
	public double getSalary() {
		return super.getSalary() + 5000*getYears();
	}

}
