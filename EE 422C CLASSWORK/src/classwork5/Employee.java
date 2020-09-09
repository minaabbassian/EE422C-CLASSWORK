package classwork5;

public class Employee {
	private double baseSalary = 42000;
	private int years;
	static int noOfEmployees;
	
	public Employee (int years) {
		this.years = years;
		noOfEmployees++;
	}

	/**
	 * @return the baseSalary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}

	/**
	 * @param baseSalary the baseSalary to set
	 */
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double getSalary() {
		return getBaseSalary();
	}
	
	public int getVacationDays() {
		return 10;
	}
	
	public String getVacationForm() {
		return "yellow";
	}

	/**
	 * @return the years
	 */
	public int getYears() {
		return years;
	}

	/**
	 * @param years the years to set
	 */
	public void setYears(int years) {
		this.years = years;
	}
	
	public double getLongevityBonus() {
		if (years > 5) {
			return 3000;
		}
		return 0;
	}
	
	public static double dollarsToRupees(double dollars	) {
		return dollars*65.5;
	}
	
}
