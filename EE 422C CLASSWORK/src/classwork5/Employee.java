//A class to represent employees in general 
package classwork5;

public class Employee {
	private int years; //number of years employee has worked 
	
	public Employee(int initialYears) {
		years = initialYears;
	}
	
	public int getYears() {
		return years;
	}
	
	public int getHours() {
		return 40; //works 40 hours/week
	}
	
	public double getSalary() {
		return 50000.0; //$50,000.00/year
	}
	
	public int getVacationDays() {
		return 10 + 2*years; //2 weeks' paid vacation
	}
	
	public String getVacationForm() {
		return "yellow"; //use the yellow form
	}
	
}
